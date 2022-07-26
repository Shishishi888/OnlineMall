package com.tjulab.onlinemall.member.controller;

import java.util.Arrays;
import java.util.Map;

// import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.tjulab.onlinemall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tjulab.onlinemall.member.entity.MemberEntity;
import com.tjulab.onlinemall.member.service.MemberService;
import com.tjulab.common.utils.PageUtils;
import com.tjulab.common.utils.R;



/**
 * 会员
 *
 * @author ShiYang
 * @email Shishishi996@163.com
 * @date 2022-07-23 14:17:35
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    CouponFeignService couponFeignService;

    /**
     * 测试远程调用
     * @return
     */
    @RequestMapping("/coupons")
    public R testFeign() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("Shishi");
        R memberCoupons =  couponFeignService.getMemberCoupons();
        return R.ok().put("member", memberEntity).put("coupons", memberCoupons);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
