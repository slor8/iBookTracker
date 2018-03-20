<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
<body>

<div class="container-fluid">
    <h2>Add a new Book</h2>
    <form action="addBook" method="POST">
       <table>
           <tr><td>Title: <input type="text" name="title" id="title" data-error="Please enter the title." required/></td></tr>
           <tr><td>Author: <input type="text" name="author" id="author" data-error="Please enter the author." required/></td></tr>
           <tr><td>ISBN Number: <input type="text" name="isbn" id="isbn" data-error="Please enter the isbn." required/></td></tr>
           <tr><td><button type="submit">Add Book</button></td></tr>

       </table>
    </form>
</div>

</body>
</html>
