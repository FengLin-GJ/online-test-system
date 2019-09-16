package com.ots.action.Impl;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ots.action.OnlineExamAction;
import com.ots.entity.QueLib;
import com.ots.service.OnlineExamService;

public class OnlineExamActionImpl extends ActionSupport implements ModelDriven<QueLib>, OnlineExamAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private QueLib queLib=new QueLib();

	public QueLib getModel() {
		// TODO Auto-generated method stub
		return queLib;
	}

	private OnlineExamService onlineExamService;

	public void setOnlineExamService(OnlineExamService onlineExamService) {
		this.onlineExamService = onlineExamService;
	}

}
