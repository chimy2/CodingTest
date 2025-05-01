-- 조건에 맞는 도서와 저자 리스트 출력하기

-- mysql
select book_id, author_name, date_format(published_date, '%Y-%m-%d') from book join author on book.author_id = author.author_id where category = '경제' order by published_date;

-- oracle
select book_id, author_name, to_char(published_date, 'yyyy-MM-dd') from book join author on book.author_id = author.author_id where category = '경제' order by published_date;