<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
    <body>
        <div class="container-fluid">
            <h6>You've SuccessFul Logged Out!</h6>
        </div>

        <div class="container">
            <div class="login-container">
                <div id="output"></div>
                <div class="avatar"></div>
                <h3>iBookTracker</h3>
                <div class="form-box">
                    <form action="./welcomeUser" method="GET">
                        <button class="btn btn-info btn-block login" type="submit">User</button>
                    </form>
                    <form action="./welcomeAdmin" method="GET">
                        <button class="btn btn-info btn-block login" type="submit">Admin</button>
                    </form>
                </div>
            </div>
        </div>


    </body>
</html>
