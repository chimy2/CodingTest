-- 조건에 부합하는 중고거래 댓글 조회하기

-- mysql
select title, b.board_id, reply_id,  r.writer_id, r.contents, date_format(r.created_date, '%Y-%m-%d') from used_goods_board b join used_goods_reply r on b.board_id=r.board_id where date_format(b.created_date, '%Y%m') = 202210 order by r.created_date, title
-- oracle
select title, r.board_id, reply_id, r.writer_id, r.contents, to_char(r.created_date, 'yyyy-MM-dd') from used_goods_board b join used_goods_reply r on b.board_id=r.board_id where to_char(b.created_date, 'yyyyMM') = 202210 order by r.created_date, title