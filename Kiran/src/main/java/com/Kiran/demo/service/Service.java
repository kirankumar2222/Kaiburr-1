package com.Kiran.demo.service;

import java.util.List;

import com.Kiran.demo.model.Model;

public interface Service {

	public String createJob(Model model);
	public String updateJob(Model model);
	public String deleteJob(String id);
	public Model getJobDetials(String id);
	public List<Model> getJobAllDetials();
}
