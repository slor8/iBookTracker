<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
    <body>

        <div class="container">
            <form action="./logOut" method="GET">
                <button class="btn btn-danger logOut" type="submit">Log Out</button>
            </form>
        </div>

        <div class="container-fluid">
            <h6>You successfully registered as a new iBookTracker User!</h6>
        </div>

        <div class="container">
            <div class="login-container">
                <div class="form-box">
                    <form action="addUser.jsp" method="GET">
                        <button class="btn btn-info btn-block login" type="submit">Add User</button>
                    </form>
                    <form action="viewUser" method="GET">
                        <button class="btn btn-info btn-block login" type="submit">View User</button>
                    </form>
                    <form action="deleteUser.jsp" method="GET">
                        <button class="btn btn-info btn-block login" type="submit">Delete User</button>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>
