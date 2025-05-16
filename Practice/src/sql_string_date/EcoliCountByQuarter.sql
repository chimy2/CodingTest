-- 분기별 분화된 대장균의 개체 수 구하기

-- mysql
select concat(quarter(differentiation_date), 'Q') as quarter, count(*) as ecoli_count from ecoli_data group by quarter order by quarter;