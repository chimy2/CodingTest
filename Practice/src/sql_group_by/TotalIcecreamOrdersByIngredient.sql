-- 성분으로 구분한 아이스크림 총 주문량

-- 공통
select ingredient_type, sum(total_order) as TOTAL_ORDER from first_half fh join icecream_info ii on fh.flavor = ii.flavor group by ingredient_type order by TOTAL_ORDER;