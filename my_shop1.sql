DROP DATABASE IF EXISTS lydias_shop;
CREATE DATABASE lydias_shop;

use lydias_shop;


create table address(

	idAddress INT not null primary key,
	country INT NULL,
	city VARCHAR(50) NULL,
	postalCode VARCHAR(50) NULL, 
	streetLine1 VARCHAR(50) NULL,
    streetLine2 VARCHAR(50) null,
    home VARCHAR(50) NULL,
    apartament VARCHAR(50) null
    
);

 create table country (
	idCountry INT not null PRIMARY KEY,
	nombre VARCHAR(50) NULL,
	
    FOREIGN KEY (idCountry) REFERENCES address (idAddress)

);

create table size (
	idSize int not null primary key,
	size varchar(3) null
);

create table color (
	idColor int not null primary key,
	color varchar(10) null
);


create table product (
	idProduct INT NOT NULL auto_increment primary KEY,
	price FLOAT NOT NULL,
	category VARCHAR(50) NOT NULL,
	weight FLOAT NOT NULL,
    volume float not null
    
);

create table payment_method (
	idMethod INT not NULL AUTO_INCREMENT PRIMARY KEY,
	method FLOAT NULL
);

CREATE TABLE order_status (
    idOrderStatus INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    statusOrder VARCHAR(50) NULL
);

CREATE TABLE payment_status (
    idPaymentStatus INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    statusPayment VARCHAR(50) NULL
);

create table customer (
	idCustomer INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    idAddress int null,
	customerName varchar(50) NOT NULL,
	customerSurname VARCHAR(50) null,
	dateOfBirth DATE NOT NULL,
    email varchar(50) not null, 
    acountPassword varchar(50) not null
    
);

create table purchase_order (
	idOrder INT not null,
    idCustomer int not null, 
	customerAddress int null,
	paymentMethod int null,
    deliveryMethod varchar(50) null,
	paymentStatus int null,
    orderStatus int null,
    
    primary key (idOrder),
	FOREIGN KEY (customerAddress) REFERENCES address (idAddress),
    FOREIGN KEY (paymentMethod) REFERENCES payment_method (idMethod),
	FOREIGN KEY (paymentStatus) REFERENCES payment_status (idPaymentStatus),
	FOREIGN KEY (orderStatus) REFERENCES order_status (idOrderStatus),
    foreign key (idCustomer) references customer(idCustomer)
    
);

CREATE TABLE customerAddress (
    idCustomer INT NOT NULL ,
    idAddress int NOT NULL,
    
	    
	FOREIGN KEY (idCustomer) REFERENCES customer (idCustomer),    
	FOREIGN KEY (idAddress) REFERENCES address (idAddress)
    
);

create table product_description (
	idProductDescription int not null auto_increment primary key,
	idSize int NOT NULL,
    idColor int not null, 
	idProducts int NOT NULL,
    stock int not null, 
    
	FOREIGN KEY (idProducts) REFERENCES product (idProduct),  
    FOREIGN KEY (idSize) REFERENCES size (idSize),    
	FOREIGN KEY (idColor) REFERENCES color (idColor)
    
);
CREATE TABLE good (
    idOrder INT NOT NULL ,
    idProductDescription int NOT NULL,
    quantity int not null,
    
	FOREIGN KEY (idProductDescription) REFERENCES product_description (idProductDescription),    
	FOREIGN KEY (idOrder) REFERENCES purchase_order (idOrder)
    
);


