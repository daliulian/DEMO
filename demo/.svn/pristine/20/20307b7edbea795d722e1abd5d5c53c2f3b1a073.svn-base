package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OrderNumService;

@RestController
@RequestMapping("")
public class OrderNumController {
	@Autowired
	OrderNumService OrderNumService;
	
	
	@RequestMapping("orderNum")
	public String getOrderNum() {
		String orderNum= OrderNumService.getOrderNum();
		return orderNum;
	}
	
}
