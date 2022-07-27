package com.tjulab.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tjulab.common.utils.PageUtils;
import com.tjulab.onlinemall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 13:07:58
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查找所有的商品分类以及子分类，以树形结构组装
     * @return
     */
    List<CategoryEntity> listWithTree();
}

