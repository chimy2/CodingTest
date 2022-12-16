-- 조건에 맞는 도서 리스트 출력하기

-- mysql
select book_id, date_format(published_date, '%Y-%m-%d') from book where year(published_date) = 2021 and category = '인문' order by published_date
-- oracle
select book_id, to_char(published_date, 'yyyy-MM-dd') from book where to_char(published_date, 'yyyy') = 2021 and category = '인문' order by published_date