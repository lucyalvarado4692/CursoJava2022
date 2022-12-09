use capgemini_arg;
select First_name
from employees
group by first_name
having count(*)>1