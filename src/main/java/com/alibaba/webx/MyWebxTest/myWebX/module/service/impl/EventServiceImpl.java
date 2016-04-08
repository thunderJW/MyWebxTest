package com.alibaba.webx.MyWebxTest.myWebX.module.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.webx.MyWebxTest.myWebX.module.domain.EventBaseInfoDO;
import com.alibaba.webx.MyWebxTest.myWebX.module.presistent.EventBaseInfoDOMapper;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.EventService;

@Service("eventService")
public class EventServiceImpl implements EventService {
	@Autowired
	private EventBaseInfoDOMapper eventBaseInfoDOMapper;

	@Override
	public Long createEvent(EventBaseInfoDO eventBaseInfoDO) {
		return eventBaseInfoDOMapper.createEvent(eventBaseInfoDO);
	}

}
