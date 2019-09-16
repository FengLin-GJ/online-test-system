package com.ots.service.Impl;

import org.springframework.transaction.annotation.Transactional;

import com.ots.dao.ExamDao;
import com.ots.service.ExamService;

@Transactional
public class ExamServiceImpl implements ExamService {

	private ExamDao examDao;

	public void setExamDao(ExamDao examDao) {
		this.examDao = examDao;
	}

}
