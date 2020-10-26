-- 1
select population from world where name='Germany'

-- 2
select name, population from world where name in('Sweden', 'Norway', 'Denmark')

--3
select name, area from world where between 200000 and 250000
