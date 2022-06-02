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
select avg(sum(municipios.populacao)) as "Média" from municipios
where substring(municipios.municipio, 1, 5) = "Maria"
group by municipios.id;


-- 4)
