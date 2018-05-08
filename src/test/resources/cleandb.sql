delete from user;
delete from book;
delete from issueBook;
INSERT INTO user VALUES (1,'Joe','Coyne','jcoyne','supersecret1'),(2,'Fred','Hensen','fhensen','supersecret2'),(3,'Barney','Curry','bcurry','supersecret3'),(4,'Karen','Mack','kmack','supersecret4'),(5,'Dianne','Klein','dklein','supersecret5'),(6,'Dawn','Tillman','dtillman','supersecret6');
INSERT INTO book VALUES (1,2,'Charlotte''s Web'),(2,3,'The Time Traveler''s Wife'),(3,4,'Her Fearful Symmetry');
INSERT INTO issueBook VALUES (1, 1, 'Joe Coyne', 'jcoyne@gmail.com', '608-353-3501', 'Love'),(2, 3, 'Karen Mack', 'kmack@gmail.com', '608-242-1120','Mockjay');
