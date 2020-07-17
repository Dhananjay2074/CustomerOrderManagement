delete from order_items;
delete from orders;

insert into orders(id, cust_name, order_date, shipping_address, total) values(1,'John','20-02-2020', 'PNQ','');
insert into orders(id, cust_name, order_date, shipping_address, total) values(2,'Salman','20-02-2020', 'PNQ','',);
insert into orders(id, cust_name, order_date, shipping_address ,total) values(3,'Amir','20-02-2020', 'PNQ','',);

insert into order_items(id, productcode, quantity, productName, order_id) values(1,'order item1', 2,'Watch', 1);
insert into order_items(id, productcode, quantity, productName, order_id) values(2,'order item2', 1,'Watch', 1);
insert into order_items(id, productcode, quantity, productName, order_id) values(3,'order item3', 5,'Watch', 1);
insert into order_items(id, productcode, quantity, productName, order_id) values(4,'order item4', 2,'Watch', 2);
insert into order_items(id, productcode, quantity, productName, order_id) values(5,'order item5', 1,'Watch', 2);