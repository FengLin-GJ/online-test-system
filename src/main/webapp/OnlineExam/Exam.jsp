<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div>
	<main role="main" class="container">
	<div class="jumbotron">
		<h1>在线考试</h1>
		<p class="lead">老师发布的考试信息在截止时间之前都会显示在这里。<br>
		已知bug：在首次加载该页面会出现显示不出来的问题，请多刷新几次就可以了。
		</p>
		<s:iterator value=" #session.testSuiteList">
			<router-link to="/Test" class="btn btn-lg btn-primary" role="button" 
									style="text-align:left;" onclick="test(this)">									
			考试科目：<span><s:property value="%{subjects}" /></span><br>
			截止日期：<span><s:property value="%{date}" /></span><br>
			考试时间：<span><s:property value="%{time}" /></span>分钟<br><br>
					  <span hidden="hidden"><s:property value="%{units}" /></span>
					  <span hidden="hidden"><s:property value="%{qgsq_sum}" /></span>	
					  <span hidden="hidden"><s:property value="%{qlfb_sum}" /></span>	
					  <span hidden="hidden"><s:property value="%{qljq_sum}" /></span>	
					  <span hidden="hidden"><s:property value="%{qlsaq_sum}" /></span>	
					  <span hidden="hidden"><s:property value="%{qgsq_score}" /></span>	
					  <span hidden="hidden"><s:property value="%{qlfb_score}" /></span>	
					  <span hidden="hidden"><s:property value="%{qljq_score}" /></span>	
					  <span hidden="hidden"><s:property value="%{qlsaq_score}" /></span>		
			进入考试 &raquo;
			</router-link>
		</s:iterator>	
	</div>
	</main>
</div>