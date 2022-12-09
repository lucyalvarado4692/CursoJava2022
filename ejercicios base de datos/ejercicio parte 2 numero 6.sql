-- use capgemini_arg;
-- select count(DEPARTMENT_ID) as emp, department_id
-- from employees
-- where DEPARTMENT_ID >= 40
-- group by DEPARTMENT_ID
-- order by emp desc
-- luego probando la consulta del ejercico con un count en * en teoria me retornara mas por los valores nulos
use capgemini_arg;
select count(*)
from employees
where DEPARTMENT_ID >= 40
group by DEPARTMENT_ID
order by 1 desc
-- es igual
