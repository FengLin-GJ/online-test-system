<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	Date d = new Date();
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String now = df.format(d);
%>
<%!int i = 1;%>
<form> 
<div class="row">
	<div class="col-md-8">
		<main role="main" class="container">
		<div class="jumbotron">
			<h1 style="text-align: center; margin-top: -50px;"><span id="kemu"></span>考试 </h1>
			<br><br>
			<div class="checkbox" style="margin-left: 50px;display:none;" id="kaishi">
				<h5 style="margin-left: -50px;">一&nbsp&nbsp.&nbsp单选题（<span id="xzts"></span>个选项，每个选项<span id="xztfs"></span>分，共<span id="xztzf"></span>分）</h5>
				<!-- 这里隐藏答案，为考生考完自动评分用 -->
				<div id="xzt_getScore" hidden="hidden">
					<s:iterator value=" #session.question.list1">
					<s:property value="%{gid}"/><s:property value="%{ganswer}"/>
					</s:iterator>
				</div>
				<s:iterator value=" #session.question.list1">
					<label style="margin-left: -20px;">
						<%=i++%>&nbsp.&nbsp<s:property value="%{gquestion}" />
					</label>
					<p>
						<input type="radio" value="A" name="<s:property value="%{gid}"/>"> A.
						<s:property value="%{a_options}" />
					</p>
					<p>
						<input type="radio" value="B" name="<s:property value="%{gid}"/>"> B.
						<s:property value="%{b_options}" />
					</p>
					<p>
						<input type="radio" value="C" name="<s:property value="%{gid}"/>"> C.
						<s:property value="%{c_options}" />
					</p>
					<p>
						<input type="radio" value="D" name="<s:property value="%{gid}"/>"> D.
						<s:property value="%{d_options}" />
					</p>
					<hr>
				</s:iterator>
				<h5 style="margin-left: -50px;">二&nbsp&nbsp.&nbsp填空题（<span id="tkts"></span>个填空，每个填空<span id="tktfs"></span>分，共<span id="tktzf"></span>分）</h5>
				<!-- 这里隐藏答案，为考生考完自动评分用 -->
				<div id="tkt_getScore" hidden="hidden">
					<s:iterator value=" #session.question.list3">
					<s:property value="%{fid}"/><s:property value="%{fanswer}"/>
					</s:iterator>
				</div>
				<s:iterator value=" #session.question.list3">
					<label style="margin-left: -20px;">
						<%=i++%>&nbsp.&nbsp<s:property value="%{fquestion}" />
					</label>
					<textarea class="form-control" rows="1" id="tiankt"></textarea>
					<br>
				</s:iterator>
				<h5 style="margin-left: -50px;">三&nbsp&nbsp.&nbsp判断题（<span id="pdts"></span>个判断，每个判断<span id="pdtfs"></span>分，共<span id="pdtzf"></span>分）</h5>
				<s:iterator value=" #session.question.list2">
					<label style="margin-left: -20px;"><%=i++%>&nbsp.&nbsp<s:property
							value="%{lquestion}" /></label>
					<p>
						对：<input type="radio" value="true" name="<s:property
							value="%{lid}"/>">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						错：<input type="radio" value="false" name="<s:property
							value="%{lid}"/>">
					</p>
					<hr>
				</s:iterator>
				<h5 style="margin-left: -50px;">四&nbsp&nbsp.&nbsp简答题（<span id="jdts"></span>个简答题，每个题<span id="jdtfs"></span>分，共<span id="jdtzf"></span>分）</h5>
				<s:iterator value=" #session.question.list4">
					<label style="margin-left: -20px;">
						<%=i++%>&nbsp.&nbsp<s:property value="%{aquestion}" />
					</label>
					<textarea class="form-control" rows="3" id="tiankt"></textarea>
					<br>
				</s:iterator>
			</div>
		</div>
		</main>
	</div>
	<div class="col-md-4">
		<main role="main" class="container">
		<div class="jumbotron" style="position:fixed;width:360px;">
			<center style="margin-top:-50px;">
				<button onclick="Examination(this)" type="submit" class="btn btn-primary btn-lg active">开始考试</button> 
				<br><br>倒计时<h2 id="timeshow"></h2>
			</center><br><br>
			<p>考试科目：<span id="kemus"></span></p>
			<p>考试单元：<span id="danyuan"></span></p>
			<p>考试时间：<span id="shijian"></span>分钟</p> 
			<p>考试学生：<s:iterator value="#session.permission"><s:property value="%{qname}"/></s:iterator></p>
			<p>考试日期：<%=now %></p>
			<div id="ss"></div>
			<br><br><br><br><br><br><br><br> 
			<button type="button" class="btn btn-primary btn-lg btn-block" onclick="tijiao()">提交</button>
		</div>
		</main>
	</div>
</div>
</form>