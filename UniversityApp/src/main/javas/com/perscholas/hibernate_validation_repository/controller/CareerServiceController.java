package com.perscholas.hibernate_validation_repository.controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import com.perscholas.hibernate_validation_repository.models.CareerService;

import com.perscholas.hibernate_validation_repository.repositoryIn.CareerServiceRepository;

@Controller
public class CareerServiceController {

	@Autowired
	private CareerServiceRepository careerSRepository;
	
	@GetMapping(value = {"/allCareerServices"})
	public String getAllCareerService(Model model) throws ClassNotFoundException, 
		IOException, SQLException {
			List<CareerService> allCareerService = careerSRepository.getAllCareerService();
			model.addAttribute("allCareerService", allCareerService);
		return "CareerService";
	}
	
	
	@PostMapping("/addCareerService")
	public String createCareerService(@Valid @ModelAttribute("career") 
		CareerService careerS, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "CreateCareerService";
		}
		
		Integer CareerId = careerSRepository.createCareerService(careerS);
		if (CareerId == -1) {
			model.addAttribute("errorMessage", "Create careerservice failed.");
			return "CreateCareerService";
		}
		System.out.println("CareerService ID: " + CareerId);
		return "redirect:allCareerServices";
	}
	
	
	@GetMapping("/careerForm")
	public String showCareerForm(Model model) throws SQLException {

		model.addAttribute("career", new CareerService());
		return "CreateCareerService";
	}
	
	
}