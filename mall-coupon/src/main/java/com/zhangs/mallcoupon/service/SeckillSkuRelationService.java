package com.zhangs.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangs.mallcommon.utils.PageUtils;
import com.zhangs.mallcoupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 16:57:23
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

