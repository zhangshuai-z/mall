package com.zhangs.mallcoupon.dao;

import com.zhangs.mallcoupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 16:57:24
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
