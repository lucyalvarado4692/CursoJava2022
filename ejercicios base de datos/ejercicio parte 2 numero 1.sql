use capgemini_arg;
select e.first_name, e.last_name, e.job_id, d.department_name
from employees e join departments d
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
where (COMMISSION_PCT is null or COMMISSION_PCT = 0) and (salary between 7000 and 10000)
