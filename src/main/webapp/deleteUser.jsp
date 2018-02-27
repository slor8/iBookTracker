<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
<body>

<div class="container-fluid">
    <h2>Delete User</h2>
    <form action="DeleteUser" method="POST">
        <table>
            <tr><td>Enter User Id: <input type="text" name="title" id="title"/></td></tr>
            <tr><td><button type="submit">Delete User</button></td></tr>

        </table>

        <a href="">Back</a>
    </form>
</div>

</body>
</html>
