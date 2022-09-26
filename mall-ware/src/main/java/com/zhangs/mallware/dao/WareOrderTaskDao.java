package com.zhangs.mallware.dao;

import com.zhangs.mallware.entity.WareOrderTaskEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 * 
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 17:17:37
 */
@Mapper
public interface WareOrderTaskDao extends BaseMapper<WareOrderTaskEntity> {
	
}
