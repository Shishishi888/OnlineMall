package com.tjulab.onlinemall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tjulab.common.utils.PageUtils;
import com.tjulab.common.utils.Query;

import com.tjulab.onlinemall.product.dao.CategoryDao;
import com.tjulab.onlinemall.product.entity.CategoryEntity;
import com.tjulab.onlinemall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    // @Autowired
    // CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 查找所有的商品分类以及子分类，以树形结构组装
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 1. 查出所有分类
        List<CategoryEntity> categoryEntityList = baseMapper.selectList(null);

        // 2. 组装成父子树形结构
        // 查出所有的一级分类
//        List<CategoryEntity> level1Menus = categoryEntityList.stream().filter((categoryEntity)->{
//            return categoryEntity.getParentCid() == 0;
//        }).collect(Collectors.toList());

        List<CategoryEntity> level1Menus = categoryEntityList.stream().filter(categoryEntity->
            categoryEntity.getParentCid() == 0
        ).map((menu)->{
            menu.setChildren(getChildren(menu, categoryEntityList));
            return menu;
        }).sorted((menu1, menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return level1Menus;
    }

    @Override
    public void removeMenusByIds(List<Long> asList) {
        // TODO 检查即将被删除的菜单是否被其他地方引用

        baseMapper.deleteBatchIds(asList);  // 逻辑删除
    }

    /**
     * 递归查找所有商品分类的子分类
      * @param root
     * @param all
     * @return
     */
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return children;
    }
}