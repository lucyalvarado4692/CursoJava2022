use capgemini_arg;
select l.city, d.department_name
from locations l left outer join departments d
on l.LOCATION_ID = d.LOCATION_ID