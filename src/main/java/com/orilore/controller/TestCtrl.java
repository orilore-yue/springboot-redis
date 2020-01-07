package com.orilore.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.redis.RedisTool;

@RestController
@RequestMapping("/redis")
public class TestCtrl {
	@Resource
	private RedisTool tool;
	
	@RequestMapping("/write")
	public boolean write(String k,String v) {
		return tool.set(k, v);
	}
	
	@RequestMapping("/read")
	public String read(String k) {
		String v = tool.get(k);
		return v;
	}
}
