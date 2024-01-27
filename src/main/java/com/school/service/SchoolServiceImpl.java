package com.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.school.entity.Signup;
import com.school.repository.SchoolRepository;

@Service
public class SchoolServiceImpl implements SchoolService {
	
//	@Autowired
//	private RestTemplate restTemplate;

	@Autowired
	private SchoolRepository schoolRepository;

	@Override
	public void processSignup(Signup signup) {
		schoolRepository.save(signup);
		
	}

}
