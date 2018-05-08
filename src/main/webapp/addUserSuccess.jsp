<%@include file="taglib.jsp"%>
<c:set var="title" value="Adding User SuccessFul" />
<%@include file="head.jsp"%>

<head role="banner">
    <nav id="navbar-primary" class="navbar" role="navigation">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbar-primary-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="addUser.jsp">Add</a></li>
                    <li><img id="logo-navbar-middle" src="images/logo.png" width="200"></li>
                    <li><a href="viewAdmin">View Admin</a></li>
                    <li><a href="viewUser">View User</a></li>
                    <li><a href="logout">Logout</a></li>
                </ul>
            </div>
        </div>
    </nav>
</head>


<div class="container">
    <div class="alert alert-success">
        <strong>Successfully!</strong> Registered a new iBookTracker User!
    </div>
</div>