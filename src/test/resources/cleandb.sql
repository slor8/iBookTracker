delete from user;
delete from book;
delete from issueBook;
INSERT INTO user VALUES (1,'Joe','Coyne','jcoyne','supersecret1'),(2,'Fred','Hensen','fhensen','supersecret2'),(3,'Barney','Curry','bcurry','supersecret3'),(4,'Karen','Mack','kmack','supersecret4'),(5,'Dianne','Klein','dklein','supersecret5'),(6,'Dawn','Tillman','dtillman','supersecret6');
INSERT INTO book VALUES (1,2,'Charlotte''s Web','E. B. White','978-0-062-65875-3'),(2,3,'The Time Traveler''s Wife','Audrey Niffenegger','978-0-15-602943-8'),(3,4,'Her Fearful Symmetry','Audrey Niffenegger','978-0-224-08562-5');
INSERT INTO issueBook VALUES (1,1,'dtillman@gmail.com','608-354-4453', 'Dawn Tillman'),(2,2,'jcoyne@gmail.com','608-353-3501', 'Joe Coyne'),(3,3,'kmack@gmail.com','608-242-1120', 'Karen Mack');
