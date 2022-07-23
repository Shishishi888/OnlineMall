package com.tjulab.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tjulab.common.utils.PageUtils;
import com.tjulab.onlinemall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 13:07:58
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

