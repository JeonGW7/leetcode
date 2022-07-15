CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      SELECT CASE WHEN COUNT(sub.Salary) < N THEN NULL               ELSE MIN(sub.Salary)
        END
    FROM (
        SELECT DISTINCT Salary
        FROM Employee
        ORDER BY Salary DESC
        LIMIT N 
        ) sub
      
  );
END
