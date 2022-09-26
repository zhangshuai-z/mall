package com.zhangs.mallproduct.dao;

import com.zhangs.mallproduct.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 16:01:43
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
