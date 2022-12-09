use capgemini_arg;
-- select * from 
select first_name, last_name, hire_date, date_add(hire_date, interval 6 month) as revision_salarial, dayname(hire_date), dayofweek(hire_date)
from employees