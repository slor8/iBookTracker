<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Book" />
<%@include file="head.jsp"%>

<head role="banner">
    <nav id="navbar-primary" class="navbar" role="navigation">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbar-primary-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="searchBooks.jsp">Search</a></li>
                    <li><a href="checkOutBook.jsp">Check Out</a></li>
                    <li><img id="logo-navbar-middle" src="images/logo.png" width="200"></li>
                    <li><a href="viewIssueBook">View Check Out</a></li>
                    <li><a href="logout">Logout</a></li>
                </ul>
            </div>
        </div>
    </nav>
</head>

<div class="container" id="search">
    <h3>Search Book: </h3>
    <hr/>
    <form action="searchBooks" method="get">
        <input type="text" name="imageName" id="imageName" placeholder="Book Title" required>
        <input type="submit" value="Submit" class="btn btn-info btn-lg">
    </form>
</div>
