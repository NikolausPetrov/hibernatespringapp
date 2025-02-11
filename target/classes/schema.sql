CREATE TABLE PERSONS (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         surname VARCHAR(255) NOT NULL,
                         age INT NOT NULL,
                         phone_number VARCHAR(20),
                         city_of_living VARCHAR(255)
);