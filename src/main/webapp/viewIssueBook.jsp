<%@include file="taglib.jsp"%>
<c:set var="title" value="View Check-Out Book" />
<%@include file="head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#userTable').DataTable();
    } );
</script>
<html>
<body>

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

<div class="container-fluid">
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
            <th>Id</th>
            <th>Name</th>
            <th>Username</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Title</th>
            <th>Return Book</th>
        </thead>
        <tbody>
        <c:forEach var="issue" items="${issueBooks}">
            <tr>
                <td>${issue.id}</td>
                <td>${issue.fullName}</td>
                <td>${pageContext.request.remoteUser}</td>
                <td>${issue.email}</td>
                <td>${issue.phone}</td>
                <td>${issue.title}</td>
                <td>
                    <a href='returnBook?id=${issue.id}'>Return Book</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
