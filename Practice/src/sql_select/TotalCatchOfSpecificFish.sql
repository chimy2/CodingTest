-- 특정 물고기를 잡은 총 수 구하기

-- mysql
select count(*) as fish_count from fish_info fi join fish_name_info fni on fi.fish_type = fni.fish_type and fish_name in ('BASS', 'SNAPPER')