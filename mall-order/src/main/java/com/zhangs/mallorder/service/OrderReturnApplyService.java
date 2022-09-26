package com.zhangs.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangs.mallcommon.utils.PageUtils;
import com.zhangs.mallorder.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 16:39:05
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

