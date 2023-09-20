package com.spring.exam.SpringBootExam.model;

public class PublishingHouse {
	
	
	private int publisherID;
    private String publisherName;
    private String location;
    private String contactInfo;
    
    
    
    public PublishingHouse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getPublisherID() {
		return publisherID;
	}
	public void setPublisherID(int publisherID) {
		this.publisherID = publisherID;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	@Override
	public String toString() {
		return "PublishingHouse [publisherID=" + publisherID + ", publisherName=" + publisherName + ", location="
				+ location + ", contactInfo=" + contactInfo + "]";
	}

}
