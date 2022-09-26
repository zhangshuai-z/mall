package com.zhangs.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangs.mallcommon.utils.PageUtils;
import com.zhangs.mallmember.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author zhangs
 * @email zhangs@gmail.com
 * @date 2022-09-26 17:10:04
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

