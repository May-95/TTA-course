-- Task 1 Creating a database
-- creating database called library. 
CREATE DATABASE library;

-- indicating that I want to use 'library' database for the next commands. 
USE library;

-- creating books table to store the books the library has.
CREATE TABLE books (
ISBN CHAR(13) NOT NULL,
title VARCHAR(255) NOT NULL,
author VARCHAR(255) NOT NULL,
stock INT NOT NULL,
PRIMARY KEY (ISBN)
);
-- inserting library's books.
INSERT INTO books VALUES ("9781398515697", "The Seven Husbands of Evelyn Hugo", "Taylor Jenkins Reid", 3);
INSERT INTO books VALUES ("9781408891384", "The Song of Achilles", "Madeline Miller", 1);
INSERT INTO books VALUES ("9781408855652", "Harry Potter and the Philosopher's Stone", "J. K. Rowling", 2);
INSERT INTO books VALUES ("9781408855669", "Harry Potter and the Chamber of Secrets", "J. K. Rowling", 2);
INSERT INTO books VALUES ("9781408855676", "Harry Potter and the Prisoner of Azkaban", "J. K. Rowling", 2);
INSERT INTO books VALUES ("9781408855683", "Harry Potter and the Goblet of Fire", "J. K. Rowling", 2);
INSERT INTO books VALUES ("9781408855690", "Harry Potter and the Order of the Phoenix", "J. K. Rowling", 2);
INSERT INTO books VALUES ("9781408855706", "Harry Potter and the Half-Blood Prince", "J. K. Rowling", 2);
INSERT INTO books VALUES ("9781408855713", "Harry Potter and the Deathly Hallows", "J. K. Rowling", 2);
INSERT INTO books VALUES ("9780261103573", "The Fellowship of the Ring", "J. R. R. Tolkien", 1);
INSERT INTO books VALUES ("9780261103580", "The Two Towers", "J. R. R. Tolkien", 2);
INSERT INTO books VALUES ("9780261103597", "The Return of the King", "J. R. R. Tolkien", 2);
INSERT INTO books VALUES ("9780007448036", "A Game of Thrones", "George R.R. Martin", 3);
INSERT INTO books VALUES ("9780007447831", "A Clash of Kings", "George R.R. Martin", 3);
INSERT INTO books VALUES ("9780007447848", "A Storm of Swords: Steel and Snow", "George R.R. Martin", 3);
INSERT INTO books VALUES ("9780007447855", "A Storm of Swords: Blood and Gold", "George R.R. Martin", 3);
INSERT INTO books VALUES ("9780007447862", "A Feast for Crows", "George R.R. Martin", 3);
INSERT INTO books VALUES ("9780007466061", "A Dance With Dragons: Dreams and Dust", "George R.R. Martin", 3);
INSERT INTO books VALUES ("9780007466078", "A Dance With Dragons: After the Feast", "George R.R. Martin", 3);
INSERT INTO books VALUES ("9781472154668", "Where the Crawdads Sing", "Delia Owens", 2);

-- creating user table to store library's users.
CREATE TABLE users (
user_id INT NOT NULL AUTO_INCREMENT,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NOT NULL,
contact_number VARCHAR(12) NOT NULL,
address_1 VARCHAR(40) NOT NULL,
address_2 VARCHAR(40),
county VARCHAR(40) NOT NULL,
postcode VARCHAR(8) NOT NULL,
PRIMARY KEY (user_id)
);

