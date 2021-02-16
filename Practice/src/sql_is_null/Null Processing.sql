-- mysql
select animal_type, ifnull(name, "No name"), sex_upon_intake from animal_ins order by animal_id
-- oracle
select animal_type, nvl(name, 'No name'), sex_upon_intake from animal_ins order by animal_id
-- ORA-00904: "No name": invalid identifier
select animal_type, nvl(name, "No name"), sex_upon_intake from animal_ins order by animal_id