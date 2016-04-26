package com.k4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k4.dao.UserDao;
import com.k4.entity.User;

@RestController
@CrossOrigin("*")
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
	
	@RequestMapping(path = "/circleElem", produces = { MediaType.APPLICATION_JSON })
	public Map<String, Long> circleElem(){
		Map<String, Long> data = new HashMap<>();
		data.put("data", Math.round(Math.random() * 100) + 1);
		return data;
	}
	
	@RequestMapping(path = "/colorElem", produces = { MediaType.APPLICATION_JSON })
	public Map<String, Long> colorElem(){
		Map<String, Long> data = new HashMap<>();
		data.put("data", Math.round(Math.random() * 255));
		return data;
	}
}