-- inserting library users into the user table.
INSERT INTO users (first_name, last_name, contact_number, address_1, address_2, county, postcode)
VALUES ("Noah", "Anderson", "07735149756", "34 The Crescent", "London", "Greater London", "SW13 0NN");
INSERT INTO users (first_name, last_name, contact_number, address_1, address_2, county, postcode)
VALUES ("David", "Evans", "07826880860", "17 Charlton Park Rd", "London", "Greater London", "SE7 8HY");
INSERT INTO users (first_name, last_name, contact_number, address_1, address_2, county, postcode)
VALUES ("Rachel", "Thompson", "07752450180", "38 St Margaret's Rd", "London", "Greater London", "SE4 1YU");
INSERT INTO users (first_name, last_name, contact_number, address_1, address_2, county, postcode)
VALUES ("Matthew", "Turner", "07874968333", "19 Mercer St", "London", "Greater London", "WC2H 9QR");
INSERT INTO users (first_name, last_name, contact_number, address_1, address_2, county, postcode)
VALUES ("Dorothy", "Clarke", "07703346782", "104 New Rd", "London", "Greater London", "E4 9SY");
INSERT INTO users (first_name, last_name, contact_number, address_1, address_2, county, postcode)
VALUES ("Catherine", "Martin", "07982669417", "39 Richmond Rd", "London", "Greater London", "E8 3AA");
INSERT INTO users (first_name, last_name, contact_number, address_1, address_2, county, postcode)
VALUES ("Benjamin", "Kelly", "07803393367", "70 Westleigh Ave", "London", "Greater London", "SW15 6XF");
INSERT INTO users (first_name, last_name, contact_number, address_1, address_2, county, postcode)
VALUES ("Rebecca", "White", "07013919850", "27 Fairbridge Rd", "London", "Greater London", "N19 3EW");
INSERT INTO users (first_name, last_name, contact_number, address_1, address_2, county, postcode)
VALUES ("Michael", "Baker", "07804176231", "1 Portree Cl", "London", "Greater London", "N22 8HD");
INSERT INTO users (first_name, last_name, contact_number, address_1, address_2, county, postcode)
VALUES ("Jennifer", "Bennett", "07038287864", "105 Queens Cres", "London", "Greater London", "NW5 4EY");

-- creating loaned table to store who loaned which book.
CREATE TABLE loaned (
user_id INT, 
ISBN CHAR(13),
date_lent DATE NOT NULL,
due_date DATE NOT NULL,
FOREIGN KEY (user_id) REFERENCES users(user_id),
FOREIGN KEY (ISBN) REFERENCES books(ISBN)
);

-- inserting loaned books 
INSERT INTO loaned VALUES (1, "9781408855652", "22-08-02", "22-08-30");
INSERT INTO loaned VALUES (1, "9781408855669", "22-08-02", "22-08-30");
INSERT INTO loaned VALUES (1, "9781408855676", "22-08-02", "22-08-30");
INSERT INTO loaned VALUES (3, "9780261103573", "22-07-12", "22-08-09");
INSERT INTO loaned VALUES (6, "9781472154668", "22-08-15", "22-09-12");
INSERT INTO loaned VALUES (8, "9780007447848", "22-07-30", "22-08-27");
INSERT INTO loaned VALUES (8, "9780007447855", "22-07-30", "22-08-27");



-- Task 2 -- SQL Queries
-- select all users from library database
SELECT * FROM users;

-- select all books from the library database
SELECT * FROM books;

-- selecting all users that have loaned a book 
SELECT loaned.user_id, users.first_name, users.last_name
FROM loaned
JOIN users ON loaned.user_id=users.user_id;

-- selecting all books that have been loaned by a user
SELECT books.title, books.author, loaned.ISBN
FROM loaned 
JOIN books ON loaned.ISBN=books.ISBN;

-- selecting all users who have loaned a book and the books they have loaned
SELECT loaned.user_id, users.first_name, users.last_name, loaned.ISBN, books.author, books.title
FROM loaned
JOIN books ON loaned.ISBN=books.ISBN
JOIN users ON loaned.user_id=users.user_id;

-- selecting all the overdue books to see who has it and which book it is. 
SELECT users.user_id, users.first_name, users.last_name, books.title, books.author, loaned.due_date
FROM loaned
JOIN books ON loaned.ISBN=books.ISBN
JOIN users ON loaned.user_id=users.user_id
WHERE due_date<CURDATE();