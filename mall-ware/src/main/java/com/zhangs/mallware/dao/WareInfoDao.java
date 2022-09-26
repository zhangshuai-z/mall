package com.zhangs.mallware.dao;

import com.zhangs.mallware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 17:17:37
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
