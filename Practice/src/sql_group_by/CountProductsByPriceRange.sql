-- 가격대 별 상품 개수 구하기

-- mysql
select truncate(price, -4) as price_group, count(*) as products from product group by price_group order by price_group;

-- oracle
select floor(price/10000) * 10000 as price_group, count(*) as products from product group by floor(price/10000) * 10000 order by price_group;