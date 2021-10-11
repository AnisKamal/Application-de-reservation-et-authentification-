package com.reservation.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reservation.core.bo.RegisteredUsers;
import com.reservation.core.dao.IRegisteredUsersDao;

@Service
@Transactional 
public class RegisteredUsersServiceImpl implements IRegisterdUsersService {
	
	@Autowired
	private IRegisteredUsersDao registeredUserDao ; 
	
	public RegisteredUsers addUsers(RegisteredUsers user) {
		return registeredUserDao.create(user);
	}

}
