package org.dnyanyog.controller;

import java.sql.SQLException;
import java.util.List;

import org.dnyanyog.dto.User;
import org.dnyanyog.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class AuthenticationController {
	
	@Autowired	
	User user;
	
	
	@GetMapping("/name/{username}")
	public String name(@PathVariable String username) {
		return new StudentService().getName(username);
	}

	@GetMapping("/email/{username}")
	public String email(@PathVariable String username) {
		return new StudentService().getEmail(username);
	}

	@GetMapping("/mobile/{username}")
	public String mobile(@PathVariable String username) {
		return new StudentService().getMobile(username);
	}

	@GetMapping("/getuser")
	public List<String> display() throws SQLException {

		return new StudentService().getname();
	}
	
	//Fix: Added this method
	@GetMapping(path="/user", produces = {"application/json" , "application/xml"})
	public User getuser() {
		user.setName("Shree");
		user.setEmail("Shree@gmail.com");
		user.setMobile("4135143131");
		
		return user;
	}
}
