package com.reservation.core.dao;

import org.springframework.stereotype.Repository;

import com.reservation.core.bo.RegisteredUsers;
import com.reservation.genericdao.GenericDaoImpl;

@Repository 
public class RegisteredUsersDaoImpl extends GenericDaoImpl<RegisteredUsers, Integer> 
implements IRegisteredUsersDao{
	
}
