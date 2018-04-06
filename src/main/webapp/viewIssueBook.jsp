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
        <th>Isbn</th>
        <th>Issue By:</th>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.isbn}</td>
                <td>
                    <c:forEach var="issueBook" items="${book.issueBooks}">
                    <strong>Name: </strong>${issueBook.fullName}<br/>
                    <strong>Email: </strong> ${issueBook.email}<br/>
                    <strong>Contact: </strong> ${issueBook.phone}

                </c:forEach>
                </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>

    <br/>
    <a class="btn btn-info" href="welcomeUser">Back</a>

</div>

</body>
</html>
