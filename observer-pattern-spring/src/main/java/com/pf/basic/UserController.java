package com.pf.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo1")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(value="register")
	public String register(UserBean userBean) {
		userService.register(userBean);
		return "注册成功";
	}
}
