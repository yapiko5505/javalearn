<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>削除項目を入力してください。</p>
<form action="delete" method="post">
    <input type="text" name="name">
    <input type="submit" value="削除">
</form>

<%@include file="../footer.html" %>