<%@include file="taglib.jsp"%>
<c:set var="title" value="Welcome User" />


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