<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results" />
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
    <div>
        <h2>Search For: <small>${searchItem}</small></h2>
    </div>
    <hr/>
    <div>
        <h3>Link found:
            <small>
                <a href="https://www.google.com/search?tbm=bks&q=${searchItem}">
                    Google Book Search
                </a>
            </small>
        </h3>
    </div>
    <div>
        <h3>Primary Book found:</h3>
        <img src="${imgSrc}"/>
    </div>
    <div>
        <h4>Other Results</h4>
        <img src="${imgArraySrc[2]}"/>
        <img src="${imgArraySrc[3]}"/>
        <img src="${imgArraySrc[4]}"/>
        <img src="${imgArraySrc[5]}"/>
    </div>

</div>


