CREATE SCHEMA storeappdb;

USE storeappdb;

CREATE TABLE Product_Details (
    product_id INT NOT NULL AUTO_INCREMENT,
    product_name VARCHAR(255),
    product_price DOUBLE
)