package com.ots.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//考试信息表
@Entity
@Table(name = "testSuite")
public class TestSuite {
	private int tid;  //Id
	private Date date; //截至日期
	private String time;  //考试时间
	private String subjects;  //考试科目
	private String units;  //考试单元
	private int qgsq_sum; //选择题数
	private int qlfb_sum; //填空题数
	private int qljq_sum; //判断题数
	private int qlsaq_sum; //简答题数
	
	private int qgsq_score; //选择题分数
	private int qlfb_score; //填空题分数
	private int qljq_score; //判断题分数
	private int qlsaq_score; //简答题分数
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	} 
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	@Column(length = 6)
	public int getQgsq_sum() {
		return qgsq_sum;
	}
	public void setQgsq_sum(int qgsq_sum) {
		this.qgsq_sum = qgsq_sum;
	}
	@Column(length = 6)
	public int getQlfb_sum() {
		return qlfb_sum;
	}
	public void setQlfb_sum(int qlfb_sum) {
		this.qlfb_sum = qlfb_sum;
	}
	@Column(length = 6)
	public int getQljq_sum() {
		return qljq_sum;
	}
	public void setQljq_sum(int qljq_sum) {
		this.qljq_sum = qljq_sum;
	}
	@Column(length = 6)
	public int getQlsaq_sum() {
		return qlsaq_sum;
	}
	public void setQlsaq_sum(int qlsaq_sum) {
		this.qlsaq_sum = qlsaq_sum;
	}
	@Column(length = 6)
	public int getQgsq_score() {
		return qgsq_score;
	}
	public void setQgsq_score(int qgsq_score) {
		this.qgsq_score = qgsq_score;
	}
	@Column(length = 6)
	public int getQlfb_score() {
		return qlfb_score;
	}
	public void setQlfb_score(int qlfb_score) {
		this.qlfb_score = qlfb_score;
	}
	@Column(length = 6)
	public int getQljq_score() {
		return qljq_score;
	}
	public void setQljq_score(int qljq_score) {
		this.qljq_score = qljq_score;
	}
	@Column(length = 6)
	public int getQlsaq_score() {
		return qlsaq_score;
	}
	public void setQlsaq_score(int qlsaq_score) {
		this.qlsaq_score = qlsaq_score;
	} 
	public TestSuite(int tid, Date date, String time, String subjects, String units, int qgsq_sum, int qlfb_sum,
			int qljq_sum, int qlsaq_sum, int qgsq_score, int qlfb_score, int qljq_score, int qlsaq_score) {
		super();
		this.tid = tid;
		this.date = date;
		this.time = time;
		this.subjects = subjects;
		this.units = units;
		this.qgsq_sum = qgsq_sum;
		this.qlfb_sum = qlfb_sum;
		this.qljq_sum = qljq_sum;
		this.qlsaq_sum = qlsaq_sum;
		this.qgsq_score = qgsq_score;
		this.qlfb_score = qlfb_score;
		this.qljq_score = qljq_score;
		this.qlsaq_score = qlsaq_score;
	}
	public TestSuite() {
		super();
	}
	@Override
	public String toString() {
		return "TestSuite [tid=" + tid + ", date=" + date + ", time=" + time + ", subjects=" + subjects + ", units="
				+ units + ", qgsq_sum=" + qgsq_sum + ", qlfb_sum=" + qlfb_sum + ", qljq_sum=" + qljq_sum
				+ ", qlsaq_sum=" + qlsaq_sum + ", qgsq_score=" + qgsq_score + ", qlfb_score=" + qlfb_score
				+ ", qljq_score=" + qljq_score + ", qlsaq_score=" + qlsaq_score + "]";
	} 
}
