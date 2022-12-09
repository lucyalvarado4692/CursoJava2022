use capgemini_arg;
select count(*), country_id
from locations
group by COUNTRY_ID