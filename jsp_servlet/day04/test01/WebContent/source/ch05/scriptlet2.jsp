<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page contentType="text/html;charset=EUC-KR"%>
<h1>Scriptlet Example2</h1>
<%
	float f = 2.3f;
	int i = Math.round(f);
	Date date = new Date();
	
	// List<String> list = new ArrayList<String>();//뒷쪽에는 생성자
%>
실수 f의 반올림값은 ?  <%=i%><p/>
현재의 날짜와 시간은 ? <%=date.toString()%>

