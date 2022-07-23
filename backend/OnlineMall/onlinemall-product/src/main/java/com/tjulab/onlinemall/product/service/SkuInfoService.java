package com.tjulab.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tjulab.common.utils.PageUtils;
import com.tjulab.onlinemall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 13:07:58
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

