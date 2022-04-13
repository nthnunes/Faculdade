-- 1)
create database ex06;
use ex06;

create table cidade(
    idcidade int unsigned not null,
    descricao varchar(50) not null,
    constraint pk_cidade primary key (idcidade)
) engine innodb;

create table departamento(
    iddepartamento int unsigned not null,
    descricao varchar(45) not null,
    telefone varchar(15),
    idcidade int unsigned not null,
    constraint pk_departamento primary key (iddepartamento),
    constraint fk_cidade_departamento foreign key(idcidade) references cidade(idcidade)
);

create table funcionario(
    idfuncionario int unsigned not null,
    nome varchar(80) not null,
    nascimento date not null,
    sexo char(1) not null,
    admissao date,
    salario decimal(8,2),
    iddepartamento int unsigned not null,
    constraint pk_funcionario primary key (idfuncionario),
    constraint fk_departamento_funcionario foreign key(iddepartamento) references departamento(iddepartamento)
);


-- 2)
insert into cidade(idcidade, descricao)
values (1, 'Marília');

insert into cidade(idcidade, descricao)
values (2, 'Vera Cruz');

insert into cidade(idcidade, descricao)
values (3, 'Pompeia');

insert into cidade(idcidade, descricao)
values (4, 'Garça');


insert into departamento(iddepartamento, descricao, telefone, idcidade)
values (10, 'Diretoria', '(14) 3433 1515', 1);

insert into departamento(iddepartamento, descricao, telefone, idcidade)
values (20, 'RH', '(14) 3433 1516', 1);

insert into departamento(iddepartamento, descricao, telefone, idcidade)
values (30, 'TI', '(14) 3492 1718', 2);

insert into departamento(iddepartamento, descricao, telefone, idcidade)
values (40, 'TI', '(14) 3471 1821', 4);

insert into departamento(iddepartamento, descricao, telefone, idcidade)
values (50, 'Vendas', '(14) 3471 1822', 4);


insert into funcionario(idfuncionario, nome, nascimento, sexo, admissao, salario, iddepartamento)
values(100, 'Ana', '1980-05-15', 'F', '2010-03-01', 7500, 10);

insert into funcionario(idfuncionario, nome, nascimento, sexo, admissao, salario, iddepartamento)
values(200, 'Maria', '1978-12-13', 'F', '2012-09-15', 3938.12, 10);

insert into funcionario(idfuncionario, nome, nascimento, sexo, admissao, salario, iddepartamento)
values(300, 'José', '1997-03-08', 'M', '2009-03-05', 5200, 20);

insert into funcionario(idfuncionario, nome, nascimento, sexo, admissao, salario, iddepartamento)
values(400, 'Aparecido', '1979-06-25', 'M', '2011-04-10', 7385.59, 30);

insert into funcionario(idfuncionario, nome, nascimento, sexo, admissao, salario, iddepartamento)
values(500, 'Marcia', '1985-02-03', 'F', '2010-03-01', 3500, 40);

insert into funcionario(idfuncionario, nome, nascimento, sexo, admissao, salario, iddepartamento)
values(600, 'Orlando', '1983-12-25', 'M', '2012-06-10', 2754.15, 20);


-- 3)
select * from cidade;


-- 4)
select departamento.iddepartamento, departamento.descricao, departamento.idcidade from departamento
join cidade
on (cidade.idcidade = departamento.idcidade)
where departamento.descricao = 'TI';


--5)
select funcionario.nome, funcionario.sexo from funcionario
join departamento
on (departamento.iddepartamento = funcionario.iddepartamento)
where funcionario.iddepartamento >= 20;


--6)
select funcionario.nome, funcionario.salario, departamento.descricao, cidade.descricao from funcionario
join departamento
on (departamento.iddepartamento = funcionario.iddepartamento)
join cidade
on (cidade.idcidade = departamento.idcidade)
where funcionario.salario < 5500;


-- 7)
select funcionario.nome, funcionario.admissao, departamento.descricao from departamento
join funcionario
on (funcionario.iddepartamento = departamento.iddepartamento)
where year(funcionario.admissao) = '2010';


-- 8)
select * from funcionario
where funcionario.salario > 3500 and funcionario.sexo = 'F';



-- DESAFIO --
-- 1)
select departamento.descricao, sum(funcionario.salario) from departamento
join funcionario
on (funcionario.iddepartamento = departamento.iddepartamento)
group by departamento.descricao;


-- 2)
select cidade.descricao, count(funcionario.idfuncionario) from funcionario
join departamento
on (departamento.iddepartamento = funcionario.iddepartamento)
join cidade
on (cidade.idcidade = departamento.idcidade)
group by cidade.descricao;