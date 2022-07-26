package com.tjulab.onlinemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tjulab.common.utils.PageUtils;
import com.tjulab.onlinemall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 14:27:53
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

