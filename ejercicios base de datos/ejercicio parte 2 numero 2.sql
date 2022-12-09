use capgemini_arg;
select first_name, last_name, job_id
from employees
where job_id in ('it_prog','st_man','pr_rep')
order by JOB_ID