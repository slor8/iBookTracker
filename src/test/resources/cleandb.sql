delete from user;
delete from borrow;
delete from book;
INSERT INTO user VALUES (1,'Joe','Coyne','jcoyne','supersecret1'),(2,'Fred','Hensen','fhensen','supersecret2'),(3,'Barney','Curry','bcurry','supersecret3'),(4,'Karen','Mack','kmack','supersecret4'),(5,'Dianne','Klein','dklein','supersecret5'),(6,'Dawn','Tillman','dtillman','supersecret6');
INSERT INTO borrow VALUES (1, 1, 1, '608-344-4534', '2018-02-13 14:57:58', '2018-02-16 14:57:58'), (2, 3, 2, '608-565-5004', '2018-02-13 14:57:58', '2018-02-16 14:57:58'), (3, 6, 3, '608-212-3422', '2018-02-17 14:57:58', '2018-02-17 14:57:58');
INSERT INTO book VALUES (1, 'Charlotte''s Web', 'E. B. White', '978-0-062-65875-3'), (2, 'The Time Traveler''s Wife', 'Audrey Niffenegger', '978-0-15-602943-8'), (3, 'Her Fearful Symmetry', 'Audrey Niffenegger', '978-0-224-08562-5');