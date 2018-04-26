<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

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
                    <li><a href="returnBook.jsp">Return Book</a></li>
                    <li><a href="logout">Logout</a></li>
                </ul>
            </div>
        </div>
    </nav>
</head>

<div class="container">
    <div class="login-container">
        <h3>- Add Book -</h3>
        <hr/>
        <form action="addBook" method="POST">
            <label></label><input type="text" name="title" id="title" placeholder="Title" required>
            <label></label><input type="text" name="author" id="author" placeholder="Author" required>
            <label></label><input type="text" name="isbn" id="isbn" placeholder="Isbn" required>
            <br/><br/>
            <button type="submit">Add Book</button>
        </form>
    </div>
</div>
