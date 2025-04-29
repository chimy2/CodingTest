-- 진료과별 총 예약 횟수 출력하기

-- mysql
select mcdp_cd as '진료과코드', count(*) as '5월예약건수' from appointment where date_format(apnt_ymd, '%Y%m') = '202205' group by mcdp_cd order by count(*), mcdp_cd;

-- oracle
select mcdp_cd as "진료과코드", count(*) as "5월예약건수" from appointment where to_char(apnt_ymd, 'yyMM') = '2205' group by mcdp_cd order by count(*), mcdp_cd;