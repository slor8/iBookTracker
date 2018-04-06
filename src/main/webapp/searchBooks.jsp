<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
    <body>

        <div class="container-fluid" id="search">
            <h2>Search Books</h2>
            <form id="myform">
                <div class="form-group">
                    <label for="search">Search Books</label>
                    <input type="search" id="books"/>
                </div>

                <button type="submit" class="btn red">Search Books</button>

            </form>
        </div>

        <div id="result">

        </div>

    </body>
</html>
