package com.tjulab.onlinemall.order.dao;

import com.tjulab.onlinemall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 14:27:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
