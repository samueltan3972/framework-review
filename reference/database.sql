DROP TABLE IF EXISTS fruit;
DROP TABLE IF EXISTS dummy;

CREATE TABLE fruit (
    id INT NOT NULL,
    fruit_label INT,
    fruit_name VARCHAR(255),
    fruit_subtype VARCHAR(255),
    mass DECIMAL(10 , 2),
    width DECIMAL(10 , 2),
    height DECIMAL(10 , 2),
    color_score DECIMAL(10 , 2),
    PRIMARY KEY(id)
);

LOAD DATA INFILE 'path-to/fruit_data_with_colours.csv' 
INTO TABLE fruit 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

CREATE TABLE dummy (
    dummy_col1 VARCHAR(255),
    dummy_col2 VARCHAR(255),
    dummy_col3 VARCHAR(255),
    PRIMARY KEY(dummy_col1)
);