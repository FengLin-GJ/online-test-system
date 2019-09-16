package com.ots.service.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

import com.ots.dao.QueBaMationsDao;
import com.ots.entity.Qgsq;
import com.ots.entity.Qlfb;
import com.ots.entity.Qljq;
import com.ots.entity.Qlsaq;
import com.ots.entity.TestSuite;
import com.ots.service.QueBaMationsService;

@Transactional
public class QueBaMationsServiceImpl implements QueBaMationsService {

	private QueBaMationsDao queBaMationsDao;

	public void setQueBaMationsDao(QueBaMationsDao queBaMationsDao) {
		this.queBaMationsDao = queBaMationsDao;
	}

	//根据题数返回对应数量的选择题
	@Override
	public List<Qgsq> export_qgsq(int number) {
		// TODO Auto-generated method stub
		return queBaMationsDao.export_qgsq(random(number));
	}

	//根据题数返回对应数量的填空题
	@Override
	public List<Qlfb> export_qlfb(int number) {
		// TODO Auto-generated method stub
		return queBaMationsDao.export_qlfb(random(number));
	}

	//根据题数返回对应数量的判断题
	@Override
	public List<Qljq> export_qljq(int number) {
		// TODO Auto-generated method stub
		return queBaMationsDao.export_qljq(random(number));
	}

	//根据题数返回对应数量的简答题
	@Override
	public List<Qlsaq> export_qlsaq(int number) {
		// TODO Auto-generated method stub
		return queBaMationsDao.export_qlsaq(random(number));
	}
	
	//随机数生成方法
	public List<Integer> random(int number){
		List<Integer> list=new ArrayList<>();
		for (int i = 0; i < number; i++) {
			list.add((int)(Math.random()*10)+1); //题库总题数
		}
		return list;
	}

	//考试信息表
	@Override
	public Boolean published(TestSuite testSuite) {
		// TODO Auto-generated method stub
		return queBaMationsDao.published(testSuite);
	}

	@Override
	public List<TestSuite> publishedOut() {
		// TODO Auto-generated method stub
		List<TestSuite> list=new ArrayList<>();
		List<TestSuite> list2=queBaMationsDao.publishedOut();
		for (TestSuite testSuite : list2) {
			if (compare(testSuite.getDate())) {
				list.add(testSuite);
			}
		}
		return list;
	}
	
	//日期比较方法
	public Boolean compare(Date time) {
		Date date=new Date();
		if (time.getTime()-date.getTime()>0) {
			return true;
		}else {
			return false;
		}
	}

}
