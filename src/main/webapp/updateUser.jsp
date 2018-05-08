<%@include file="taglib.jsp"%>
<c:set var="title" value="Update User" />
<%@include file="head.jsp"%>

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

<div class="container">
    <div class="login-container">
        <h3>-- Update User --</h3>
        <hr/>
        <form action="updateUser" method="post">
            <input type="hidden" name="id" value="${userId.id}" />
            <input type="text" value="${userId.firstName}" name="firstName" />
            <input type="text" value="${userId.lastName}" name="lastName" />
            <input type="text" value="${userId.userName}" name="userName" />
            <input type="password" value="${userId.password}" name="password" />
            <br/><br/>
            <button type="submit">Update & Save</button>
        </form>
    </div>
</div>

