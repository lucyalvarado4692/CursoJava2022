use capgemini_arg;
-- select * from departments
select first_name, last_name, salary, department_name, dep.DEPARTMENT_ID
from employees as emp join departments as dep
on dep.DEPARTMENT_ID = emp.DEPARTMENT_ID
-- where salary = any(select min(salary) from employees group by DEPARTMENT_ID)
where salary in (select min(salary) from employees group by DEPARTMENT_ID)
-- group by DEPARTMENT_ID

-- select  min(salary)
-- group by department_id

