-- 1
select name from world where name like 'Y%'

-- 2
select name from world where name like '%Y'

-- 3
select name from world where name like '%x'

-- 4
select name from world where name like '%land'


-- 5
select name from world where name like 'c%' and name like '%ia'

-- 6
select name from world where name like '%oo%'

-- 7
select name from world where name like '%a%a%a%'

-- 8
select name from world where name like '_t%'

-- 9
select name from world where name like '%o__o%'

-- 10
select name from world where name like '____'

-- 11
select name from world where name = capital

-- 12
select name from world where capital = concat(name, ' city')

-- 13
select capital, name from world where capital like concat('%', name, '%')

-- 14
select capital, name from world where capital like concat('%', name, '%') and capital != name

-- 15
select name, replace(capital, name, '') from world where capital like concat('%', name, '%') and capital != name

