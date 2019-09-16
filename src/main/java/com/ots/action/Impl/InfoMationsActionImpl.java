package com.ots.action.Impl;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ots.action.InfoMationsAction;
import com.ots.entity.InfoMations;
import com.ots.service.InfoMationsService;

public class InfoMationsActionImpl extends ActionSupport implements ModelDriven<InfoMations>, InfoMationsAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private InfoMations infoMations = new InfoMations();

	public InfoMations getModel() {
		// TODO Auto-generated method stub
		return infoMations;
	}

	private InfoMationsService infoMationsService;

	public void setInfoMationsService(InfoMationsService infoMationsService) {
		this.infoMationsService = infoMationsService;
	}

}
