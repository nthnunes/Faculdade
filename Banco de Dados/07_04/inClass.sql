create database ex6;
use ex6;

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
values(100, 'Ana', '15/05/1980', 'F', '01/03/2010', 7500, 10);

insert into funcionario(idfuncionario, nome, nascimento, sexo, admissao, salario, iddepartamento)
values(200, 'Maria', '13/12/1978', 'F', '15/09/2012', 3938.12, 10);

insert into funcionario(idfuncionario, nome, nascimento, sexo, admissao, salario, iddepartamento)
values(300, 'José', '08/03/1997', 'M', '05/03/2009', 5200, 20);

insert into funcionario(idfuncionario, nome, nascimento, sexo, admissao, salario, iddepartamento)
values(400, 'Aparecido', '25/06/1979', 'M', '10/04/2011', 7385.59, 30);

insert into funcionario(idfuncionario, nome, nascimento, sexo, admissao, salario, iddepartamento)
values(500, 'Marcia', '03/02/1985', 'F', '01/03/2010', 3500, 40);

insert into funcionario(idfuncionario, nome, nascimento, sexo, admissao, salario, iddepartamento)
values(600, 'Orlando', '25/12/1983', 'M', '10/06/2012', 2754.15, 20);