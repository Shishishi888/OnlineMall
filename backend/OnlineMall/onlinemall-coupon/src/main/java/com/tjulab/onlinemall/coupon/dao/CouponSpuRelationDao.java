package com.tjulab.onlinemall.coupon.dao;

import com.tjulab.onlinemall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 13:59:16
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
