-- Python 개발자 찾기

-- MySQL
select id, email, first_name, last_name from developer_infos where 'Python' in (SKILL_1, SKILL_2, SKILL_3) order by id;