<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>こんにちは！</p>
<p>Hello!</p>

<p><% out.println(new java.util.Date()); %></p>

<%@include file="../footer.html" %>