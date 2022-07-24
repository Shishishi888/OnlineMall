package com.tjulab.onlinemall.member.feign;

import com.tjulab.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("onlinemall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/getMemberCoupons")
    public R getMemberCoupons();
}
