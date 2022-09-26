package com.zhangs.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangs.mallcommon.utils.PageUtils;
import com.zhangs.mallware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 17:17:37
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

