package com.zhangs.mallorder.dao;

import com.zhangs.mallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 16:39:04
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
