use capgemini_arg; 
select DEPARTMENT_ID, avg(salary) as promedio
from employees
group by department_id
order by avg(salary) desc
limit 1
