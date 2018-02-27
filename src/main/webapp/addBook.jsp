<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
<body>

<div class="container-fluid">
    <h2>Add a new Book</h2>
    <form action="addBook" method="POST">
       <table>
           <tr><td>Title: <input type="text" name="title" id="title"/></td></tr>
           <tr><td>Author: <input type="text" name="author" id="author"/></td></tr>
           <tr><td>ISBN Number: <input type="text" name="isbn" id="isbn"/></td></tr>
           <tr><td><button type="submit">Add Book</button></td></tr>

       </table>
    </form>
</div>

</body>
</html>
