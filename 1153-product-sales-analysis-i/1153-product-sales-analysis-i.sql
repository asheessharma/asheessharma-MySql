# Write your MySQL query statement below
SELECT Pr.product_name, s.year , s.price FROM Sales s JOIN Product Pr ON s.product_id = Pr.product_id ;