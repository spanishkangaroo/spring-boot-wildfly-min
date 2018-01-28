package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;

@RestController
public class CompanyController {

	@Autowired
	private CompanyRepository companyRepository;
	
    @RequestMapping("/company")
    public List<Company> company() {
    	return (List<Company>) companyRepository.findAll();
    }
}
