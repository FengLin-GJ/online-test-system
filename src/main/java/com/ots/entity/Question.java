package com.ots.entity;

import java.util.List;

public class Question {
    private Qgsq qgsq;  //题库选择题表
    private Qljq qljq;  //题库判断题表
    private Qlfb qlfb;  //题库填空题表
    private Qlsaq qlsaq;  //题库简答题表
    
    private List<Qgsq> list1;
    private List<Qljq> list2;
    private List<Qlfb> list3;
    private List<Qlsaq> list4;
    
    private int qgsq_number;  //题库选择题数
    private int qljq_number;  //题库判断题数
    private int qlfb_number;  //题库填空题数
    private int qlsaq_number;  //题库简答题数
    
    private TestSuite testSuite;
    
	public Qgsq getQgsq() {
		return qgsq;
	}
	public void setQgsq(Qgsq qgsq) {
		this.qgsq = qgsq;
	}
	public Qljq getQljq() {
		return qljq;
	}
	public void setQljq(Qljq qljq) {
		this.qljq = qljq;
	}
	public Qlfb getQlfb() {
		return qlfb;
	}
	public void setQlfb(Qlfb qlfb) {
		this.qlfb = qlfb;
	}
	public Qlsaq getQlsaq() {
		return qlsaq;
	}
	public void setQlsaq(Qlsaq qlsaq) {
		this.qlsaq = qlsaq;
	}
	public int getQgsq_number() {
		return qgsq_number;
	}
	public void setQgsq_number(int qgsq_number) {
		this.qgsq_number = qgsq_number;
	}
	public int getQljq_number() {
		return qljq_number;
	}
	public void setQljq_number(int qljq_number) {
		this.qljq_number = qljq_number;
	}
	public int getQlfb_number() {
		return qlfb_number;
	}
	public void setQlfb_number(int qlfb_number) {
		this.qlfb_number = qlfb_number;
	}
	public int getQlsaq_number() {
		return qlsaq_number;
	}
	public void setQlsaq_number(int qlsaq_number) {
		this.qlsaq_number = qlsaq_number;
	}
	public List<Qgsq> getList1() {
		return list1;
	}
	public void setList1(List<Qgsq> list1) {
		this.list1 = list1;
	}
	public List<Qljq> getList2() {
		return list2;
	}
	public void setList2(List<Qljq> list2) {
		this.list2 = list2;
	}
	public List<Qlfb> getList3() {
		return list3;
	}
	public void setList3(List<Qlfb> list3) {
		this.list3 = list3;
	}
	public List<Qlsaq> getList4() {
		return list4;
	}
	public void setList4(List<Qlsaq> list4) {
		this.list4 = list4;
	}
	public TestSuite getTestSuite() {
		return testSuite;
	}
	public void setTestSuite(TestSuite testSuite) {
		this.testSuite = testSuite;
	}
	public Question(Qgsq qgsq, Qljq qljq, Qlfb qlfb, Qlsaq qlsaq) {
		super();
		this.qgsq = qgsq;
		this.qljq = qljq;
		this.qlfb = qlfb;
		this.qlsaq = qlsaq;
	}
	public Question() {
		//super();
	}
	@Override
	public String toString() {
		return "Question [qgsq=" + qgsq + ", qljq=" + qljq + ", qlfb=" + qlfb + ", qlsaq=" + qlsaq + ", list1=" + list1
				+ ", list2=" + list2 + ", list3=" + list3 + ", list4=" + list4 + ", qgsq_number=" + qgsq_number
				+ ", qljq_number=" + qljq_number + ", qlfb_number=" + qlfb_number + ", qlsaq_number=" + qlsaq_number
				+ ", testSuite=" + testSuite + "]";
	} 
    
}
