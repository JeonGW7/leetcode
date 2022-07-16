# Write your MySQL query statement below
select distinct id from (
SELECT id,temperature,IFNULL(LAG(temperature) OVER(order by recordDate),500000) as "secondtemperature",DATEDIFF(LAG(recordDate) OVER(order by recordDate),recordDate) as "days" from Weather
#order by recordDate
)x where x.days=-1 and x.temperature>x.secondtemperature