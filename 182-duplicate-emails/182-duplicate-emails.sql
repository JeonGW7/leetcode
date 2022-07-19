# Write your MySQL query statement below
SELECT Distinct p1.email as "Email"
FROM Person p1, Person p2
WHERE p1.email = p2.email and p1.id <> p2.id