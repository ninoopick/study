<%@ page contentType="text/html;charset=EUC-KR"%>
<html>
<title>JSP��ũ��Ʈ Example</title>
<body>
<h1>Script Example</h1>
<%!
	String declaration = "Declaration";
%>
<%!
	public String decMethod(){
	return declaration;
}
%>
<%
	String scriptlet = "Scriptlet";
	String comment = "Comment";
	out.println("���尴ü�� �̿��� ��� : " + declaration + "<p>");
%>
������ ���1 : <%=declaration%> <p>
������ ���2 : <%=decMethod()%> <p>
��ũ��Ʈ���� ��� : <%=scriptlet%> <p>
<!-- JSP�ּ��κ� -->
<!-- JSP �ּ� 1 : <%=comment%> -->
<%-- JSP �ּ� 2 : <%=comment%> --%>
<%
	/*
		�ּ� 
		(������ �ּ�)
	*/
%>
<%// �ּ�(���� �ּ�) %>
</body>
</html>