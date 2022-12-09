use capgemini_arg;
select e.first_name, e.last_name, d.department_name, d.location_id
from employees e join departments d
where e.manager_id = 149