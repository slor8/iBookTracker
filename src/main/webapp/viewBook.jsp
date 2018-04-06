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
        <th>Title</th>
        <th>Author</th>
        <th>ISBN</th>
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.isbn}</td>
                <td>
                    <c:forEach var="issueBook" items="${book.issueBooks}">
                        <td>${issueBook.fullName}</td>
                        <td>${issueBook.email}</td>
                        <td>${issueBook.phone}</td>

            </c:forEach>
                </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
