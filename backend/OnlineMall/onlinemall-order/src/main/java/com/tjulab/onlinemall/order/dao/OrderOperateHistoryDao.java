package com.tjulab.onlinemall.order.dao;

import com.tjulab.onlinemall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 14:27:53
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
