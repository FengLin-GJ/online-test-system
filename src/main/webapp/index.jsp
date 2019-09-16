<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Jekyll v3.8.5">
<title>登陆</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="css/signin.css" rel="stylesheet">
</head>
<body class="text-center">
	<form class="form-signin">
		<div id="app">
			<img class="mb-4" src="img/nsu.jpg" alt="" width="72" height="72">
			<h1 class="h3 mb-3 font-weight-normal">{{login}}</h1>
			<label for="inputName" class="sr-only" id="name_label">{{st_no}}</label>  
			<input type="name" id="inputName" class="form-control" :placeholder="st_no" required autofocus> 
			<label for="inputPassword" class="sr-only">密码</label>
			<input type="password" id="inputPassword" class="form-control" placeholder="密码" required>
			<div class="checkbox mb-3" style="text-align:right;">
				<label> <input type="checkbox" value="remember-me">记住我</label> 
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				<span style="cursor:pointer" @click="loginSwitch"><img alt="登陆切换" src="icon/loginSwitch.svg" width="20"> 登陆切换</span>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit" id="login">登陆</button>
			<p class="mt-5 mb-3 text-muted">&copy; 2018-2019</p>
		 </div>
	</form>	
	<script src="js/vue.js"></script>
	<script src="js/login.js"></script>
	<script src="js/jquery-3.1.1.min.js"></script>
</body>
</html>