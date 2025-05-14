-- 자동차 평균 대여 기간 구하기

-- mysql
select car_id, round(avg(datediff(end_date, start_date) + 1), 1) as average_duration from car_rental_company_rental_history group by car_id having average_duration >= 7 order by average_duration desc, car_id desc

-- oracle
select car_id, to_char(round(avg(end_date - start_date + 1) * 10) / 10, 'FM9999.0') as average_duration from car_rental_company_rental_history group by car_id having avg(end_date - start_date + 1)  >= 7 order by to_number(average_duration) desc, car_id desc