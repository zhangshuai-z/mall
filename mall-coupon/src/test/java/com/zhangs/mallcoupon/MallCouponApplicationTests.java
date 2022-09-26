package com.zhangs.mallcoupon;

import com.zhangs.mallcoupon.entity.CouponEntity;
import com.zhangs.mallcoupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallCouponApplicationTests {

    @Autowired
    CouponService couponService;

    @Test
    void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("1000元");
        couponService.save(couponEntity);
        System.out.println("添加成功");
    }

}
