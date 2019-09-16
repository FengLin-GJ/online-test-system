package com.ots.action.Impl;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ots.action.AuthMationsAction;
import com.ots.entity.Permission;
import com.ots.service.AuthMationsService;

//权限控制
public class AuthMationsActionImpl extends ActionSupport implements ModelDriven<Permission>, AuthMationsAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Permission permission=new Permission();

	public Permission getModel() {
		// TODO Auto-generated method stub
		return permission;
	}

	private AuthMationsService authMationsService;

	public void setAuthMationsService(AuthMationsService authMationsService) {
		this.authMationsService = authMationsService;
	}

	/**
	 * Ajax异步请求获得登录许可
	 * @return 返回登录状态
	 */
	@Override
	public void login() {
		// TODO Auto-generated method stub
		int login = 1;
		Permission permission1=authMationsService.login(permission);
		if (permission1!=null) {
			if (permission1.getQpassword().equals(permission.getQpassword())) {
				//存储入session
				ServletActionContext.getContext().getSession().put("permission", permission1);
			}else {
				System.out.println("密码错误");
				login = -2;  //密码错误
			}
		}else {
			System.out.println("该账号不存在");
			login = -1;  //该账号不存在
		}
		HttpServletResponse response = ServletActionContext.getResponse();
		 try {	
			response.getWriter().print(login);		
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
