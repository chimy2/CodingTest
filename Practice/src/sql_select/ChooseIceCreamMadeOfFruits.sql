-- 과일로 만든 아이스크림 고르기

-- 공통
select first_half.flavor from first_half, icecream_info where first_half.flavor = icecream_info.flavor and total_order >= 3000 and ingredient_type = 'fruit_based' order by total_order desc
select first_half.flavor from first_half join icecream_info on first_half.flavor = icecream_info.flavor where total_order >= 3000 and ingredient_type = 'fruit_based' order by total_order desc