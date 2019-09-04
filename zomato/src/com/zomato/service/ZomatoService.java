package com.zomato.service;

import com.zomato.dao.ZomatoDAO;
import com.zomato.dao.ZomatoDAOInterface;
import com.zomato.entity.ZomatoEmployee;

public class ZomatoService implements ZomatoServiceInterface{
	private ZomatoService() {}

	@Override
	public int createProfile(ZomatoEmployee ze) {
		// TODO Auto-generated method stub
		ZomatoDAOInterface zd=ZomatoDAO.createDaoObject();
		return zd.createProfileDao(ze);
	}

	public static ZomatoServiceInterface createServiceObject() {
		// TODO Auto-generated method stub
		return new ZomatoService();
	}

}
