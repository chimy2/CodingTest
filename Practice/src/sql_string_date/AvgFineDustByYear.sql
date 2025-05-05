-- 연도 별 평균 미세먼지 농도 조회하기

-- mysql
select year(ym) as YEAR, round(avg(pm_val1), 2) as 'PM10', round(avg(pm_val2), 2) as 'PM2.5' from air_pollution where location2 = '수원' group by YEAR order by YEAR; 