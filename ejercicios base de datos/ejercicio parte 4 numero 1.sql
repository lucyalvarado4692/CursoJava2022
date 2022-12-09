use capgemini_arg;
update employees e join employees s
set e.salary = (select s.salary order by s.HIRE_DATE limit 1),
	e.department_id = (select department_id from departments where department_name = 'IT')
-- select * from employees
where e.LAST_NAME = 'Grant'