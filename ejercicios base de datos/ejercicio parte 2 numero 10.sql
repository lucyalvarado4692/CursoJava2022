use capgemin_arg;
select job_title, salary
from jobs as job join employees as emp
where salary >13000 and not job.JOB_ID like 'REP'
