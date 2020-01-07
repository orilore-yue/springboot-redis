package com.orilore;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.orilore.redis.RedisTool;

@SpringBootTest
public class RedisTest {
	
	@Resource
	private RedisTool tool;
	@Test
	public void set() {
		tool.set("redis_key", "redis_vale");
	}
	
	@Test
	public void get() {
		String value = tool.get("redis_key");
		System.out.println(value);
	}
	
}
