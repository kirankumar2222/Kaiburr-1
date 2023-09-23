package com.Kiran.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Kiran.demo.model.Model;
import com.Kiran.demo.service.Service;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/kaiburr")
public class Controller{

	@Autowired
	Service service;

	public Controller(Service service) {
		this.service = service;
	}
	
	@GetMapping("{id}")
	public Model getJobDetials(@PathVariable("id") String id) {
		return service.getJobDetials(id);
	}

	@GetMapping
	public List<Model> getJobAllDetials() {
		return service.getJobAllDetials();
	}

	@PostMapping
	public String createjob(@RequestBody Model model) {
		service.createJob(model);
		return "user created successfully";
	}

	@PutMapping
	public String updateJob(@RequestBody Model model) {
		service.updateJob(model);
		return "Info Updated Successfully";
	}

	@DeleteMapping("{id}")
	public String deleteJob(@PathVariable("id") String id) {
		service.deleteJob(id);
		return "Info Deleted Successfully";
	}
}
