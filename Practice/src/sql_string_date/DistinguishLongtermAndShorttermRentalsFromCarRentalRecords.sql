-- 자동차 대여 기록에서 장기/단기 대여 구분하기

-- mysql
select history_id, car_id, date_format(start_date, '%Y-%m-%d'), date_format(end_date, '%Y-%m-%d'), if(datediff(end_date, start_date) >= 29, '장기 대여', '단기 대여') rent_type from car_rental_company_rental_history where date_format(start_date, '%Y%m') = 202209 order by history_id desc
-- oracle
select history_id, car_id, to_char(start_date, 'yyyy-MM-dd'), to_char(end_date, 'yyyy-MM-dd'), case when end_date - start_date >= 29 then'장기 대여'else '단기 대여' end rent_type from car_rental_company_rental_history where to_char(start_date, 'yyyyMM') = '202209' order by history_id desc