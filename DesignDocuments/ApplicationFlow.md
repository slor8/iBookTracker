
# Application Flow

### User Sign-Up
1. User chooses create an account.
1. User fills out the sign up form and submits.
1. Request goes to sign up servlet.
1. Servlet creates a user object and then creates user in the database.
1. Response to user confirming addition (Show a message on the jsp)

### User Log-In
1. User chooses Log in on the home page (available only on the home page)
1. Enter username and password to submits.
1. If user is authenticated, the server will handler allowing access to edit pages. JDBCRealm used for authentication
1. If authentication fails, show error message.

### After Login-in: User
1. Four options are given: Add, View, Delete, Logout
1. Add -> Add new user
1. View -> List of all users 
1. Delete -> Delete user
1. Logout -> Exit


### After Login-in: Admin
1. Six options are given: Add, View Books, Issue Books, View Issue Books, Return Books, Logout
1. Add -> Add book
1. View Books -> List all books
1. Issue Books -> Check-out book
1. View Issue Books ->  List all Issue Books
1. Return Books -> Return book
1. Logout -> Exit

### About






