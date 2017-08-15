package com.jio.booking.dao;

import org.springframework.stereotype.Repository;

import com.jio.booking.model.User;
@Repository
public interface UserDao {
	public void save(User user);
}
