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
        <th>Name</th>
        <th>Password</th>
        <th>Username</th>
        <th>Email</th>
        <th>Phone</th>
        <th>ISBN</th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.firstName} ${user.lastName}</td>
                <td>${user.password}</td>
                <td>${user.userName}</td>
                <td>${user.email}</td>
                <td>${user.phone}</td>
                <td>
                    <c:forEach var="borrow" items="${user.borrows}">
                        ${borrow.id} ${borrow.isbn}<br/>
                    </c:forEach>
                </td>
            </tr>


        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
