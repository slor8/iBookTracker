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
        <th>Isbn</th>
        <th>Email</th>
        <th>Contact</th>
        </thead>
        <tbody>
        <c:forEach var="issueBook" items="${issueBooks}">
            <tr>
                <td>${issueBook.id}</td>
                <td>${issueBook.fullName}</td>
                <td>${issueBook.isbn}</td>
                <td>${issueBook.email}</td>
                <td>${issueBook.phone}</td>
            </tr>


        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>