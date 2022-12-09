-- Hacer una consulta que muestre nombre y apellido del empleado, el nombre del departamento y la ciudad en donde se encuentra el departamento al cual pertenece para todos los empleados.
use capgemini_arg;
-- select * from locations -- location_id, country_id
-- select * from departments -- department_id, location_id
select e.first_name, e.last_name, d.department_name, l.city 
from employees e join departments d
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
join locations l
on d.LOCATION_ID = l.LOCATION_ID

