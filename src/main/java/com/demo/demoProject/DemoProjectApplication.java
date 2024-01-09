package com.demo.demoProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}
@Autowired
UserRepo userRepo;

	@GetMapping("/demo")
	public String demo(){
		return "Hello demo world............";
	}
	@PostMapping("/user")
	public ResponseEntity<?> userSave(@RequestBody UserModel userModel){
	return 	ResponseEntity.ok(userRepo.saveAndFlush(userModel));
	}

}
