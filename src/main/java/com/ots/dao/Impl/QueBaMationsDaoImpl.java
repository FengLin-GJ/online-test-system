package com.ots.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.ots.dao.QueBaMationsDao;
import com.ots.entity.Permission;
import com.ots.entity.Qgsq;
import com.ots.entity.Qlfb;
import com.ots.entity.Qljq;
import com.ots.entity.Qlsaq;
import com.ots.entity.TestSuite;

public class QueBaMationsDaoImpl extends HibernateDaoSupport implements QueBaMationsDao {

	//根据题数返回对应数量的选择题
	@Override
	public List<Qgsq> export_qgsq(List<Integer> list) {
		// TODO Auto-generated method stub
		List<Qgsq> list2=new ArrayList<>();
		for (Integer integer : list) {
			String hql="from Qgsq where gid=?";
			@SuppressWarnings("unchecked")
			List<Qgsq> lists=(List<Qgsq>) this.getHibernateTemplate().find(hql, integer);
			if (lists.size()>0) {
				list2.add(lists.get(0));
			}else {
				System.out.println("主键为"+integer+"的选择题没有！");
			}
		}
		return list2;
	}

	//根据题数返回对应数量的填空题
	@Override
	public List<Qlfb> export_qlfb(List<Integer> list) {
		// TODO Auto-generated method stub
		List<Qlfb> list2=new ArrayList<>();
		for (Integer integer : list) {
			String hql="from Qlfb where fid=?";
			@SuppressWarnings("unchecked")
			List<Qlfb> lists=(List<Qlfb>) this.getHibernateTemplate().find(hql, integer);
			if (lists.size()>0) {
				list2.add(lists.get(0));
			}else {
				System.out.println("主键为"+integer+"的填空题没有！");
			}
		}
		return list2;
	}

	//根据题数返回对应数量的判断题
	@Override
	public List<Qljq> export_qljq(List<Integer> list) {
		// TODO Auto-generated method stub
		List<Qljq> list2=new ArrayList<>();
		for (Integer integer : list) {
			String hql="from Qljq where lid=?";
			@SuppressWarnings("unchecked")
			List<Qljq> lists=(List<Qljq>) this.getHibernateTemplate().find(hql, integer);
			if (lists.size()>0) {
				list2.add(lists.get(0));
			}else {
				System.out.println("主键为"+integer+"的判断题没有！");
			}
		}
		return list2;
	}

	//根据题数返回对应数量的简答题
	@Override
	public List<Qlsaq> export_qlsaq(List<Integer> list) {
		// TODO Auto-generated method stub
		List<Qlsaq> list2=new ArrayList<>();
		for (Integer integer : list) {
			String hql="from Qlsaq where aid=?";
			@SuppressWarnings("unchecked")
			List<Qlsaq> lists=(List<Qlsaq>) this.getHibernateTemplate().find(hql, integer);
			if (lists.size()>0) {
				list2.add(lists.get(0));
			}else {
				System.out.println("主键为"+integer+"的简答题没有！");
			}
		}
		return list2;
	}

	@Override
	public Boolean published(TestSuite testSuite) {
		// TODO Auto-generated method stub
		try {
			this.getHibernateTemplate().save(testSuite);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	//查询考试信息
	public List<TestSuite> publishedOut() {
		// TODO Auto-generated method stub
		String hql="from TestSuite";
		@SuppressWarnings("unchecked")
		List<TestSuite> list=(List<TestSuite>) this.getHibernateTemplate().find(hql);
		if (list.size()>0) {
			return list;
		}else {
			System.out.println("查询失败！");
			return null;
		}
	}
}
