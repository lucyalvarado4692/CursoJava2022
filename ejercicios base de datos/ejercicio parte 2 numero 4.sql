use capgemin_arg;
-- select * from employees, de esta lista solo puedo obtener el department id
-- select * from departments, de esta lista obtengo department id y nolmbre del departament, asumire que cogeremos solo department id
select distinct department_id from employees
-- order by department_id
-- modificacion para que me aparezca el ultimo como el primero
order by department_id desc
-- cuando veamos el update revisar como cambiamos un campo especifico
-- where department_id is null set -1