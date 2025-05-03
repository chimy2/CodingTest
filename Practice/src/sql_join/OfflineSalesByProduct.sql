-- 상품 별 오프라인 매출 구하기

-- 공통
select product_code, sum(price * sales_amount) as total from product p join offline_sale o on p.product_id = o.product_id group by product_code order by total desc, product_code;