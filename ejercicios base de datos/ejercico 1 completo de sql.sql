use capgemini_arg;
-- tengo 2 tablas
-- employees y departments , leo sus encabezados
desc employees;
desc departments;
-- seleccioneame el nombre, apellido, job id y departamento name
select first_name, last_name, job_id, department_name, salary, COMMISSION_PCT
-- de que tabla los tomo y le aisgno una name variable
from employees as em inner join departments as dep
-- coloco la variable y el datos en comun de cada variable de su tabla respectiva
on em.department_id = dep.DEPARTMENT_ID
-- coloco lo de la comision que aun no entiendo
where (COMMISSION_PCT is null or COMMISSION_PCT = 0) and
(salary <= 10000 and salary >= 7000)

