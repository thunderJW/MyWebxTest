package com.alibaba.webx.MyWebxTest.myWebX.module.screen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.webx.MyWebxTest.myWebX.module.domain.EventBaseInfoDO;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.EventService;

public class EventHome {
	@Autowired
	private EventService eventService;
	
	public void execute(Context context) {
		/*
		 * 展示所有活动
		 */
		List<EventBaseInfoDO> events = eventService.getAllEvents();
		context.put("events", events);
	}

}
