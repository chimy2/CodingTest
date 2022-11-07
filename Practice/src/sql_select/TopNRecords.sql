-- 상위 n개 레코드

-- mysql
select name from animal_ins order by datetime limit 1
-- oracle
select * from (select name from animal_ins order by datetime) where rownum=1