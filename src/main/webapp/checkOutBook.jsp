<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
<body>

<div class="container-fluid">
    <h2>Issue Book</h2>
    <form action="issueBook" method="POST">
        <table>
            <tr><td>Full-Name: <input type="text" name="name" id="name" required /></td></tr>
            <tr><td>Isbn: <input type="text" name="isbn" id="isbn" required /></td></tr>
            <tr><td>Email: <input type="text" name="email" id="email" required /></td></tr>
            <tr><td>Phone: <input type="text" name="phone" id="phone" required /></td></tr>
            <tr><td><button type="submit">Check-Out-Book</button></td></tr>

        </table>
        
        <br/>
        <a class="btn btn-info" href="welcomeUser">Back</a>

    </form>
</div>

</body>
</html>
