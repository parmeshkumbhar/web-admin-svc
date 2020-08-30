package com.pk.wa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.wa.model.User;
import com.pk.wa.service.LoginService;

@RestController
@RequestMapping("/api/v1")
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@PostMapping("/isValidUser")
	public boolean isValidUser(@RequestBody User user) {
		return loginService.isValidUser(user);
	}
}
