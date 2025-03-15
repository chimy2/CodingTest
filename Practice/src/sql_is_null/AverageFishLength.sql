-- 잡은 물고기의 평균 길이 구하기

-- MySQL
select round(avg(ifnull(length, 10)), 2) as AVERAGE_LENGTH from fish_info