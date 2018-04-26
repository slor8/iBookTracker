<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#userTable').DataTable();
    } );
</script>
<html>
<body>
<head role="banner">
    <nav id="navbar-primary" class="navbar" role="navigation">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbar-primary-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="searchBooks.jsp">Search</a></li>
                    <li><a href="addBook.jsp">Add Book</a></li>
                    <li><a href="viewBook">View Books</a></li>
                    <li><img id="logo-navbar-middle" src="images/logo.png" width="200"></li>
                    <li><a href="checkOutBook.jsp">Issue Book</a></li>
                    <li><a href="viewIssueBook">View Issue Books</a></li>
                    <li><a href="returnBook">Return Book</a></li>
                    <li><a href="#">Logout</a></li>
                </ul>
            </div>
        </div>
    </nav>
</head>

<div class="container-fluid">
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>Id</th>
        <th>Title</th>
        <th>Author</th>
        <th>ISBN</th>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.isbn}</td>
            </tr>

        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
