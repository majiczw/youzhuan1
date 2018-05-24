<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>My JSP 'xinxifenlei.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <form method="post" action="xinxilei_c" id="biao">
     	<input type="text" placeholder="请输入分类名"  name="fenleiming"/>
     	<input type="button" value="添加分类"  onclick="tijiao()"/>
     
     </form>
  </body>
  <script language="javascript">
  	function tijiao()
  	{
  		document.getElementById("biao").submit();
  	}
  
  </script>
</html>
