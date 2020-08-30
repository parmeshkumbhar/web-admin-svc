package com.pk.wa.repository;

import org.springframework.data.repository.CrudRepository;

import com.pk.wa.model.User;

public interface LoginRepository extends CrudRepository<User, Integer>{
	
	User findByUserName(String userName);
}
