package com.perscholas.hibernate_validation_repository.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.perscholas.hibernate_validation_repository.models.Register;
import com.perscholas.hibernate_validation_repository.repositoryIn.UserRepository;

@Controller
public class RegisterController {

	@Autowired
	UserRepository userRepository;

	@GetMapping({ "/", "login" })
	public String showSignIn(Model model) throws SQLException {
		model.addAttribute("user", new Register());
		return "Login";
	}

	@GetMapping("/showRegisterPage")
	public String showRegisterPage(Model model) {
		model.addAttribute("user", new Register());
		return "Register";
	}

	@GetMapping("/contact")
	public String showContact(Model model) {
		model.addAttribute("user", new Register());
		return "Contact";

	}

	@PostMapping("/registerUser")
	public String addUser(@Valid @ModelAttribute("user") Register user, BindingResult result, Model model,
			HttpSession session) throws ClassNotFoundException, SQLException, IOException {
		if (result.hasErrors()) {
			return "Register";
		}

		Integer addId = userRepository.addUser(user);
		model.addAttribute("currentUser", user);

		if (addId == -1) {
			model.addAttribute("errorMessage", "registration failed");
			return "Register";

		}

//		model.addAttribute("successMessage", "Successfully registered");

		session.setAttribute("currentUser", user);

		return "redirect:/";
	}

	@PostMapping("/loginUser")
	public String loginUser(@RequestParam String username, @RequestParam String password, Model model,
			HttpSession session) throws ClassNotFoundException, SQLException, IOException {
		Register user = new Register();
		user.setUsername(username);
		user.setPassword(password);

		Register foundUser = userRepository.findUserByUsername(user);

		if (Objects.isNull(foundUser)) {
			model.addAttribute("errorMessage", "Invalid username");
			return "Login";
		} else {

			if (foundUser.getPassword().equals(user.getPassword())) {

				session.setAttribute("currentUser", user);
				return "Home";

			} else {

				model.addAttribute("errorMessage", "Invalid password");

				return "Login";
			}

		}

	}

	@GetMapping("/showProfile")
	public String showWelcomePage() {
		return "Profile";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	@GetMapping("/showHome")
	public String showHome() {
		return "Home";
	}

}
