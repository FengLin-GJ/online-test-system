window.onload=function (){
	$('#ms').click(function (){
		published();
	})
	
	$('#onlineExam').click(function (){
		publishedOut();
	})
}

function Examination(element){
	$(element).attr('disabled', true);
	timer();
	toTest();
}

function test(element){
	$('#kemu').html($(element).children("span").eq(0).text());
	$('#kemus').html($(element).children("span").eq(0).text());
	$('#shijian').html($(element).children("span").eq(2).text());
	$('#danyuan').html($(element).children("span").eq(3).text());
	$('#xzts').html($(element).children("span").eq(4).text());//选择题数
	$('#tkts').html($(element).children("span").eq(5).text());//填空题数
	$('#pdts').html($(element).children("span").eq(6).text());//判断题数
	$('#jdts').html($(element).children("span").eq(7).text());//简答题数
	$('#xztfs').html($(element).children("span").eq(8).text());//选择题分数
	$('#tktfs').html($(element).children("span").eq(9).text());//填空题分数
	$('#pdtfs').html($(element).children("span").eq(10).text());//判断题分数
	$('#jdtfs').html($(element).children("span").eq(11).text());//简答题分数
	$('#xztzf').html($(element).children("span").eq(4).text()*$(element).children("span").eq(8).text());//选择题总分
	$('#tktzf').html($(element).children("span").eq(5).text()*$(element).children("span").eq(9).text());//填空题总分
	$('#pdtzf').html($(element).children("span").eq(6).text()*$(element).children("span").eq(10).text());//判断题总分
	$('#jdtzf').html($(element).children("span").eq(7).text()*$(element).children("span").eq(11).text());//简答题总分
}

function publishedOut(){
	$.ajax({
        url:'queBaMations_publishedOut.action', //要请求的url地址
        type:'POST',  
        async:true,  
        dataType:'json',  
        success:function(data) {
        	if(data=='1'){
        		 
        	}else{
        		alert("操作失败！");
        	}
        },  
        error:function(){
            alert("操作失败！");
        }, 
    });
}

function published() {
	if ($("#subjects").val() == '') {
		alert("请填写考试科目！");
	} else if ($("#units").val() == '') {
		alert("请填写考试单元！");
	}else if ($("#time").val() == '') {
		alert("请填写考试时间！");
	}else if ($("#date").val() == '') {
		alert("请填写考试日期！");
	}else if ($("#qgsq_sum").val() == '') {
		alert("请填写选题题数！");
	}else if ($("#qlfb_sum").val() == '') {
		alert("请填写填空题数！");
	}else if ($("#qljq_sum").val() == '') {
		alert("请填写判断题数！");
	}else if ($("#qlsaq_sum").val() == '') {
		alert("请填写简答题数！");
	}else if ($("#qgsq_score").val() == '' || $("#qlfb_score").val() == ''
			|| $("#qljq_score").val() == '' || $("#qlsaq_score").val() == '') {
		alert("请填写每题分数！");
	}else{
		$.ajax({
	        url:'queBaMations_published.action', //要请求的url地址
	        type:'POST',  
	        async:true,  
	        data:{
	        	'testSuite.subjects' : $("#subjects").val(),
	        	'testSuite.units' : $("#units").val(),
	        	'testSuite.time' : $("#time").val(),
	        	'testSuite.date' : $("#date").val(),
	        	'testSuite.qgsq_sum' : $("#qgsq_sum").val(),
	        	'testSuite.qlfb_sum' : $("#qlfb_sum").val(),
	        	'testSuite.qljq_sum' : $("#qljq_sum").val(),
	        	'testSuite.qlsaq_sum' : $("#qlsaq_sum").val(),
	        	'testSuite.qgsq_score' : $("#qgsq_score").val(),
	        	'testSuite.qlfb_score' : $("#qlfb_score").val(),
	        	'testSuite.qljq_score' : $("#qljq_score").val(),
	        	'testSuite.qlsaq_score' : $("#qlsaq_score").val()
	        },  
	        dataType:'json',  
	        success:function(data) {
	        	if(data=='1'){
	        		alert("发布成功！"); 
	        	}else{
	        		alert("操作失败！");
	        	}
	        },  
	        error:function(){
	            alert("操作失败！");
	        }, 
	    });
	}
}

function toTest(){
	$("#kaishi").css("display","block");
	var choices=$('#xzts').text();  //选择题数
	var supports=$('#tkts').text();  //填空题数
	var corpses=$('#pdts').text();  //判断题数
	var saquestions=$('#jdts').text();  //简答题数
	$.ajax({
        url:'queBaMations_export.action', //要请求的url地址
        type:'POST',  
        async:true,  
        data:{
        	qgsq_number : choices,
        	qlfb_number : supports,
        	qljq_number : corpses,
        	qlsaq_number : saquestions
        },  
        dataType:'json',  
        success:function(data) {
        	if(data=='1'){
        		 
        	}else{
        		alert("操作失败！");
        	}
        },  
        error:function(){
            alert("操作失败！");
        }, 
    });
}

// 倒计时函数
function timer() {
	var time = new Date();
	time.setHours(0);
	time.setMinutes($("#shijian").text());
	time.setSeconds(0);
	var timeout;
	var timeshow = document.getElementById("timeshow");
	function countdown() {
		var hour = time.getHours();
		var min = time.getMinutes();
		var second = time.getSeconds();
		if (hour == "0" && min == "0" && second == "0") {
			alert("Time Out!");
			clearInterval(timeout);
		}
		time.setSeconds(second - 1);
		hour < 10 ? hour = "0" + hour : hour;
		min < 10 ? min = "0" + min : min;
		second < 10 ? second = "0" + second : second;
		timeshow.innerHTML = hour + ":" + min + ":" + second;
	}
	timeout = setInterval(countdown, 1000);
}

//提交考试试卷方法
function tijiao(){
	var sum=total_score(); //选择题分数
	alert(sum);
}

//选择题自动评分方法
function total_score(){
	var sum=0;
	var emp=parseInt($("#xztfs").text());
	var tempStr = $("#xzt_getScore").text();
	var num = tempStr.replace(/[^0-9]/ig, "");
	var string = tempStr.replace(/[^A-Z]/ig, "");
	var nums=num.split("");
	var strings=string.split(""); 
	for (i=0;i<nums.length;i++ ){
		if($("input[name="+nums[i]+"]:checked").val()==strings[i]){
			sum+=emp;
		}
	} 
	return sum;
}