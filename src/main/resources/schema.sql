CREATE TABLE if not exists jdbc.customers
(id serial PRIMARY KEY,
name varchar (50), 
surname varchar (50), 
age int, 
phone_number varchar (17)
);

CREATE TABLE if not exists jdbc.orders
(id serial PRIMARY KEY, 
date date, 
customer_id int, 
product_name varchar (255), 
amount int,
FOREIGN KEY (customer_id) REFERENCES jdbc.customers (id)
);
