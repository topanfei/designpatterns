package com.pf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pf.basic.UserBean;
import com.pf.basic.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringApplicationTests {

	@Autowired
	private UserService userService;
	
	
	@Test
	public void userRegisterEventTest() {
		userService.register(new UserBean("张三", "123456"));
	}

}

