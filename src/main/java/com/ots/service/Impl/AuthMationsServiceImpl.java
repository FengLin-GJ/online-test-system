package com.ots.service.Impl;

import org.springframework.transaction.annotation.Transactional;

import com.ots.dao.AuthMationsDao;
import com.ots.entity.Permission;
import com.ots.service.AuthMationsService;

@Transactional
public class AuthMationsServiceImpl implements AuthMationsService {

	private AuthMationsDao authMationsDao;

	public void setAuthMationsDao(AuthMationsDao authMationsDao) {
		this.authMationsDao = authMationsDao;
	}
	//登陆方法 
	@Override
	public Permission login(Permission permission) {
		// TODO Auto-generated method stub
		return authMationsDao.login(permission);
	}

}
