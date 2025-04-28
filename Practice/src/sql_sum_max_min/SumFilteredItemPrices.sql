-- 조건에 맞는 아이템들의 가격의 총합 구하기

-- 공통
select sum(price) as TOTAL_PRICE from item_info group by rarity having rarity = 'LEGEND';