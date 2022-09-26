package com.zhangs.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangs.mallcommon.utils.PageUtils;
import com.zhangs.mallorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 16:39:04
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

