package com.ots.service.Impl;

import org.springframework.transaction.annotation.Transactional;

import com.ots.dao.InfoMationsDao;
import com.ots.service.InfoMationsService;

@Transactional
public class InfoMationsServiceImpl implements InfoMationsService {

	private InfoMationsDao infoMationsDao;

	public void setInfoMationsDao(InfoMationsDao infoMationsDao) {
		this.infoMationsDao = infoMationsDao;
	}

}
