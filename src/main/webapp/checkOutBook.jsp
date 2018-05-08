<%@include file="taglib.jsp"%>
<c:set var="title" value="Check Out Book" />
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
    <div class="login-container">
        <h3>- Check-Out-Book -</h3>
        <hr/>
        <form action="checkOutBook" method="POST">
            <input type="text" name="name" placeholder="Full Name" required>
            <input type="email" name="email" placeholder="Email" required>
            <input type="text" name="phone" placeholder="Phone ex. xxx-xxx-xxx" required>
            <input type="text" name="title" placeholder="Title" required>
            <br/><br/>
            <button type="submit">Check-Out</button>
        </form>
    </div>
</div>