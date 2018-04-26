<%@include file="taglib.jsp"%>
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
        <h3>- Add User -</h3>
        <hr/>
        <form action="addUser" method="POST">
            <label></label><input type="text" name="firstName" id="firstName" placeholder="First Name" required>
            <label></label><input type="text" name="lastName" id="lastName" placeholder="Last Name" required>
            <label></label><input type="text" name="userName" id="userName" placeholder="Username" required>
            <label></label><input type="password" name="password" id="password" placeholder="Password" required>
            <br/><br/>
            <button type="submit">Add</button>
        </form>
    </div>
</div>

