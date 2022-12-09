use capgemini_arg; 
select department_id, avg(salary) as promedio, min(salary) as minimo, max(salary) as maximo from employees
where DEPARTMENT_ID = 110 or DEPARTMENT_ID = 20
group by department_id
-- todo perfecto
-- luego de ejecutar el update siguen los mismos valores





