
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

import com.perscholas.hibernate_validation_repository.models.Course;

import com.perscholas.hibernate_validation_repository.repositoryIn.CourseRepository;


@Controller
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;

	@GetMapping(value = { "/allCourses" })
	public String getAllCourses(Model model) throws ClassNotFoundException, IOException, SQLException {
		List<Course> allCourses = courseRepository.getAllCourse();
		model.addAttribute("allCourses", allCourses);
		return "Course";
	}

	@PostMapping("/addCourse")
	public String createCourse(@Valid @ModelAttribute("course") Course c, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "CreateCourse";
		}

		Integer courseId = courseRepository.createCourse(c);
		if (courseId == -1) {
			model.addAttribute("errorMessage", "Create Course failed.");
			return "CreateCourse";
		}
		return "redirect:allCourses";
	}

	@GetMapping("/courseForm")
	public String showCourseForm(Model model) throws SQLException {

		model.addAttribute("course", new Course());
		return "CreateCourse";
	}

}
