<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
<body>

<div class="container-fluid">
    <h2>Issue Book</h2>
    <form action="issueBook" method="POST">
        <table>
            <tr><td>Full Name: <input type="text" name="title" id="title"/></td></tr>
            <tr><td>Isbn: <input type="text" name="isbn" id="isbn" /></td></tr>
            <tr><td>Email: <input type="text" name="author" id="author"/></td></tr>
            <tr><td>Phone: <input type="text" name="phone" id="phone"/></td></tr>
            <tr><td><button type="submit">Issue Book</button></td></tr>

        </table>
    </form>
</div>

</body>
</html>
