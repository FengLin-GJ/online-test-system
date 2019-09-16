<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="text-align: center;">
	<main role="main" class="container">
	<div class="jumbotron">
	<div class="row"> 
	<div class="col-md-6">
		<h1 style="margin-top: -50px;">随机组卷</h1>
		<form class="form-inline" style="width:300px;">
			<div class="form-group">
				<label for="subjects">考试科目：</label>
				<input type="text" class="form-control"id="subjects" placeholder="考试科目">
			</div> 
			<div class="form-group">
				<label for="units">考试单元：</label>
				<input type="text" class="form-control"id="units" placeholder="考试单元">
			</div> 
			<div class="form-group">
				<label for="time">考试时间：</label>
				<input type="text" class="form-control"id="time" placeholder="考试时间">
			</div> 
			<div class="form-group">
				<label for="date">截止日期：</label>
				<input type="date" class="form-control"id="date" placeholder="考试日期">
			</div> 
			<div class="form-group">
				<label for="qgsq_sum">选题题数：</label>
				<input type="text" class="form-control"id="qgsq_sum" style="width:50px;">
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				<label for="qgsq_score">每题分数：</label>
				<input type="text" class="form-control"id="qgsq_score" style="width:50px;">
			</div> 
			<div class="form-group">
				<label for="qlfb_sum">填空题数：</label>
				<input type="text" class="form-control"id="qlfb_sum" style="width:50px;">
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				<label for="qlfb_score">每题分数：</label>
				<input type="text" class="form-control"id="qlfb_score" style="width:50px;">
			</div> 
			<div class="form-group">
				<label for="qljq_sum">判断题数：</label>
				<input type="text" class="form-control"id="qljq_sum" style="width:50px;">
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				<label for="qljq_score">每题分数：</label>
				<input type="text" class="form-control"id="qljq_score" style="width:50px;">
			</div> 
			<div class="form-group">
				<label for="qlsaq_sum">简答题数：</label>
				<input type="text" class="form-control"id="qlsaq_sum" style="width:50px;">
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				<label for="qlsaq_score">每题分数：</label>
				<input type="text" class="form-control"id="qlsaq_score" style="width:50px;">
			</div><br><br><br>
			<button type="button" class="btn btn-default" id="ms">发布试卷</button>
		</form>
	</div>
	 <div class="col-md-6">
		<img src="img/shuijizujuan.jfif" alt="..." class="img-rounded">
	</div>
	</div>
	</div>
	</main>
</div>