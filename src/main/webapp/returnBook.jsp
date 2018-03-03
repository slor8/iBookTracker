<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
<body>

<div class="container-fluid">
    <h2>Return Book</h2>
    <form action="returnBook" method="POST">
        <table>
            <tr><td>Isbn: <input type="text" name="isbn" id="isbn"/></td></tr>
            <tr><td>Email: <input type="text" name="email" id="email"/></td></tr>
            <tr><td>Phone: <input type="text" name="phone" id="phone" /></td></tr>
            <tr><td><button type="submit">Return Book</button></td></tr>

        </table>
    </form>
</div>

</body>
</html>
