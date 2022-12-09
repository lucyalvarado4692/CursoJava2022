use capgemini_arg;
select manager_id, last_name, job_id
from employees
where job_id not in ('SA_REP','AD_VP')
and last_name Like ('K%')
or (manager_id in ('100')
and last_name like ('%tb%'))
order by first_name, manager_id desc