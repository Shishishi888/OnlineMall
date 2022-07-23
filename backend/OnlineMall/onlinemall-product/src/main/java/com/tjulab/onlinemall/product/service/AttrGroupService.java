package com.tjulab.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tjulab.common.utils.PageUtils;
import com.tjulab.onlinemall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 13:07:58
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

