package com.zhangs.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangs.mallcommon.utils.PageUtils;
import com.zhangs.mallproduct.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 16:01:43
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

