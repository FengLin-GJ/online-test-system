var app = new Vue({
	  el: '#app',
	  data: {
		login: '学生登陆',
	    st_no: '学号'
	  },
	  methods:{
		  loginSwitch: function(){
			  if( this.login=='学生登陆'){
				  this.login='教师登陆';
			  }else if(this.login=='教师登陆'){
				  this.login='管理员登陆';
			  } else{
				  this.login='学生登陆';
			  } 
			  
			  if( this.st_no=='学号'){
				  this.st_no='教师编号';
			  }else if(this.st_no=='教师编号'){
				  this.st_no='管理员账号';
			  }else{
				  this.st_no='学号';
			  }
		  }
	  }
	})

window.onload=function (){
	$('#login').click(function (){
		login();
	})
}

function login(){
	if($("#inputName").val()==""&&$("#inputPassword").val()==""){
		alert("请输入"+$("#name_label").text()+"和密码!");
	}else if($("#inputName").val()==""){
		alert("请输入"+$("#name_label").text()+"!");
	}else if($("#inputPassword").val()==""){
		alert("请输入密码!");
	}else{
		$.ajax({
	        url:'authMations_login.action', //要请求的url地址
	        type:'POST',  
	        async:true,  
	        data:{
	        	qaccount : $("#inputName").val(),
	        	qpassword : $("#inputPassword").val()
	        },  
	        dataType:'json',  
	        success:function(data) {
	        	if (data == 1) {
	                window.location.href = "HomeMenu.jsp?#/Home";
	            }  
	        	if (data == -1) {
	                alert("账号"+" "+$("#inputName").val()+" "+"不存在!");
	            }  
	        	if (data == -2) {
	                alert("密码错误!");
	            }  
	        },  
	        error:function(){
	            alert("登陆失败！");
	        },  
	    });
	}
}