package com.zhangs.mallware.dao;

import com.zhangs.mallware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 17:17:36
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
