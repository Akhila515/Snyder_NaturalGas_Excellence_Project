DROP TABLE IF EXISTS ldc_charges;
DROP TABLE IF EXISTS meter_type;
DROP TABLE IF EXISTS ldc_daily_quantity;
DROP TABLE IF EXISTS ldc_tariff;
DROP TABLE IF EXISTS monthly_tolerance;
DROP TABLE IF EXISTS pooling_points;

CREATE TABLE ldc_charges (
    ldc_id INT,
    charge_name VARCHAR(255),
    ldc_charge_id INT PRIMARY KEY,
    meter_type_id INT,
    charge_type INT
);

CREATE TABLE meter_type (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ldc_id INT,
    meter_type_id INT,
    meter_type VARCHAR(100),
    created_by VARCHAR(100),
    created_on DATE,
    updated_by VARCHAR(100),
    updated_on DATE
);

CREATE TABLE ldc_daily_quantity (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ldc_id INT,
    daily_type_id INT,
    name VARCHAR(255),
    abbreviation VARCHAR(50),
    start_date DATE,
    end_date DATE
);

CREATE TABLE ldc_tariff (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ldc_id INT,
    ldc_rr_id INT,
    meter_type VARCHAR(100),
    unit VARCHAR(10),
    amount DECIMAL(10,2)
);

CREATE TABLE monthly_tolerance (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ldc_id INT,
    category_id INT,
    name VARCHAR(100),
    target_notes VARCHAR(255),
    status CHAR(1),
    use_as_exception CHAR(1)
);

CREATE TABLE pooling_points (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ldc_id INT,
    ldc_pooling_id INT,
    pool_name VARCHAR(255),
    account_number VARCHAR(50),
    primary_pipeline INT
);