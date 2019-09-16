<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="generator" content="Jekyll v3.8.5">
<title>成都东软学院在线考试系统</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Vue core JS --> 
<script src="js/vue.js"></script>
<script src="js/vue-router.js"></script>

<script src="js/onlineTest.js"></script>
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
<link href="css/dashboard.css" rel="stylesheet">
</head>
<body>
	<!-- 主页面顶部黑色框框那一部分 -->
	<nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
		<a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">成都东软学院在线考试系统</a>
		<input class="form-control form-control-dark w-100" type="text"
			placeholder="Search" aria-label="Search">
		<ul class="navbar-nav px-3">
			<li class="nav-item text-nowrap"><a class="nav-link" href="#">登陆</a></li>
		</ul>
	</nav>
	<!-- 主页面左侧导航栏和右上部导航栏功能模块 -->
	<jsp:include page="Menu-router.jsp" flush="true"/>
	
	<script src="js/jquery-3.1.1.min.js"></script>
	<script> 
		window.jQuery || document.write('<script src="js/jquery-slim.min.js"><\/script>')
	</script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/feather.min.js"></script>
	<script src="js/dashboard.js"></script>
</body>
</html>
