package com.jio.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jio.booking.bo.UserForm;
import com.jio.booking.dao.UserDao;
import com.jio.booking.model.User;

@Transactional
public class JioBookingServiceImpl implements JioBookingService {

	@Autowired
	UserDao userdao;

	@Transactional(readOnly = false)
	@Override
	public void bookJioPhone(UserForm userForm) {
		User user = new User();
		user.setFullName(userForm.getFullName());
		user.setMobileNo(userForm.getMobileNo());
		user.setEmail(userForm.getEmail());
		user.setAddress(userForm.getAddress());
		user.setCity(userForm.getCity());
		user.setPinCode(userForm.getPincode());
		userdao.save(user);
	}

}
