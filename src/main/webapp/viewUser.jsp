<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
<head role="banner">
    <nav id="navbar-primary" class="navbar" role="navigation">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbar-primary-collapse">
                <ul class="nav navbar-nav">

                    <li><a href="addUser.jsp">Add User</a></li>
                    <li><img id="logo-navbar-middle" src="images/logo.png" width="200"></li>
                    <li><a href="viewUser">View User</a></li>
                    <li><a href="logout">Logout</a></li>
                </ul>
            </div>
        </div>
    </nav>
</head>
    <body>
        <div class="container-fluid">
            <table id="userTable" class="display" cellspacing="0" width="100%">
                <thead>
                    <th>Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Action</th>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${users}">
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.firstName}</td>
                            <td>${user.lastName}</td>
                            <td>${user.userName}</td>
                            <td>${user.password}</td>
                            <td>
                                <a href='updateUser2?id=${user.id}'>Update</a>
                                <a href='deleteUser?id=${user.id}'>Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
