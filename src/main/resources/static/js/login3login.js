// JavaScript Document
$(function (){
	//注册一个窗口加载事件
	$("#signin").click(function(){
		var username = $("#loginuser").val().trim();
		var userpwd = $("#loginpwd").val().trim();
		//前端判断非空
		if((username==null||username=="")&&(userpwd==null||userpwd=="")){
            $("#msg").html("用户名和密码不能为空").css("color","white");
            $("#msg").removeClass().addClass('msgshakeanimate');
            var set = setTimeout(function(){
                $("#msg").removeClass();
            },700)
        }else if((username==null||username=="")&&(userpwd!=null||userpwd!="")){
            $("#msg").html("用户名不能为空").css("color","white");
            $("#loginuser").css("border-bottom","2px solid red");
            $("#loginusername").css("color","red");
            $("#loginusername").addClass('shakeanimate');
            $("#loginusername").removeClass().addClass('shakeanimate');
            var set = setTimeout(function(){
                $("#loginusername").removeClass();
            },900)
        }else if((username!=null||username!="")&&(userpwd==null||userpwd=="")){
            $("#msg").html("Σσ(・Д・；)密码不能为空").css("color","white");
            $("#loginpwd").css("border-bottom","2px solid red");
            $("#loginuserpwd").css("color","red");
            $("#loginuserpwd").removeClass().addClass('shakeanimate');
            var set = setTimeout(function(){
                $("#loginuserpwd").removeClass();
            },900)
        }else{
            var params = {"name":username,"userpwd":userpwd};
            $.ajax({
                type:"POST",
                url:"/rin_start/signin",
                data:params,
                // datatype:"text",
                statusCode: {
                    200: function (){
                        // alert('登录成功');
                        $("#msg").html("登录成功").css("color","green");
                    },
                    500: function() {
                        // alert('登录失败');
                        $("#msg").html("登录失败:账户验证不通过").css("color","red");
                    },
                    404: function() {
                        // alert('未找到用户信息!');
                        $("#msg").html("未找到用户信息").css("color","red");
                    }
                }
            })
        }
	})
})