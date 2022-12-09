use capgemein_arg;
select min(salary), max(salary), max(salary)-min(salary) as difference from employees
group by job_id