package com.ots.service.Impl;

import org.springframework.transaction.annotation.Transactional;

import com.ots.dao.OnlineExamDao;
import com.ots.service.OnlineExamService;

@Transactional
public class OnlineExamServiceImpl implements OnlineExamService {

	private OnlineExamDao onlineExamDao;

	public void setOnlineExamDao(OnlineExamDao onlineExamDao) {
		this.onlineExamDao = onlineExamDao;
	}

}
