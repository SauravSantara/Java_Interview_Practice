SELECT DISTINCT salary
FROM Employees
ORDER BY salary DESC
LIMIT 1 OFFSET 3;

-- OR

SELECT MIN(salary) AS FourthHighest
FROM (
    SELECT DISTINCT salary
    FROM employees
    ORDER BY salary DESC
    LIMIT 4
) AS TopSalaries;