
# Application Flow

### User Sign-Up
1. User chooses sign up on the home page
1. User fills out the sign up form and submits.
1. Request goes to sign up servlet.
1. Servlet creates user object and then creates user in the database.
1. Response to user confirming addition (show a message on the jsp)

### User Log-In
1. User chooses Log in on the home page (available only on the home page)
1. Enter username and password to submits.
1. If user is authenticated, the server will handler allowing access to edit pages. JDBCRealm used for authentication
1. If authentication fails, show error message.

### After Login-in: User
1. Six options are given: Search Book, Add, View Books, Borrow Books, View Borrow Books, Return Books, Logout
1. Search Book -> Search book by first name by Using google book API
1. Add -> Add book
1. View Books -> List all books
1. Borrow Books -> Check-out book
1. View Borrow Books ->  List all Borrow Books
1. Return Books -> Return book
1. Logout -> Exit

### Search Book

### Add Book
1. Option only available to logged in users with proper role
1. User enters book details
1. Details are sent to add book servlet
1. Servlet create book servlet
1. Servlet create book object
1. Servlet sends object to dao
1. Dao adds book to the database (book table)
1. Servlet sends confirmation to add page that book has been added.

### View Book
1. Page sends a request to view book servlet along with criteria(all).
1. Servlet uses the book dao to select book according to criteria
1. Dao performs select and creates book objects from results.
1. Dao return list of books by user add.
1. Servlet sends list back to book jsp.
1. Book report jsp displays the list of books.
1. Consider paging results so page does not get super long and too much data is sent.

### Borrows Book
1. Option only available to logged in users with proper role
1. User select Borrows book to report on
1. User enter Borrows Book details
1. Details are sent to Borrows Book Servlet
1. Servlet create Borrow Book report object
1. Servlet sends object to dao
1. Dao adds returnBook book to the database
1. Servlet sends confirmation to returnBook book page that returnBook book has been added.

### View Borrow Book
1. Page sends a request to view returnBook book servlet along with criteria(all).
1. Servlet uses the returnBook dao to select book according to criteria
1. Dao performs select and creates returnBook object from results.
1. Dao returns list of returnBook book by user.
1. Servlet sends list back to returnBook jsp.
1. Borrow reports jsp display the returnBook.
1. Consider paging results so page does not get long and too much data is sent.

### Return Book
1. Option only available to logged in users with proper role
1. User selects return book to report on
1. User enter return book detail
1. Detail are sent to Return Book report servlet
1. Servlet create return book object
1. Servlet sends object to dao
1. Dao adds report to the database
1. Servlet sends confirmation to report page that reports has been added.

### After Login-in: Admin
1. Four options are given: Add, View, Delete, Logout
1. Add -> Add new user
1. View -> List of all users 
1. Delete -> Delete user
1. Logout -> Exit


### About
1. Static page - html only?
1. Consider making contact info configurable. 




