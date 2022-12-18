-- 평균 일일 대여 요금 구하기

-- 공통
select round(avg(daily_fee)) average_fee from car_rental_company_car where car_type = 'SUV'