--oracle
select to_char(datetime, 'hh24')/1 as hour, count(*) as count from animal_outs group by to_char(datetime, 'hh24')/1 having to_char(datetime, 'hh24')/1 between 9 and 19 order by to_char(datetime, 'hh24')/1

--mysql
SELECT date_format(datetime,"%k") as hour, count(*) from animal_outs group by date_format(datetime,"%k") having hour>=9 and hour<=19 order by hour*1