<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<html>
    <title>Welcome</title>

    <body>


        <c:import url="indexActual.jsp" />


        <h2>Welcome To iBookTracker</h2>

        <form action="searchUser" class="form-inline">
            <div class="form-group">

                <label for="searchTerm">Search</label>

                <input type="text" class="form-control" id="searchTerm" name="searchTerm" aria-describedby="searchTermHelp" placeholder="Enter last name">

            </div>

            <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>

            <button type="submit" name="submit" value="viewAll" class="btn btn-primary">View all users</button>
        </form>
    </body>
</html>