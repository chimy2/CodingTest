-- 한 해에 잡은 물고기 수 구하기

-- MySQL
select count(*) as FISH_COUNT from fish_info where year(time) = 2021