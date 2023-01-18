package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.NewEnquiryResponse;
import com.app.model.NewEnquiry;
import com.app.repo.NewEnquiryRepo;


@Service
public class NewEnquiryService {

	@Autowired
	private NewEnquiryRepo repo;

	public NewEnquiryResponse addNewEnquiry(NewEnquiry newenquiry) {
	NewEnquiryResponse response = new NewEnquiryResponse();
	NewEnquiry enquiry=repo.save(newenquiry);
	if(enquiry!=null) {
		response.setNewenquiry(enquiry);
		response.setStatus("Success");
	}else {
		response.setNewenquiry(enquiry);
		response.setStatus("Fail");
	}
	
		
	// TODO Auto-generated method stub
	return response;
}
}


