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
        <th>Email</th>
        <th>Phone</th>
        <th>Full Name</th>
        </thead>
        <tbody>
        <c:forEach var="issueBook" items="${issueBooks}">
            <tr>
                <td>${issueBook.id}</td>
                <td>${issueBook.email}</td>
                <td>${issueBook.phone}</td>
                <td>${issueBook.fullName}</td>
            </tr>


        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
