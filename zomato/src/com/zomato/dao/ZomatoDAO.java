package com.zomato.dao;

import com.zomato.entity.ZomatoEmployee;

public class ZomatoDAO implements ZomatoDAOInterface{
	private ZomatoDAO() {}

	@Override
	public int createProfileDao(ZomatoEmployee ze) {
		// TODO Auto-generated method stub
		return 1;
	}

	public static ZomatoDAOInterface createDaoObject() {
		// TODO Auto-generated method stub
		return new ZomatoDAO();
	}
}
