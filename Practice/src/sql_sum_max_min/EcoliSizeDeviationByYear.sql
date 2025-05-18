-- 연도별 대장균 크기의 편차 구하기 

-- mysql
with yearly_max_size as (
    select year(differentiation_date) as year, max(size_of_colony) as size from ecoli_data group by year
)
select year(differentiation_date) as year, size - size_of_colony as year_dev, id from ecoli_data e join yearly_max_size y on year(e.differentiation_date) = y.year order by year, year_dev;