package com.masti.health.HealthManagment.model;

import java.sql.Date;

public class NetworkHospitals {
	
	private int hospId;
	private String hospTitle;
	private String hospLocation;
	private String hospAddress;
	private String hospContactMobile;
	private String hospContactPhone;
	private String hospPincode;
	private Date hospLuudate;
	private String hospLuuser;
	

	public NetworkHospitals() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getHospId() {
		return hospId;
	}

	public void setHospId(int hospId) {
		this.hospId = hospId;
	}

	public String getHospTitle() {
		return hospTitle;
	}

	public void setHospTitle(String hospTitle) {
		this.hospTitle = hospTitle;
	}

	public String getHospLocation() {
		return hospLocation;
	}

	public void setHospLocation(String hospLocation) {
		this.hospLocation = hospLocation;
	}

	public String getHospAddress() {
		return hospAddress;
	}

	public void setHospAddress(String hospAddress) {
		this.hospAddress = hospAddress;
	}

	public String getHospContactMobile() {
		return hospContactMobile;
	}

	public void setHospContactMobile(String hospContactMobile) {
		this.hospContactMobile = hospContactMobile;
	}

	public String getHospContactPhone() {
		return hospContactPhone;
	}

	public void setHospContactPhone(String hospContactPhone) {
		this.hospContactPhone = hospContactPhone;
	}

	public String getHospPincode() {
		return hospPincode;
	}

	public void setHospPincode(String hospPincode) {
		this.hospPincode = hospPincode;
	}

	public Date getHospLuudate() {
		return hospLuudate;
	}

	public void setHospLuudate(Date i) {
		this.hospLuudate = i;
	}

	public String getHospLuuser() {
		return hospLuuser;
	}

	public void setHospLuuser(String hospLuuser) {
		this.hospLuuser = hospLuuser;
	}

	@Override
	public String toString() {
		return "NetworkHospitals [hospId=" + hospId + ", hospTitle=" + hospTitle + ", hospLocation=" + hospLocation
				+ ", hospAddress=" + hospAddress + ", hospContactMobile=" + hospContactMobile + ", hospContactPhone="
				+ hospContactPhone + ", hospPincode=" + hospPincode + ", hospLuudate=" + hospLuudate + ", hospLuuser="
				+ hospLuuser + "]";
	}

	
	
}
