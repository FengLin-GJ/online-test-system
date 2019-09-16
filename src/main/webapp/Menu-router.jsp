<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="Menu-router">
	<div class="container-fluid">
		<div class="row">
			<nav class="col-md-2 d-none d-md-block bg-light sidebar">
				<div class="sidebar-sticky">
					<s:iterator value="#session.permission">
					<ul class="nav flex-column">
						<li class="nav-item">
						<router-link to="/Home" class="nav-link active"> 
							<span data-feather="home"></span> 主页 <span class="sr-only">(current)</span>
						</router-link>
						</li>
						<li class="nav-item">
						<router-link to="/InfoMations" class="nav-link" 
									v-if="<s:property value="%{qauthority}"/> =='0'||<s:property value="%{qauthority}"/> =='1'"> 
									<span data-feather="file"></span> 信息管理 
						</router-link>
						</li>
						<li class="nav-item">
						<router-link to="/QueBaMations" class="nav-link" 
									v-if="<s:property value="%{qauthority}"/> !='3'"> 
									<span data-feather="shopping-cart"></span> 题库管理 
						</router-link>
						</li>
						<li class="nav-item">
						<router-link to="/AuthMations" class="nav-link" 
									v-if="<s:property value="%{qauthority}"/> =='0'||<s:property value="%{qauthority}"/> =='1'"> 
									<span data-feather="users"></span> 权限管理
						 </router-link></li>
						<li class="nav-item">
						<router-link to="/Exam" class="nav-link" 
									v-if="<s:property value="%{qauthority}"/> =='0'||<s:property value="%{qauthority}"/> =='2'">  
									<span data-feather="bar-chart-2"></span> 考试 
						</router-link>
						</li>
						<li class="nav-item">
						<router-link to="/OnlineExam" class="nav-link"  
									v-if="<s:property value="%{qauthority}"/> =='0'||<s:property value="%{qauthority}"/> =='3'"> 
							<span data-feather="layers"></span> 在线考试
						</router-link>
						</li>
					</ul>
					</s:iterator>
					<h6
						class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
						<span>最近使用。。。</span> <a
							class="d-flex align-items-center text-muted" href="#"> <span
							data-feather="plus-circle"></span>
						</a>
					</h6>
					<!-- 测试用的，后期再改 -->
					<ul class="nav flex-column mb-2">
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="file-text"></span> Current month
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="file-text"></span> Last quarter
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="file-text"></span> Social engagement
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="file-text"></span> Year-end sale
						</a></li>
					</ul>
					
				</div>
			</nav>
		</div>
	</div>
	<main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
		<!-- 小组成员写的页面就放在这里!!!!!! -->
		<!-- router-view是组件显示的地方 -->
	    <router-view></router-view>
	</main>
