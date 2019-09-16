package com.ots.dao;

import com.ots.entity.Permission;

public interface AuthMationsDao {
	//登陆方法 
	public Permission login(Permission permission);
}
