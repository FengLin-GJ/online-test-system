package com.ots.action.Impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ots.action.QueBaMationsAction;
import com.ots.entity.Question;
import com.ots.entity.TestSuite;
import com.ots.service.QueBaMationsService;

public class QueBaMationsActionImpl extends ActionSupport implements ModelDriven<Question>, QueBaMationsAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Question question=new Question();

	public Question getModel() {
		// TODO Auto-generated method stub
		return question;
	}

	private QueBaMationsService queBaMationsService;

	public void setQueBaMationsService(QueBaMationsService queBaMationsService) {
		this.queBaMationsService = queBaMationsService;
	}

	@Override
	//通过前台传入的值从数据库导出考试题
	public void export() {
		// TODO Auto-generated method stub
		int login = 1;
		question.setList1(queBaMationsService.export_qgsq(question.getQgsq_number()));
		question.setList2(queBaMationsService.export_qljq(question.getQljq_number()));
		question.setList3(queBaMationsService.export_qlfb(question.getQlfb_number()));
		question.setList4(queBaMationsService.export_qlsaq(question.getQlsaq_number()));
		//存储入session
		if (question!=null) {
			ServletActionContext.getContext().getSession().remove("question");
			ServletActionContext.getContext().getSession().put("question", question);
		}else {
			login = -1;   
		}
		HttpServletResponse response = ServletActionContext.getResponse();
		 try {	
			response.getWriter().print(login);		
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	//考试信息表
	public void published() {
		// TODO Auto-generated method stub
		int login = 1;
		Boolean boolean1=queBaMationsService.published(question.getTestSuite());
		if (!boolean1) {
			login = -1; 
		}
		HttpServletResponse response = ServletActionContext.getResponse();
		 try {	
			response.getWriter().print(login);		
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	//查询考试信息
	public void publishedOut() {
		// TODO Auto-generated method stub
		int login = 1;
		List<TestSuite> list=queBaMationsService.publishedOut();
		if (list.size()>0) {
			ServletActionContext.getContext().getSession().put("testSuiteList", list);
		} else {
			login = -1;
		}
		HttpServletResponse response = ServletActionContext.getResponse();
		 try {	
			response.getWriter().print(login);		
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
