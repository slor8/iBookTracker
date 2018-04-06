<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
    <body>
        <div class="container">
            <form action="logOut" method="GET">
                <button class="btn btn-danger logOut" type="submit">Log Out</button>
            </form>
        </div>

        <div class="container-fluid">
            <h6>You've SuccessFul Login!</h6>
        </div>

        <div class="container">
            <div class="login-container">
                <div class="form-box">
                    <form action="searchBooks" method="GET">
                        <button class="btn btn-info btn-block login" type="submit">Search Book</button>
                    </form>

                    <form action="checkOutBook.jsp" method="GET">
                        <button class="btn btn-info btn-block login" type="submit">Issue Book</button>
                    </form>
                    <form action="viewIssueBook" method="GET">
                        <button class="btn btn-info btn-block login" type="submit">View Issue Books</button>
                    </form>
                    <form action="returnBook" method="GET">
                        <button class="btn btn-info btn-block login" type="submit">Return Book</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
