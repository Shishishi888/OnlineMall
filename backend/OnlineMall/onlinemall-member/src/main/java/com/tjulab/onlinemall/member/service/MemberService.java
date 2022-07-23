package com.tjulab.onlinemall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tjulab.common.utils.PageUtils;
import com.tjulab.onlinemall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 14:17:35
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

