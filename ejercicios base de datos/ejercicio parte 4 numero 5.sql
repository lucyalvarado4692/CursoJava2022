use capgeemini_arg;
insert into departments (department_id, department_name, manager_id, location_id)
	select d.department_id + 200, concat(department_name,' ' ,country_id), d.manager_id, l.location_id
    from departments d inner join locations l
    on d.LOCATION_ID = l.LOCATION_ID
    

