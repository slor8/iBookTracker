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

<div class="container" id="search">
    <h3>Search Book: </h3>
    <hr/>
    <form>
        <input type="search" name="book" id="book" placeholder="Book Title" required>
        <!--
        label for="search">Search Books</label>
        <input type="search" id="books"/>
        -->
        <button type="submit" class="btn red">Search</button>
    </form>
</div>
