package com.alibaba.webx.MyWebxTest.myWebX.module.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.alibaba.webx.MyWebxTest.myWebX.module.domain.EventBaseInfoDO;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.EventService;

public class CreateEventAction {
	
	@Autowired
	private EventService eventService;

	// public void doCreate(@Param("eventName") String eventName,
	// @Param("eventType") String eventType,
	// @Param("eventBrand") String eventBrand, Navigator na) {
	// System.out.println("++++++++++ eventName:" + eventName);
	// System.out.println("++++++++++ eventType:" + eventType);
	// System.out.println("++++++++++ eventBrand:" + eventBrand);
	// na.forwardTo("index");
	// }

	public void doCreate(@FormGroup(name = "eventBaseInfoDO") EventBaseInfoDO eventBaseInfoDO, Navigator na, Context context) {
		System.out.println("++++++++++ title:" + eventBaseInfoDO.getTitle());
		System.out.println("++++++++++ eventType:" + eventBaseInfoDO.getEventType());
		System.out.println("++++++++++ brandId:" + eventBaseInfoDO.getBrandId());
		/*
		 * 校验参数
		 */
		if (eventBaseInfoDO.getTitle() == null || "".equals(eventBaseInfoDO.getTitle())) {
			context.put("erroMsg", "请填写活动名称！");
			na.forwardTo("error");
		}
		if ("线上".equals(eventBaseInfoDO.getEventType().trim()) && "线下".equals(eventBaseInfoDO.getEventType().trim())) {
			context.put("erroMsg", "未知的活动类型！请正确选择！");
			na.forwardTo("error");
		}
		if (eventBaseInfoDO.getBrandId() != 101 && eventBaseInfoDO.getBrandId() != 102) {
			context.put("erroMsg", "未知的活动品牌！");
			na.forwardTo("error");
		}
		/*
		 * 存DB
		 */
		int result = eventService.createEvent(eventBaseInfoDO).intValue();
		if (result <= 0) {
			context.put("erroMsg", "创建活动失败！存储数据库异常！");
			na.forwardTo("error");
		}
		context.put("successMsg", "创建活动成功！");
		na.forwardTo("success");
	}

}
