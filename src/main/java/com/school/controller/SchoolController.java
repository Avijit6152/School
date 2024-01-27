package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.school.entity.Signup;
import com.school.service.SchoolServiceImpl;

@RestController //(controller and responseBody)
@RequestMapping("/school")
public class SchoolController {

	@Autowired
	private SchoolServiceImpl schoolServiceImpl;
	
	@PostMapping("/signup")
	public String signup(@RequestBody Signup signup) {
		
		schoolServiceImpl.processSignup(signup);
		
		return "SignUp Created Successfully";
	}
}



//@RequestMapping("/students/new")
//public String createStudentForm(Model model) {
//	StudentEntity studentEntity = new StudentEntity();
//	model.addAttribute("student", studentEntity);
//	return "create_student";
//}