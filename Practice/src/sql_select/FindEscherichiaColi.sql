-- 특정 형질을 가지는 대장균 찾기

-- mysql
select count(*) as COUNT from ecoli_data where conv(genotype, 10, 2) regexp '^((.*(1|0)0)?1|.*10(1|0))$';
select count(*) as COUNT from ecoli_data where genotype & 2 = 0 and (genotype & 1 > 0 or genotype & 4 > 0);