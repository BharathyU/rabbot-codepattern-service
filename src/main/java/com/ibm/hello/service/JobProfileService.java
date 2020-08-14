package com.ibm.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.hello.repository.JobProfileRepository;
import com.ibm.hello.entity.JobProfileDetails;

@Service
public class JobProfileService {
	
	@Autowired
	private JobProfileRepository jobProfileRepository;
	
	public List<JobProfileDetails> getJobProfileDetails(){
		return jobProfileRepository.findAll();
	}

}
