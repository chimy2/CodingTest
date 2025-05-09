-- 월별 잡은 물고기 수 구하기

-- mysql
select count(*) as fish_count, month(time) as month from fish_info group by month order by month;