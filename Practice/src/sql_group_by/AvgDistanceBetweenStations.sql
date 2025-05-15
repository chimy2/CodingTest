-- 노선별 평균 역 사이 거리 조회하기

-- mysql
select route, concat(round(sum(d_between_dist), 1), 'km') as total_distance, concat(round(avg(d_between_dist), 2), 'km') as average_distance from subway_distance group by route order by round(sum(d_between_dist), 1) desc;