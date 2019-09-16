package com.ots.service;

import java.util.List;

import com.ots.entity.Qgsq;
import com.ots.entity.Qlfb;
import com.ots.entity.Qljq;
import com.ots.entity.Qlsaq;
import com.ots.entity.TestSuite;

public interface QueBaMationsService {
	//根据题数返回对应数量的选择题
	public List<Qgsq> export_qgsq(int number);
	
	//根据题数返回对应数量的填空题
	public List<Qlfb> export_qlfb(int number);
	
	//根据题数返回对应数量的判断题
	public List<Qljq> export_qljq(int number);
	
	//根据题数返回对应数量的简答题
	public List<Qlsaq> export_qlsaq(int number);
	
	//随即数生成方法
	public List<Integer> random(int number);
	
	//考试信息表
	public Boolean published(TestSuite testSuite);
	
	//查询考试信息
	public List<TestSuite> publishedOut();
}
