// JavaScript Document
$(function (){
	$("#toup").click(function(){
		$("#loginpanel").removeClass('loginpanelswitch')
		$("#loginpanel").addClass('loginpanelafterswitch')
		$("#registerpanel").removeClass('registerpanelswitch')
		$("#registerpanel").addClass('registerpanelafterswitch')
	})
	$("#toin").click(function(){
		$("#loginpanel").removeClass('loginpanelafterswitch')
		$("#loginpanel").addClass('loginpanelswitch')
		$("#registerpanel").removeClass('registerpanelafterswitch')
		$("#registerpanel").addClass('registerpanelswitch')
	})
//	输入框样式控制
	$("#loginuser").focus(function(){
		$("#loginusername").addClass('after')
	})
	$("#loginuser").blur(function(){
			var data = $("#loginuser").val().trim();
			if(null==data||data==""){
		   	$("#loginusername").removeClass('after');
		}
	})
	$("#loginpwd").focus(function(){
		$("#loginuserpwd").addClass('after')
	})
	$("#loginpwd").blur(function(){
			var data = $("#loginpwd").val().trim();
			if(null==data||data==""){
		   	$("#loginuserpwd").removeClass('after');
		}
	})
	
	$("#registeruser").focus(function(){
		$("#registerusername").addClass('after')
	})
	$("#registeruser").blur(function(){
			var data = $("#registeruser").val().trim();
			if(null==data||data==""){
		   	$("#registerusername").removeClass('after');
		}
	})
	$("#registerpwd").focus(function(){
		$("#registeruserpwd").addClass('after')
	})
	$("#registerpwd").blur(function(){
			var data = $("#registerpwd").val().trim();
			if(null==data||data==""){
		   	$("#registeruserpwd").removeClass('after');
		}
	})
	$("#registerrepwd").focus(function(){
		$("#registeruserrepwd").addClass('after')
	})
	$("#registerrepwd").blur(function(){
			var data = $("#registerrepwd").val().trim();
			if(null==data||data==""){
		   	$("#registeruserrepwd").removeClass('after');
		}
	})
	$("#registeremial").focus(function(){
		$("#registeruseremail").addClass('after')
	})
	$("#registeremial").blur(function(){
			var data = $("#registeremial").val().trim();
			if(null==data||data==""){
		   	$("#registeruseremail").removeClass('after');
		}
	})
})