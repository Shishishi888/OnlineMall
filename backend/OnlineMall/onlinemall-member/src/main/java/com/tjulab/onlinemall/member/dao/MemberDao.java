package com.tjulab.onlinemall.member.dao;

import com.tjulab.onlinemall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 14:17:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
