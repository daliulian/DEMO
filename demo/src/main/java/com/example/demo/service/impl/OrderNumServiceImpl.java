package com.example.demo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TestDaoMapper;
import com.example.demo.service.OrderNumService;
import org.springframework.util.StringUtils;

@Service
public class OrderNumServiceImpl implements OrderNumService,CommandLineRunner {
    //存放当前最大的尾号
	private Map<String, Long> orderMap;
	@Autowired
	TestDaoMapper testDaoMapper;
	
	/**
	 * 初始化方法。项目启动时去执行
	 */
	@Override
	public void run(String... args) throws Exception {
		orderMap=new HashMap<>();
		Date date=new Date();
		
		SimpleDateFormat format=new SimpleDateFormat("YYYYMMdd");
		String str=format.format(date);
		System.out.println(str);
		//查询当日最大数
		String maxNum=testDaoMapper.queryBigNum(str);
		if(StringUtils.isEmpty(maxNum)) {
			//当天第一单
			str=str+"0001";
			orderMap.put("orderNum", Long.valueOf(str));
		}else {
			//当前启动最大单号
			orderMap.put("orderNum", Long.valueOf(maxNum)+1);
		}
		System.out.println(orderMap.get("orderNum"));
		
	}
	
	
 	@Override
	public String getOrderNum() {
 		String orderNum;
		synchronized (orderMap) {
			orderNum=orderMap.get("orderNum").toString();
			orderMap.put("orderNum", orderMap.get("orderNum")+1);
			System.out.println(orderNum);
		}
		return orderNum;
	}

	

}
