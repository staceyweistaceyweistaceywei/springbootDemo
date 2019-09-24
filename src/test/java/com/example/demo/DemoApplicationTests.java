package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
//		测试类实例化过程，哪些先被创建
//		SuperC superC = new SuperC();
//		SonC sonC = new SonC();

//		测试CountDownatch
		TestCountDownLantch.tstCountDownLantch();

	}

}
