package com.perscholas.hibernate_validation_repository.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Register {

	@Id
	@GeneratedValue
	private Integer userId;

	@Size(min = 5, max = 25, message = "firstName must be between 5 and 25 characters long.")
	@NotBlank(message = "username is required.")
	private String username;

	@Size(min = 5, max = 25, message = "firstName must be between 5 and 25 characters long.")
	@NotBlank(message = "firstName is required.")
	private String firstName;

	@Size(min = 5, max = 25, message = "firstName must be between 5 and 25 characters long.")
	@NotBlank(message = "lastName is required.")
	private String lastName;

	@Size(min = 5, max = 25, message = "Password must be between 5 and 25 characters long.")
	@NotBlank(message = "Password is required.")
	private String password;

	@Size(min = 5, max = 25, message = "Password must be between 5 and 25 characters long.")
	@NotBlank(message = "confirmPassword is required.")
	private String confirmPassword;

	@Email(message = "Please enter a valid email.")
	@NotBlank(message = "Email is required.")
	private String email;

	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phone;

	@NotBlank(message = "Gender is required.")
	private String gender;

	public Register() {
	};

	public Register(String username, String firstName, String lastName, String password, String confirmPassword,
			String email, String phone, String gender, Integer postalCode) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmPassword;
	}

	public void setConfirmpassword(String comfirmPassword) {
		this.confirmPassword = comfirmPassword;

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + "lastName=" + lastName + "username=" + username
				+ ", password=" + password + "confirmPassword" + confirmPassword + ", email=" + email + ", gender="
				+ gender + "]";
	}

}