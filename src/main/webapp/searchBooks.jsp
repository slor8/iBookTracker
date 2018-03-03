<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
    <body>

        <div class="container-fluid" id="search">
            <h2>Search Books</h2>
            <form id="myform">
                <div class="form-group">
                    <input type="search" id="books"/>
                    <label for="search">Search Books</label>
                </div>

                <button type="submit" class="btn red">Search Books</button>

            </form>
        </div>

        <div id="result">

        </div>

    </body>
</html>
