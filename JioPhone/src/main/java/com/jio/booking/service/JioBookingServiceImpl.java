package com.jio.booking.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jio.booking.dao.UserDao;

public class JioBookingServiceImpl implements JioBookingService {
	
	@Autowired
	UserDao userdao;

	@Override
	public void bookJioPhone() {
		// TODO Auto-generated method stub
		
	}

}
