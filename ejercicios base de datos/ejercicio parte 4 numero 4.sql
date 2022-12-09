use capgemini_arg;
-- select * from departments -- department_id loction_id
-- select * from locations -- location_id COUNTRY_ID
-- select * from employees -- department_id
delete from employees
where DEPARTMENT_ID = (select department_id from departments d inner join locations l on d.LOCATION_ID = l.LOCATION_ID where COUNTRY_ID = 'ca');
