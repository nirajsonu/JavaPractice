CREATE TABLE Employee (
    eid INT PRIMARY KEY,
    name VARCHAR(100),
    job_title VARCHAR(100)
);

CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(100),
    eid INT,
    FOREIGN KEY (eid) REFERENCES Employee(eid)
);


CREATE TABLE Address (
    address_id INT PRIMARY KEY,
    street VARCHAR(255),
    city VARCHAR(100),
    state VARCHAR(100),
    postal_code VARCHAR(20),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);


INSERT INTO Employee (eid, name, job_title) VALUES
(1, 'Alice Smith', 'Software Engineer'),
(2, 'Bob Johnson', 'Project Manager'),
(3, 'Charlie Davis', 'HR Manager');

INSERT INTO Department (dept_id, dept_name, eid) VALUES
(1, 'Engineering', 1),   -- Alice Smith as the manager
(2, 'HR', 3),            -- Charlie Davis as the manager
(3, 'Marketing', NULL);  -- No manager assigned yet

INSERT INTO Address (address_id, street, city, state, postal_code, dept_id) VALUES
(1, '123 Tech Park', 'San Francisco', 'CA', '94107', 1),  -- Engineering Department
(2, '456 Business Rd', 'New York', 'NY', '10001', 2),     -- HR Department
(3, '789 Market St', 'Los Angeles', 'CA', '90001', 3);    -- Marketing Department


Join three tables columns
------------------------
SELECT
    Employee.name AS EmployeeName,
    Department.dept_name AS DepartmentName,
    Address.city AS City
FROM
    Employee
JOIN
    Department ON Employee.eid = Department.eid
JOIN
    Address ON Department.dept_id = Address.dept_id;

SELECT MAX(salary) AS SecondHighestSalary FROM Employee WHERE salary < (SELECT MAX(salary) FROM Employee);
