SELECT product_name FROM jdbc.orders
JOIN jdbc.customers c
ON c.id = orders.customer_id
WHERE lower(c.name) = lower(:name);