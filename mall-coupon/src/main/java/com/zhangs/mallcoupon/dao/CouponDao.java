package com.zhangs.mallcoupon.dao;

import com.zhangs.mallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 16:57:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
