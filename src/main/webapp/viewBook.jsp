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
        <th>Title</th>
        <th>Author</th>
        <th>Isbn</th>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}
                <td>${book.author}</td>
                <td>${book.isbn}</td>
            </tr>

        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
