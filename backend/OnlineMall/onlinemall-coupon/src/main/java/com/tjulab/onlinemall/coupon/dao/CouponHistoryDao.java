package com.tjulab.onlinemall.coupon.dao;

import com.tjulab.onlinemall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 13:59:16
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}