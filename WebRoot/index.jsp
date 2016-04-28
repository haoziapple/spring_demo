<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>SPRINGMVC</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<script type="text/javascript">
	function submit(val) {
		var frm = document.getElementById('frm');
		frm.action = val;
		frm.submit();
	}
</script>
<body>
	${result}
	<br />
	<input type="button" value="select"
		onclick="window.location='selectAction.do'" />
	<input type="button" value="insert" onclick="submit('insertAction.do')" />
	<input type="button" value="update" onclick="submit('updateAction.do')" />
	<input type="button" value="delete" onclick="submit('deleteAction.do')" />
	<table border="1">
		<tr>
			<td width="150px">ID</td>
			<td width="150px">姓名</td>
			<td width="250px">出生日期</td>
		</tr>
	</table>
	<hr color="#cdf" />
	<form id="frm" action="" method="post">
		<table>
			<tr>
				<td>ID</td>
				<td>姓名</td>
				<td>出生日期</td>
			</tr>
			<tr>
				<td><input name="id1" type="text" />
				</td>
				<td><input name="name1" type="text" />
				</td>
				<td><input name="birthday1" type="text" />
				</td>
			</tr>
			<tr>
				<td><input name="id2" type="text" />
				</td>
				<td><input name="name2" type="text" />
				</td>
				<td><input name="birthday2" type="text" />
				</td>
			</tr>
			<tr>
				<td><input name="id3" type="text" />
				</td>
				<td><input name="name3" type="text" />
				</td>
				<td><input name="birthday3" type="text" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
