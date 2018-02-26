<%@include file="taglib.jsp"%>
<div class="container">
    <form action="./logOut" method="GET">
        <button class="btn btn-danger logOut" type="submit">Log Out</button>
    </form>
</div>
<div class="container">
    <div class="login-container">
        <div class="form-box">
            <form action="addUser" method="GET">
                <button class="btn btn-info btn-block login" type="submit">Add User</button>
            </form>
            <form action="viewUser" method="GET">
                <button class="btn btn-info btn-block login" type="submit">View User</button>
            </form>
            <form action="deleteUser" method="GET">
                <button class="btn btn-info btn-block login" type="submit">Delete User</button>
            </form>
        </div>
    </div>
</div>

