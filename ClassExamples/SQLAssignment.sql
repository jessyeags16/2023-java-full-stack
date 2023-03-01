/*Jessica Yeager 
2/26/23
The top queries are the queries for the assignment, 
below are the class examples we have been working on */

/* 1. 
Write a query to display the name, product line, and buy price of all products. 
The output columns should display as “Name,” “Product Line,” and “Buy Price.” 
The output should display the most expensive items first. */
Select p.productName AS 'Name', p.productLine AS 'Product Line', p.buyPrice AS 'Buy Price'
From products p
Order by buyPrice DESC;

/* 2. 
Write a query to display the first name, last name, and city name of all customers from Germany. 
Columns should display as “First Name,” “Last Name,” and “City.” 
The output should be sorted by “Last Name” (ascending). */
select c.contactFirstName AS 'First Name', c.contactLastName AS 'Last Name', c.city AS 'City' 
from customers c
where country='Germany'
order by contactLastName ASC;

/* 3. 
Write a query to display each of the unique values of the status field in the orders table. 
The output should be sorted alphabetically, increasing. Hint: The output should show exactly six rows. */
SELECT distinct(status)
FROM orders
ORDER BY status ASC;

/* 4. 
Select all fields from the payments table for payments made on or after January 1, 2005. 
The output should be sorted by the payment date from highest to lowest. */
Select paymentDate
FROM payments
WHERE DATE(paymentDate) >= '20050101'
order by paymentDate DESC;

/* 5. 
Write a query to display the Last Name, First Name, Email Address, and Job Title 
of all employees working out of the San Francisco office.
Output should be sorted by “Last Name.”  */
Select e.lastName, e.firstName, e.email, e.jobTitle
from employees e, offices o
where o.officeCode = 1
order by lastName;

/* 6. 
Write a query to display the Name, Product Line, Scale, and Vendor of all of the Car products – both classic and vintage. 
The output should display all vintage cars first (sorted alphabetically by name), 
and all classic cars last (also sorted alphabetically by name). */
select p.productName, p.productLine, p.productScale, p.productVendor
from products p, productlines pl
where p.productLine='Classic Cars' or p.productLine='Vintage Cars'
order by p.productName ASC ;

/*Homework Q1
of all the customer that have made orders, I want to see the customer name, first order date, month of the first order, the last order date,
year of the last order and how long this customer has been a customer ( last - first ) in days */
select  customerName as 'Customer Name', min(o.orderDate) as 'First Order', month(min(o.orderDate)) as 'Month of First Order', month(max(o.orderDate)) as 'The Last Order Date', 
	year(max(o.orderDate)) as 'Year of Last Order', datediff(max(o.orderDate),min(o.orderDate)) as 'Time between first and last order'
from customers c, orders o
where c.customerNumber = o.customerNumber
group by c.customerNumber
order by c.customerName;

/* Homework Q2
I want know the average margin for all orders sorted by the order with the highest margin first. 
This includes the margin on the quantity of products sold */
select o.orderNumber, avg(MSRP - buyPrice) as avg_margin
from orders o, orderdetails od, products p
where o.orderNumber = od.orderNumber
and od.productCode = p.productCode
group by o.orderNumber
order by avg_margin desc;

/* Homework Q3
EXTRA HARD - I want to see my most profitable custoemrs by the average profit margin of all their orders */ 
select c.customerNumber, c.customerName, avg(MSRP - buyPrice) as avg_margin
from orders o, orderdetails od, products p, customers c
where o.orderNumber = od.orderNumber
and od.productCode = p.productCode
and o.customerNumber = c.customerNumber
group by c.customerNumber
order by avg_margin desc;


/*create a case statement if the price each < 50, print low
price < 100 print medium
price >= 100 then price high */
SELECT orderLineNumber, 
    CASE 
        WHEN priceEach < 50  THEN 'Low Price'
        WHEN priceEach < 100 THEN 'Medium Price'
        ELSE 'High Price'
    END AS ProductPrice  
FROM orderdetails od;

/* Joins and Clauses lab */
/* 1. 
Write a query to display each customers name as "Customer Name" along with 
the name of the employee who is responsible for that customer's orders. 
The employee name should be in a single "SAles Rep" column, formatted as "lastName, firstName". 
The output should be sorted alphabetically by customer name */
select c.customerName as 'Customer Name', concat(e.lastName, ', ', e.firstName) as 'Sales Rep'
from customers c JOIN employees e 
on c.salesRepEmployeeNumber = e.employeeNumber
order by c.customerName asc;

