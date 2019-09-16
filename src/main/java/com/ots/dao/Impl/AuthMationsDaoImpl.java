package com.ots.dao.Impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.ots.dao.AuthMationsDao;
import com.ots.entity.Permission;

public class AuthMationsDaoImpl extends HibernateDaoSupport implements AuthMationsDao {

	//登陆方法 
	@Override
	public Permission login(Permission permission) {
		// TODO Auto-generated method stub
		String hql="from Permission where qaccount=?";
		@SuppressWarnings("unchecked")
		List<Permission> lists=(List<Permission>) this.getHibernateTemplate().find(hql, permission.getQaccount());
		if (lists.size()>0) {
			return lists.get(0);
		}else {
			System.out.println("没有该账号！");
			return null;
		}
	}
	
}
