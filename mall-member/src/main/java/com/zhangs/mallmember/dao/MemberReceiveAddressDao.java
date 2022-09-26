package com.zhangs.mallmember.dao;

import com.zhangs.mallmember.entity.MemberReceiveAddressEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收货地址
 * 
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 17:10:04
 */
@Mapper
public interface MemberReceiveAddressDao extends BaseMapper<MemberReceiveAddressEntity> {
	
}
