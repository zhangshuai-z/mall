package com.zhangs.mallproduct.dao;

import com.zhangs.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 16:01:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
