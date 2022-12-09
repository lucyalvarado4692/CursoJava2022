use capgemini_arg;
-- select * from departments
update departments
set location_id = (select location_id from locations where country_id ='AR')
where department_name = 'it'