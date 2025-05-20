-- 부모의 형질을 모두 가지는 대장균 찾기

-- mysql
select c.id, c.genotype, p.genotype as parent_genotype from ecoli_data c join ecoli_data p on c.parent_id = p.id and c.genotype & p.genotype = p.genotype order by c.id;