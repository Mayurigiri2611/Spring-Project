package com.app.dto;

import com.app.model.NewEnquiry;

public class NewEnquiryResponse {
	private  NewEnquiry  newenquiry;
	private String Status;
	public NewEnquiry getNewenquiry() {
		return newenquiry;
	}
	public void setNewenquiry(NewEnquiry newenquiry) {
		this.newenquiry = newenquiry;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "NewEnquiryResponse [newenquiry=" + newenquiry + ", Status=" + Status + "]";
	}
	
}