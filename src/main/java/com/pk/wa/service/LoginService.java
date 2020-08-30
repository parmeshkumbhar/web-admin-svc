package com.pk.wa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.wa.model.User;
import com.pk.wa.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepository;

	public boolean isValidUser(User user) {
		System.out.println("UserName : "+user.getUserName());
		System.out.println("Password : "+user.getPassword());
		System.out.println("Role : "+user.getRole());
		if (user != null) {
			User validUser = loginRepository.findByUserName(user.getUserName());
			System.out.println("valid UserName : "+user.getUserName());
			System.out.println("valid Password : "+user.getPassword());
			System.out.println("valid Role : "+user.getRole());
			if (validUser != null && validUser.getPassword().equals(user.getPassword())
					&& validUser.getRole().equals(user.getRole())) {
				return true;
			}
		}
		return false;
	}
}
