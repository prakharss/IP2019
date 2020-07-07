-- nth highest salary (SEE ALL METHODS - DENSE RANK, RANK)
select min(salary) from (select distinct(salary) from worker w order by salary desc) yo where rownum<=3;

-- take all combination (desc,desc), (ASC,DESC) -  SEE HOW IT WORKS
select w.*, row_number() over (order by salary desc) from worker w order by salary desc;

select hicn_no, row_number() over (partition by hicn_no order by hicn_no) from cms_mmr_restate;
select hicn_no, row_number() over (order by hicn_no) from cms_mmr_restate;