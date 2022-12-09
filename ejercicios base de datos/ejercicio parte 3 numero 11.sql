use capgemin_arg;
select count(*), COUNTRY_NAME
from departments d join locations l 
on d.location_id = l.location_id
join countries c 
on l.country_id = c.COUNTRY_ID
join regions r 
on c.region_id = r.region_id
where region_name in ('Americas','Europe')
group by COUNTRY_NAME

-- select * from departments -- location id
-- select * from locations -- location_id, country_id
-- select * from  countries -- country_id, region_id
-- cuentamen cantidad de departementos agrupados por pais pero solo los paises de america y europa
-- select * from regions region_id 
-- select * from  countries country_id
