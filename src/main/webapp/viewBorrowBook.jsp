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
        <th>ISBN</th>
        </thead>
        <tbody>
        <c:forEach var="borrow" items="${borrows}">
            <tr>
                <td>${borrow.id}</td>
                <td>${borrow.isbn}</td>
            </tr>


        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
