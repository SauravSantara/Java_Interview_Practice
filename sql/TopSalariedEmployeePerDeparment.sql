/* 
If there are 2 tables 
Employee with columns name, salary and dept_id
and Department with dept_id and dept_name
Then how to find employee name with highest salary from each department? 
*/

SELECT e.name AS EMPLOYEE_NAME, d.dept_name, e.salary
FROM (
    SELECT *, ROW_NUMBER() OVER (PARTITION BY dept_id ORDER BY salary DESC) AS rn
    FROM Employee
) e
JOIN Department d ON e.dept_id = d.dept_id
WHERE e.rn = 1;