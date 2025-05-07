-- 물고기 종류 별 잡은 수 구하기

-- mysql
select count(*) as fish_count, fish_name from fish_name_info ni join fish_info i on ni.fish_type = i.fish_type group by fish_name order by fish_count desc;