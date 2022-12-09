use capgemini_arg;
select concat(e.first_name,' ', e.last_name,' es empleado de ',ifnull(m.first_name, 'la empresa.'), ' ', ifnull(m.last_name, ' No tiene manager'), '.') as oracion
from employees e left outer join employees m
on e.manager_id = m.EMPLOYEE_ID