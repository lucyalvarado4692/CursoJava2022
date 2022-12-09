-- 4)- Listar los nombres y apellidos de los empleados y el nombre y apellido de su manager. El nombre tiene que estar separado del apellido por ' ' y debe ponerse la leyenda 'es empleado de' para que quede de la siguiente forma:
use capgemini_arg;
select concat(e.first_name,' ', e.last_name,' es empleado de ', m.first_name,' ', m.last_name) as oracion
from employees e join employees m
on e.manager_id = m.EMPLOYEE_ID
