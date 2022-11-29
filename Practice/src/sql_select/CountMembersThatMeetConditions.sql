-- 조건에 맞는 회원수 구하기

-- mysql
select count(*) from user_info where age between 20 and 29 and year(joined) = 2021 
select count(*) from user_info where age like '2%' and joined like '2021%'
-- oracle
select count(*) from user_info where age between 20 and 29 and to_char(joined, 'yyyy') = 2021 