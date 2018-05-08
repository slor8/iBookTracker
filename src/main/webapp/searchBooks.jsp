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

<div class="container">
    <div class="login-container" id="search">
        <h3>- Search -</h3>
        <hr/>
        <form action="searchBooks" method="get">
            <input type="text" name="searchBook" id="searchBook" placeholder="Book Title" required>
            <br/>
            <button type="submit">Search</button>
        </form>
    </div>
</div>

