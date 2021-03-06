-- Alunos: Nathan Nunes e Ynuan Cruz

-- 2)
create database ex07;
use ex07;

create table departamento(
    iddepartamento int unsigned not null,
    nome varchar(45) not null,
    constraint pk_departamento primary key (iddepartamento)
) engine innodb;

create table telefone(
    telefone varchar(15) not null,
    iddepartamento int unsigned not null,
    constraint fk_departamento_telefone foreign key (iddepartamento) references departamento(iddepartamento),
    constraint pk_departamento primary key (telefone, iddepartamento)
) engine innodb;

create table grupo(
    idgrupo int unsigned not null,
    nome varchar(45) not null,
    constraint pk_grupo primary key (idgrupo)
) engine innodb;

create table produto(
    iditem int unsigned not null,
    nome varchar(45) not null,
    idgrupo int unsigned not null,
    constraint pk_produto primary key (iditem),
    constraint fk_grupo_produto foreign key (idgrupo) references grupo(idgrupo)
) engine innodb;

create table estoque(
    iddepartamento int unsigned not null,
    iditem int unsigned not null,
    cadastro date,
    quantidade int unsigned,
    valor decimal(4,2) not null,
    constraint fk_departamento_estoque foreign key (iddepartamento) references departamento(iddepartamento),
    constraint fk_produto_estoque foreign key (iditem) references produto(iditem),
    constraint pk_estoque primary key (iddepartamento, iditem)
) engine innodb;


-- 3)
insert into departamento(iddepartamento, nome)
values(1, "Matriz");

insert into departamento(iddepartamento, nome)
values(2, "Filial 01");

insert into departamento(iddepartamento, nome)
values(3, "Filial 02");


insert into telefone(telefone, iddepartamento)
values("3433-1519", 1);

insert into telefone(telefone, iddepartamento)
values("3433-1520", 1);

insert into telefone(telefone, iddepartamento)
values("3433-1216", 2);

insert into telefone(telefone, iddepartamento)
values("3433-1720", 3);


insert into grupo(idgrupo, nome)
values(1, "Limpeza");

insert into grupo(idgrupo, nome)
values(2, "Escritório");


insert into produto(iditem, nome, idgrupo)
values(1, "Detergente", 1);

insert into produto(iditem, nome, idgrupo)
values(2, "Papel A4", 2);

insert into produto(iditem, nome, idgrupo)
values(3, "Lápis", 2);

insert into produto(iditem, nome, idgrupo)
values(4, "Sabão Líquido", 1);


insert into estoque(iddepartamento, iditem, cadastro, quantidade, valor)
values(1, 1, "2022-01-31", 50, 2.50);

insert into estoque(iddepartamento, iditem, cadastro, quantidade, valor)
values(1, 2, "2022-02-15", 5000, 0.05);

insert into estoque(iddepartamento, iditem, cadastro, quantidade, valor)
values(1, 3, "2021-04-30", 100, 2.00);

insert into estoque(iddepartamento, iditem, cadastro, quantidade, valor)
values(2, 1, "2019-09-05", 20, 2.00);

insert into estoque(iddepartamento, iditem, cadastro, quantidade, valor)
values(2, 4, "2022-02-25", 3, 10.13);

insert into estoque(iddepartamento, iditem, cadastro, quantidade, valor)
values(2, 2, "2021-03-13", 500, 0.05);

insert into estoque(iddepartamento, iditem, cadastro, quantidade, valor)
values(3, 2, "2021-08-17", 100, 0.05);

insert into estoque(iddepartamento, iditem, cadastro, quantidade, valor)
values(3, 3, "2020-09-15", 30, 2.00);


-- 4)
select produto.nome, sum(estoque.quantidade) from estoque
join produto
on (estoque.iditem = produto.iditem)
where estoque.iddepartamento = 1
group by produto.nome;


-- 5)
select departamento.nome as "departamento", produto.nome as "produto", estoque.valor from estoque
join produto
on (produto.iditem = estoque.iditem)
join departamento
on (departamento.iddepartamento = estoque.iddepartamento)
where estoque.quantidade > 30 and estoque.quantidade < 1000;


-- 6)
select produto.nome, sum(estoque.quantidade) as "quantidade total",
round(estoque.valor * estoque.quantidade) as "valor total" from estoque
join produto
on (produto.iditem = estoque.iditem)
group by produto.nome;


-- 7)
select produto.nome as "produto", grupo.nome as "grupo" from produto
join estoque
on (estoque.iditem = produto.iditem)
join grupo
on (grupo.idgrupo = produto.idgrupo)
where datediff(curdate(), estoque.cadastro) > 180
group by produto.nome;


-- 8)
update estoque
join produto
on (produto.iditem = estoque.iditem)
set estoque.cadastro = curdate()
where produto.grupo = "Limpeza";


-- 9)
delete from estoque
where estoque.iddepartamento = 2;