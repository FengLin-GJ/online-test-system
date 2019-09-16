package com.ots.action;

public interface QueBaMationsAction {
	//通过前台传入的值从数据库导出考试题
	public void export();
	//考试信息表
	public void published();
	//查询考试信息
	public void publishedOut();
}
