package com.tjulab.onlinemall.product.dao;

import com.tjulab.onlinemall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 13:07:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
