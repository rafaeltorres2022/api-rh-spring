INSERT INTO employees(name) VALUES 
    ('Employee1'),
    ('Employee2'),
    ('Employee3'),
    ('Employee4'),
    ('Employee5');

INSERT INTO projects(name) VALUES
    ('Project1'),
    ('Project2'),
    ('Project3');

INSERT INTO project_employee (employee_id, project_id) VALUES
    (1, 1),
    (2, 1),
    (3, 1),
    (1, 2),
    (4, 2),
    (5, 3),
    (4, 3);