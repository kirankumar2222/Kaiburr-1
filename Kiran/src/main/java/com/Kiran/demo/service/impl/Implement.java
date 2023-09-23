package com.Kiran.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Kiran.demo.Repository.InfoRepository;
import com.Kiran.demo.model.Model;
import com.Kiran.demo.service.Service;


@org.springframework.stereotype.Service
public class Implement implements Service{

	@Autowired
	InfoRepository infoRepository;


	public Implement(InfoRepository infoRepository) {
		this.infoRepository = infoRepository;
	}

	@Override
	public String createJob(Model model) {
		infoRepository.save(model);
		return "Success";
	}

	@Override
	public String updateJob(Model model) {
		infoRepository.save(model);
		return "Success";
	}

	@Override
	public String deleteJob(String id) {
		infoRepository.deleteById(id);
		return "Success";
	}

	@Override
	public Model getJobDetials(String id) {
		return infoRepository.findById(id).get();
	}

	@Override
	public List<Model> getJobAllDetials() {
		return infoRepository.findAll();
	}

}
