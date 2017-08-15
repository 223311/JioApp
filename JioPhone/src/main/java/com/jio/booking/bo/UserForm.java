package com.jio.booking.bo;

public class UserForm {
	
	private String firstName;
	private String lastname;
	private String mobileNo;
	private String email;
	private String pincode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserForm [");
		if (firstName != null) {
			builder.append("firstName=");
			builder.append(firstName);
			builder.append(", ");
		}
		if (lastname != null) {
			builder.append("lastname=");
			builder.append(lastname);
			builder.append(", ");
		}
		if (mobileNo != null) {
			builder.append("mobileNo=");
			builder.append(mobileNo);
			builder.append(", ");
		}
		if (email != null) {
			builder.append("email=");
			builder.append(email);
			builder.append(", ");
		}
		if (pincode != null) {
			builder.append("pincode=");
			builder.append(pincode);
		}
		builder.append("]");
		return builder.toString();
	}
	

}