/* 2. 
To determine which products are the most popular with our customers.
For each product, list the total quantity ordered, along with the total sale generated 
(total quantity ordered * priceEach) for that product. 
The column headers should be “Product Name,” “Total # Ordered,” and “Total Sale.” List the products by Total Sales descending. */
select p.productName as 'Product Name', sum(od.quantityOrdered) as 'Total # Ordered', sum(od.quantityOrdered * od.priceEach) as 'Total Sale'
from products p LEFT JOIN orderdetails od 
on p.productCode=od.productCode
group by p.productName, p.buyPrice
order by 3 desc;

/* self join example */
select e.lastName as 'Employee LastName', e.firstName as 'Employee First Name'.
from employees e, employees rt 
where e.reports








select * from employees WHERE firstName = "leslie";

select * from employees WHERE VacationHours < 40;

select lastName, firstName FROM employees where firstName like 'M%';

select e.firstName, e.lastName, c.customerName, c.phone, c.state
from employees e, customers c 
where e.employeeNumber = c.salesRepEmployeeNumber
order by e.firstName, e.lastName;

select * from employees;

update employees set extension = "JJJJ" where firstName like "J%";

insert into employees ( employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo, jobTitle, VacationHours)
	values ( 2023, "Yeager", "Jessica", "ext", "e@mail.com", 1, 1002, "TITLE", 500);
    
delete from employees where employeeNumber = 2023;

SELECT orderNumber, orderlinenumber, 
quantityOrdered * priceEach AS subtotal
FROM orderdetails
ORDER BY quantityOrdered * priceEach DESC;

SELECT firstName, LastName, reportsTo
FROM employees
ORDER BY reportsTo DESC;

Select productName, productLine, buyPrice
From products
ORDER BY buyPrice DESC;

SELECT distinct(status)
FROM orders
ORDER BY status ASC;

Select paymentDate
FROM payments
WHERE DATE(paymentDate) >= '20050101';

SELECT c.customerNumber, c.customerName, count(o.orderNumber) AS total_number_of_orders
from customers c, orders o
where c.customerNumber = o.customerNumber
group by c.customerNumber
order by customerName;

/*I want to see the order num, product name and quantity ordered price of the product and the MRSP
/*this doesnt need group by */

Select c.customerName, o.orderNumber, od.productCode, p.productName, od.quantityOrdered, p.buyPrice, p.MSRP, (p.MSRP * od.quantityOrdered) as customer_paid,
	((p.MSRP - p.buyPrice) * od.quantityOrdered) as product_margin
from orders o, orderdetails od, products p, customers c
where o.orderNumber = od.orderNumber
and od.productCode = p.productCode
and c.customerNumber = o.customerNumber;

/* I want to see customer name, product code and the product name
how many times a customer has purchased a particular product (not the number of products) */
Select c.customerName, p.productCode, p.productName, count(p.productCode)
From customers c, products p, orderdetails od, orders o
where c.customerNumber = o.customerNumber
and od.productCode = p.productCode
and o.orderNumber = od.orderNumber
group by c.customerNumber, p.productCode;

/*all products and how many times it was purchased*/
select p.productCode, p.productName, count(p.productCode) as order_count
From products p, orderdetails od
Where p.productCode = od.productCode
group by p.productCode
order by order_count desc, productName asc;

/*product line and the description and the number of products in that product line */
select pl.productLine, pl.textDescription, count(p.productcode) as product_count
from productlines pl, products p
Where p.productline = pl.productLine
group by p.productline;

/* product code, product name, total quantity order and total profit for each product that was purchased
so, if product x was ordered 10 times and had 50 items ordered in each order, what is the total gross margin */

select p.productCode, od.quantityOrdered, sum(od.quantityOrdered) as total_quantity_ordered, sum(p.buyPrice * od.quantityOrdered) as COGS,
	sum(p.MSRP * od.quantityOrdered) as net_sales, 
    sum((p.MSRP - p.buyPrice) * od.quantityOrdered) as total_profit
from products p,  orderdetails od
Where p.productCode = od.productCode
group by p.productCode;


