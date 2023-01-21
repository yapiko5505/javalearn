<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>削除項目を入力してください。</p>
<form action="delete" method="post">
    商品名<input type="text" name="name">
    価格<input type="text" name="price">
    <input type="submit" value="削除">
</form>

<%@include file="../footer.html" %>