# Write your MySQL query statement below
SELECT t.department
      ,t.employee
      ,t.salary
FROM(
    SELECT department.name AS department
        ,employee.name AS employee
        ,employee.salary
        ,DENSE_RANK() OVER (PARTITION BY departmentid ORDER BY salary DESC) AS dr
    FROM employee
        INNER JOIN department ON employee.departmentid = department.id ) t
WHERE t.dr <= 3