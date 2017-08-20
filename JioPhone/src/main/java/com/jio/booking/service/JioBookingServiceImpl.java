package com.jio.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jio.booking.bo.UserForm;
import com.jio.booking.dao.UserDao;
import com.jio.booking.model.User;

@Service
public class JioBookingServiceImpl implements JioBookingService {

	@Autowired
	UserDao userdao;

	@Override
	@Transactional(readOnly = false)

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
