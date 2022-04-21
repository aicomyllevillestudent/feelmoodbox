DROP TABLE IF EXIST products;
DROP TABLE IF EXIST orders;
DROP TABLE IF EXIST order_details;
DROP TABLE IF EXIST users;

CREATE TABLE products {
    id int PRIMARY KEY,
    name varchar(255) not null,
    description text null,
    amount int not null default 0,
    price double not null default 0.0,
    thumbnail varchar(255) not null
    }

CREATE TABLE orders {
    id int PRIMARY KEY,
    user_id int,
    date date
    }

CREATE TABLE order_details {
    id int PRIMARY KEY,
    order_id int,
    product_id int,
    quantity int not null default 1
    }

CREATE TABLE users {
    id int PRIMARY KEY,
    name varchar(255),
    email varchar(255)
    }