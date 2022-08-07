# Write your MySQL query statement below
SELECT DISTINCT S1.id,
                S1.visit_date,
                S1.people
FROM   stadium S1,
       stadium S2,
       stadium S3
WHERE  ( ( Abs(S3.id - S1.id) = 2
           AND Abs(S2.id - S1.id) = 1
           AND Abs(S3.id - S2.id) = 1 )
          OR ( Abs(S3.id - S1.id) = 1
               AND Abs(S2.id - S3.id) = 2
               AND Abs(S1.id - S2.id) = 1 ) )
       AND S1.people >= 100
       AND S2.people >= 100
       AND S3.people >= 100
ORDER  BY S1.visit_date 