-- 1)
use trabfinal;
select estados.estado, regioes.regiao from estados
join regioes
on (estados.id = regioes.id)
group by regioes.id, estados.estado;

-- 2)
use trabfinal;
select count(municipios.municipio) from municipios
join estados
on (municipios.uf = estados.uf)
where estados.id = 1;

-- 3)
use trabfinal;
select round(avg(municipios.populacao)) as "Média" from municipios
where substring(municipios.municipio, 1, 5) = "Maria";

-- 4)
use trabfinal;
select municipios.municipio, municipios.populacao from municipios
where municipios.populacao = (
    select min(municipios.populacao) from municipios
    where municipios.uf = "AM");

-- 5)
use trabfinal;
select estados.estado, sum(municipios.populacao) from estados
join municipios
on (municipios.uf = estados.uf)
group by estados.estado
having sum(municipios.populacao) > 10000
order by sum(municipios.populacao) desc;

-- 6)
use trabfinal;
create view maiorespopulacoes as
select estados.estado, sum(municipios.populacao) from estados
join municipios
on (municipios.uf = estados.uf)
group by estados.estado
having sum(municipios.populacao) > 10000
order by sum(municipios.populacao) desc;

-- 7)
use trabfinal;
create index i_municipios_municipio
on municipios(municipio);

-- 8)
use trabfinal;
update estados
set estados.estado = "Amapá"
where estados.estado = "Amapa";

-- 9)
use trabfinal;
alter table regioes
add ativo int;

-- 10)
use trabfinal;
insert into municipios(codigo, uf, municipio, populacao)
values(202206, 'SP', 'Sistemas de Informação', 27);