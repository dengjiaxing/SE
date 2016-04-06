<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>后台管理系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">



<script type="text/javascript">
	function form_submit() {

		document.getElementById("login").submit();
	}
	function form_reset() {
		document.getElementById("login").reset();
	}
</script>
<style type="text/css">
body {
	background-color: #46A3FF;
}
</style>

</head>
<body>






	<div align="center" style="padding-top: 100px">

		<s:form action="admin" id="login" theme="simple">
			<table>

				<tr>
					<td background="images/login_07.gif" height="84px">

						<table>
							<tr height="30px">
								<td>用户名：</td>
								<td><input type="text" name="name" /></td>

							</tr>
							<tr height="30px">
								<td>密&nbsp;码：</td>
								<td><input type="password" name="pwd" /></td>
							</tr>
							<tr>
								<td colspan="2" background="images/login_09.gif" height="84px"
									align="center"><s:submit type="image" src="images/dl.gif"
										id="id_log" method="adminLogin">

									</s:submit> <img src="images/cz.gif" width="60" height="20"
									onclick="form_reset()"
									style="margin-left: 3px; margin-top: 6px;"></td>

							</tr>

						</table> <!-- <td height="84px">
						<div id="center_middle_right"></div>
					</td> -->

					</td>


				</tr>
			</table>

		</s:form>

	</div>


</body>
</html>