package com.k4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k4.dao.UserDao;
import com.k4.entity.User;

@RestController
@SpringBootApplication
public class BizCordApplication {

	@Autowired
	UserDao userDao;
	
	public static void main(String[] args) {
		System.out.println ("unko!");
		
		
		SpringApplication.run(BizCordApplication.class, args);
	}
	
	public List<User> selectAll(){
		return userDao.selectAll();
	}
	
	@RequestMapping("/")
	public List<User> chinko(){
		return userDao.selectAll();
	}
	
}
