-- 조건에 맞는 사원 정보 조회하기

-- mysql
select score, e.emp_no, emp_name, position, email from hr_employees e 
	join 
		(select emp_no, sum(score) as score from hr_grade 
			where year = 2022 group by emp_no) g 
		on e.emp_no = g.emp_no 
where score = (select sum(score) as sum from hr_grade where year = 2022 group by emp_no order by sum desc limit 1);