SELECT name as Employee 
FROM Employee e 
WHERE salary > (
    SELECT m.salary 
    FROM Employee m 
    WHERE e.managerId = m.id
);


-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna