<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<div class="container">
        <div class="login-container">
            <div class="form-box">
                <h2>Add New User</h2>
                    <form action="addUser" method="POST">
                        <table>
                            <tr><td>First Name: <input type="text" name="firstName" id="firstName" required /></td></tr>
                            <tr><td>Last Name: <input type="text" name="lastName" id="lastName" required /></td></tr>
                            <tr><td>Username: <input type="text" name="userName" id="userName" required /></td></tr>
                            <tr><td>Password: <input type="password" name="password" id="password" required /></td></tr>
                            <tr><td><button type="submit">Add</button></td></tr>

                        </table>
                        <br/>
                        <a class="btn btn-info" href="welcomeAdmin">Back</a>
                </form>
            </div>
        </div>
</div>