</div>

	<!-- 自定义组件模板 -->
	
	<!-- 主页面左侧导航栏（6） --> 
	<template id="Home">
		<jsp:include page="Home.jsp" flush="true"/> 
	</template>
	<template id="InfoMations">
		<jsp:include page="InfoMations.jsp" flush="true"/> 
	</template>
	<template id="QueBaMations">
		<jsp:include page="QueBaMations.jsp" flush="true"/> 
	</template>
	<template id="AuthMations">
		<jsp:include page="AuthMations.jsp" flush="true"/> 
	</template>
	<template id="Exam">
		<jsp:include page="Exam.jsp" flush="true"/> 
	</template>
	<template id="OnlineExam">
		<jsp:include page="OnlineExam.jsp" flush="true"/> 
	</template>
	
	<template id="Test">
		<jsp:include page="Test.jsp" flush="true"/> 
	</template>
	<!-- 信息管理模块里的顶部导航栏（10） -->
	<template id="DepartManage">
		<jsp:include page="InfoMations/DepartManage.jsp" flush="true"/> 
	</template>
	<template id="ClassManage">
		<jsp:include page="InfoMations/ClassManage.jsp" flush="true"/> 
	</template>
	<template id="ProManage">
	<jsp:include page="InfoMations/ProManage.jsp" flush="true"/> 
	</template>	
	<template id="ExeClassManage">
		<jsp:include page="InfoMations/ExeClassManage.jsp" flush="true"/> 
	</template>	
	<template id="StuManage">
		<jsp:include page="InfoMations/StuManage.jsp" flush="true"/> 
	</template>	
	<template id="CourseManage">
		<jsp:include page="InfoMations/CourseManage.jsp" flush="true"/> 
	</template>
	<template id="SemesterManage">
		<jsp:include page="InfoMations/SemesterManage.jsp" flush="true"/> 
	</template>	
	<template id="StcManage">
		<jsp:include page="InfoMations/StcManage.jsp" flush="true"/> 
	</template>	
	<template id="PacManage">
		<jsp:include page="InfoMations/PacManage.jsp" flush="true"/> 
	</template>	
	<template id="ClassesManage">
		<jsp:include page="InfoMations/ClassesManage.jsp" flush="true"/> 
	</template>
	<!-- 题库管理模块里的顶部导航栏（3） -->
	<template id="UnitManage">
		<jsp:include page="QueBaMations/UnitManage.jsp" flush="true"/> 
	</template>	
	<template id="QuestManage">
		<jsp:include page="QueBaMations/QuestManage.jsp" flush="true"/> 
	</template>	
	<template id="QsManage">
		<jsp:include page="QueBaMations/QsManage.jsp" flush="true"/> 
	</template>	
	<!-- 权限管理模块里的顶部导航栏（5） -->
	<template id="UserPer">
		<jsp:include page="AuthMations/UserPer.jsp" flush="true"/> 
	</template>	
	<template id="PositionPer">
		<jsp:include page="AuthMations/PositionPer.jsp" flush="true"/> 
	</template>	
	<template id="FunctionPer">
		<jsp:include page="AuthMations/FunctionPer.jsp" flush="true"/> 
	</template>	
	<template id="PerConfig">
		<jsp:include page="AuthMations/PerConfig.jsp" flush="true"/> 
	</template>	
	<template id="PerControl">
		<jsp:include page="AuthMations/PerControl.jsp" flush="true"/> 
	</template>	
	<!-- 考试模块里的顶部导航栏（3） -->
	<template id="ExamManage">
		<jsp:include page="Exam/ExamManage.jsp" flush="true"/> 
	</template>	
	<template id="RandVolu">
		<jsp:include page="Exam/RandVolu.jsp" flush="true"/> 
	</template>	
	<template id="Sotcr">
		<jsp:include page="Exam/Sotcr.jsp" flush="true"/> 
	</template>	
	<!-- 在线考试模块里的顶部导航栏（2） -->
	<template id="exam">
		<jsp:include page="OnlineExam/Exam.jsp" flush="true"/> 
	</template>	
	<template id="Vtep">
		<jsp:include page="OnlineExam/Vtep.jsp" flush="true"/> 
	</template>	
