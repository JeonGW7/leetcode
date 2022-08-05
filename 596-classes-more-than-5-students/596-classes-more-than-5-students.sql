# Write your MySQL query statement below
select class
from (
select class,
count(class)
from courses
group by class
having count(class) >= 5)a