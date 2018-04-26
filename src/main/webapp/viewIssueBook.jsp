<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#userTable').DataTable();
    } );
</script>

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
            <th>Name</th>
            <th>Isbn</th>
            <th>Email</th>
            <th>Phone</th>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <tr>
                <c:forEach var="returnBook" items="${book.returnBooks}">
                    <tr>
                    <td>${returnBook.fullName}</td>
                    <td>${returnBook.isbn}</td>
                    <td>${returnBook.email}</td>
                    <td>${returnBook.phone}</td>
                    </tr>
                </c:forEach>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

