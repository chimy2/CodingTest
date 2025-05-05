-- 3월에 태어난 여성 회원 목록 출력하기

-- mysql
select member_id, member_name, gender, date_format(date_of_birth, '%Y-%m-%d') as date_of_birth from member_profile where month(date_of_birth) = 3 and gender = 'W' and tlno is not null order by member_id;

-- oracle
select member_id, member_name, gender, to_char(date_of_birth, 'yyyy-MM-dd') from member_profile where to_char(date_of_birth, 'MM') = '03' and gender = 'W' and tlno is not null order by member_id;