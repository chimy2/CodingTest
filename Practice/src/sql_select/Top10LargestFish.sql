-- 가장 큰 물고기 10마리 구하기

-- MySQL
select * from (select ID, LENGTH from fish_info order by length desc, id) a limit 10;