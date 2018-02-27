<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#userTable').DataTable();
    } );
</script>
<html>
<body>

<div class="container-fluid">
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Password</th>
        <th>Delete User</th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.firstName}
                <td>${user.lastName}</td>
                <td>${user.userName}</td>
                <td>${user.password}</td>
                <td><input type="checkbox" name="userCheckBox" value="${user.userName}"/></td>
            </tr>


        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
