package com.me.JobPortal.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.me.JobPortal.pojo.JobList;

public class JobsValidator implements Validator{

	public boolean supports(Class aClass) {
		return aClass.equals(JobList.class);
	}

	public void validate(Object obj, Errors errors) {
		JobList job = (JobList) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jobName", "error.invalid.job", "Job Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jobDesc", "error.invalid.job", "Job Description Required");
	
		
		// check if user exists
		
	}
	
}
