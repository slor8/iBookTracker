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
                    <li><a href="returnBook">Return Book</a></li>
                    <li><a href="logout">Logout</a></li>
                </ul>
            </div>
        </div>
    </nav>
</head>

<div class="container">
    <div class="login-container">
        <h3>- Issue Book -</h3>
        <hr/>
        <form action="checkOutBook" method="POST">
            <label></label><input type="text" name="fullName" id="name" placeholder="Full Name" required>
            <label></label><input type="text" name="isbn" id="isbn" placeholder="Isbn" required>
            <label></label><input type="text" name="email" id="email" placeholder="Email" required>
            <label></label><input type="text" name="phone" id="phone" placeholder="Phone" required>
            <br/><br/>
            <button type="submit">Issue Book</button>
        </form>
    </div>
</div>