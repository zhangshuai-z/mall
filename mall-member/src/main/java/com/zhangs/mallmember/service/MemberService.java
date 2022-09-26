package com.zhangs.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangs.mallcommon.utils.PageUtils;
import com.zhangs.mallmember.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 17:10:04
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

