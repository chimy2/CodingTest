-- mysql
select a.animal_id, b.name from animal_ins a, animal_outs b where a.animal_id=b.animal_id order by b.datetime-a.datetime desc limit 2