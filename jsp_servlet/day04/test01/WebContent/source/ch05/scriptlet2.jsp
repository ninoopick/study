<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page contentType="text/html;charset=EUC-KR"%>
<h1>Scriptlet Example2</h1>
<%
	float f = 2.3f;
	int i = Math.round(f);
	Date date = new Date();
	
	// List<String> list = new ArrayList<String>();//���ʿ��� ������
%>
�Ǽ� f�� �ݿø����� ?  <%=i%><p/>
������ ��¥�� �ð��� ? <%=date.toString()%>

