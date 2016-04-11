package com.alibaba.webx.MyWebxTest.myWebX.module.service;

import java.util.List;

import com.alibaba.webx.MyWebxTest.myWebX.module.domain.EventBaseInfoDO;

public interface EventService {
	/**
	 * 创建活动
	 * @return
	 */
	public Long createEvent(EventBaseInfoDO eventBaseInfoDO);
	
	/**
	 * 展示所有活动
	 */
	public List<EventBaseInfoDO> getAllEvents();

}
