package com.zhangs.mallmember.dao;

import com.zhangs.mallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 17:10:04
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
