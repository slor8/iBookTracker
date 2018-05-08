<%@include file="taglib.jsp"%>
<c:set var="title" value="Book Found" />
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
        <h3>- Search Found -</h3>
        <hr/>
        <div>
            <img src="${bookListSrc[0]}"/>
            <img src="${bookListSrc[1]}"/>
            <img src="${bookListSrc[2]}"/>
            <img src="${bookListSrc[3]}"/>
            <img src="${bookListSrc[4]}"/>
            <img src="${bookListSrc[5]}"/>
        </div>
    </div>
</div>

