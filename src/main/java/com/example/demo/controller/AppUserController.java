package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AppUser;
import com.example.demo.repository.AppUserRepository;

@RestController
public class AppUserController {

	@Autowired
	private AppUserRepository appUserRepository;
	
    @RequestMapping("/appuser")
    public List<AppUser> appUser() {
    	return (List<AppUser>) appUserRepository.findAll();
    }
}
