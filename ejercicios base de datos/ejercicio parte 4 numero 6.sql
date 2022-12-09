use capgemini9_arg;
-- select * from employees
-- where HIRE_DATE = '1997-08-17'
-- no hay 
update employees
set department_id = (select DEPARTMENT_ID
from employees
group by department_id
order by count(*) desc
limit 1)
where  HIRE_DATE = '1997-08-17'