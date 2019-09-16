package com.ots.action.Impl;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ots.action.ExamAction;
import com.ots.entity.Transcript;
import com.ots.service.ExamService;

public class ExamActionImpl extends ActionSupport implements ModelDriven<Transcript>, ExamAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Transcript transcript = new Transcript();

	public Transcript getModel() {
		// TODO Auto-generated method stub
		return transcript;
	}

	private ExamService examService;

	public void setExamService(ExamService examService) {
		this.examService = examService;
	}

}
