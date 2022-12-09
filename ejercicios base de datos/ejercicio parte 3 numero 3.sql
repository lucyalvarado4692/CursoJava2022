use capgemini_arg;
-- 3)-Escriba una consulta que muestre el apellido del empleado, nombre del departamento, identificador de la localización y ciudad de todos los empleados que cobren comisión y que el país en el cual se encuentra el departamento sea ‘UK’.
select e.first_name, e.last_name, d.department_name, l.city 
from employees e join departments d
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
join locations l
on d.LOCATION_ID = l.LOCATION_ID
where COMMISSION_PCT is not null
and COUNTRY_ID = 'UK'