<script>
	//总思想：把各个组件都拆分开来 顺序是:自定义组件模板template(定义模板内容)→routes(绑定地址)→
	//VueRouter(绑定routes属性)→最后到Vue(绑定VueRouter)
	//先绑定template组件模板,用Vue.extend方法
	/* 主页面左侧导航栏（6） */
	var Home = Vue.extend({
		template : "#Home"
	});
	var InfoMations = Vue.extend({
		template : "#InfoMations"
	});
	var QueBaMations = Vue.extend({
		template : "#QueBaMations"
	});
	var AuthMations = Vue.extend({
		template : "#AuthMations"
	});
	var Exam = Vue.extend({
		template : "#Exam"
	});
	var OnlineExam = Vue.extend({
		template : "#OnlineExam"
	});
	
	var Test = Vue.extend({
		template : "#Test"
	});
	
	/* 信息管理模块里的顶部导航栏（10） */
	var DepartManage = Vue.extend({
		template : "#DepartManage"
	});
	var ClassManage = Vue.extend({
		template : "#ClassManage"
	});
	var ProManage = Vue.extend({
		template : "#ProManage"
	});
	var ExeClassManage = Vue.extend({
		template : "#ExeClassManage"
	});
	var StuManage = Vue.extend({
		template : "#StuManage"
	});
	var CourseManage = Vue.extend({
		template : "#CourseManage"
	});
	var SemesterManage = Vue.extend({
		template : "#SemesterManage"
	});
	var StcManage = Vue.extend({
		template : "#StcManage"
	});
	var PacManage = Vue.extend({
		template : "#PacManage"
	});
	var ClassesManage = Vue.extend({
		template : "#ClassesManage"
	});
	
	/* 题库管理模块里的顶部导航栏（3） */
	var UnitManage = Vue.extend({
		template : "#UnitManage"
	});
	var QuestManage = Vue.extend({
		template : "#QuestManage"
	});
	var QsManage = Vue.extend({
		template : "#QsManage"
	});
	
	/* 权限管理模块里的顶部导航栏（5） */
	var UserPer = Vue.extend({
		template : "#UserPer"
	});
	var PositionPer = Vue.extend({
		template : "#PositionPer"
	});
	var FunctionPer = Vue.extend({
		template : "#FunctionPer"
	});
	var PerConfig = Vue.extend({
		template : "#PerConfig"
	});
	var PerControl = Vue.extend({
		template : "#PerControl"
	});
	/* 考试模块里的顶部导航栏（3） */
	var ExamManage = Vue.extend({
		template : "#ExamManage"
	});
	var RandVolu = Vue.extend({
		template : "#RandVolu"
	});
	var Sotcr = Vue.extend({
		template : "#Sotcr"
	});
	/* 在线考试模块里的顶部导航栏（2） */
	var exam = Vue.extend({
		template : "#exam"
	});
	var Vtep = Vue.extend({
		template : "#Vtep"
	});
	
	//再把VueRouter内的routes给绑定赋值(把地址和组件模板绑定起来)
	var routes = [ {
		path : "/Home",
		component : Home
	}, {
		path : "/InfoMations",
		component : InfoMations,
		children : [ {
			path : "DepartManage",
			component : DepartManage
		}, {
			path : "ClassManage",
			component : ClassManage
		}, {
			path : "ProManage",
			component : ProManage
		}, {
			path : "ExeClassManage",
			component : ExeClassManage
		}, {
			path : "StuManage",
			component : StuManage
		}, {
			path : "CourseManage",
			component : CourseManage
		}, {
			path : "SemesterManage",
			component : SemesterManage
		}, {
			path : "StcManage",
			component : StcManage
		}, {
			path : "PacManage",
			component : PacManage
		}, {
			path : "ClassesManage",
			component : ClassesManage
		} ]
	}, {
		path : "/QueBaMations",
		component : QueBaMations,
		children : [ {
			path : "UnitManage",
			component : UnitManage
		}, {
			path : "QuestManage",
			component : QuestManage
		}, {
			path : "QsManage",
			component : QsManage
		} ]
	}, {
		path : "/AuthMations",
		component : AuthMations,
		children : [ {
			path : "UserPer",
			component : UserPer
		}, {
			path : "PositionPer",
			component : PositionPer
		}, {
			path : "FunctionPer",
			component : FunctionPer
		}, {
			path : "PerConfig",
			component : PerConfig
		}, {
			path : "PerControl",
			component : PerControl
		} ]
	}, {
		path : "/Exam",
		component : Exam,
		children : [ {
			path : "ExamManage",
			component : ExamManage
		}, {
			path : "RandVolu",
			name:"RandVolu",
			component : RandVolu
		}, {
			path : "Sotcr",
			component : Sotcr
		} ]
	}, {
		path : "/OnlineExam",
		component : OnlineExam,
		children : [ {
			path : "Exam",
			component : exam
		}, {
			path : "Vtep",
			component : Vtep
		} ]
	}, {
		path : "/Test",
		component : Test,
	} ];
	
	Vue.component('volume', {
		data: function () {
		    return {
		      count: 0
		    }
		  },
		  template: '<div><button v-on:click="count++">+</button><button v-on:click="count--">-</button></div>'
		})
	//把VueRouter绑定routes属性，一层连一层
	var router = new VueRouter({
		routes : routes,
	/*这里可以简写成routes。*/
	});
	var vm = new Vue({
		el : "#Menu-router",
		router : router,
	/*这里也可以简写成router*/
	});
</script>