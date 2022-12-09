use capgemini_arg;
-- select * from employees
select first_name, last_name, job_id, salary, commission_pct, salary + commission_pct
from employees
where first_name in ('Alberto')
-- alberto no existe

