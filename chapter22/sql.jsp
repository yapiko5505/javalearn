<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/sql" %>

<sql:query var="rs" dataSource="jdbc/book" sql="select * from product" />

<%-- <c:forEach var="p" items="${rs.rows}"> --%>
    <%-- ${p.id} : ${p.name} : ${p.price}<br> --%>
<%-- </c:forEach> --%>

<c:forEach var="p" items="${list}">
    ${p.id} : ${p.name} : ${p.price}<br>
</c:forEach>

<%@include file="../footer.html" %>