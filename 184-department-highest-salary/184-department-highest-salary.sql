# Write your MySQL query statement below
SELECT ms.department
      ,ms.name AS employee
      ,ms.salary
FROM(
    SELECT employee.name
        ,employee.salary
        ,department.name AS department
        ,MAX(salary) OVER(PARTITION BY departmentid) AS max_salary
        FROM employee
        INNER JOIN department ON employee.departmentid = department.id ) ms
Where ms.salary = ms.max_salary