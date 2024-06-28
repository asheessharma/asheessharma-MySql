# Write your MySQL query statement below
WITH TotalUsers AS (
    SELECT COUNT(*) AS total_users
    FROM Users
),
ContestUserCount AS (
    SELECT contest_id, COUNT(DISTINCT user_id) AS user_count
    FROM Register
    GROUP BY contest_id
)
SELECT c.contest_id,
       ROUND((c.user_count / t.total_users) * 100, 2) AS percentage
FROM ContestUserCount c, TotalUsers t
ORDER BY percentage DESC, contest_id ASC;
