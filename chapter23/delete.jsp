<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>削除する商品を入力してください。</P>
<form action="Search.action" method="post">
    <input type="text" name="keyword">
    <input type="submit" value="削除">
</form>

<%@include file="../footer.html" %>