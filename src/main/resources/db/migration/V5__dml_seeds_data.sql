INSERT INTO member
(id, email, "name", phone)
VALUES(1, 'thomas.ariyanto30@gmail.com', 'Thomas Ariyanto', '081231997068');
INSERT INTO member
(id, email, "name", phone)
VALUES(3, 'budi@gmail.com', 'Budi Doremi', '08123456789');
INSERT INTO member
(id, email, "name", phone)
VALUES(4, 'adi@gmail.com', 'Adi Fasola', '0811223344');

INSERT INTO author
(id, "name")
VALUES(3, 'Robert T. Kiyosaki');
INSERT INTO author
(id, "name")
VALUES(4, 'Massimo Pigliucci');
INSERT INTO author
(id, "name")
VALUES(5, 'Henry Manampiring');

INSERT INTO book
(id, category, publishing_year, title, author_id)
VALUES(3, 'Financial', 1997, 'Rich Dad Poor Dad', 3);
INSERT INTO book
(id, category, publishing_year, title, author_id)
VALUES(4, 'Self Improvement', 2017, 'How to Be a Stoic', 4);
INSERT INTO book
(id, category, publishing_year, title, author_id)
VALUES(5, 'Novel', 2018, 'Filosofi Teras', 5);

INSERT INTO borrowing
(id, borrow_date, return_date, book_id, member_id)
VALUES(3, '2025-05-29', '2025-05-31', 5, 1);
INSERT INTO borrowing
(id, borrow_date, return_date, book_id, member_id)
VALUES(4, '2025-05-30', '2025-06-25', 3, 1);
INSERT INTO borrowing
(id, borrow_date, return_date, book_id, member_id)
VALUES(5, '2025-05-20', '2025-06-05', 3, 3);
INSERT INTO borrowing
(id, borrow_date, return_date, book_id, member_id)
VALUES(6, '2025-05-25', '2025-06-07', 4, 4);