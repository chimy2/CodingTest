-- 카테고리 별 상품 개수 구하기

-- mysql
select left(product_code, 2) as category, count(*) as products from product group by category order by category;

-- oracle
select substr(product_code, 0, 2) as category, count(*) as products from product group by substr(product_code, 0, 2) order by category;