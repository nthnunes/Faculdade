create database ex2403;
use ex2403;

create table cidade(
    idcidade int unsigned not null,
    descricao varchar(50) not null,
    constraint pk_cidade primary key (idcidade)
) engine inoodb;

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
    admissao datetime,
    salario decimal(8,2),
    iddepartamento int unsigned not null,
    constraint pk_funcionario primary key (idfuncionario),
    constraint fk_departamento_funcionario foreign key(iddepartamento) references departamento(iddepartamento)
);

insert into cidade(idcidade, descricao)
values (1, "Marília");

insert into cidade(idcidade, descricao)
values (2, "Vera Cruz");

insert into cidade(idcidade, descricao)
values (3, "Pompeia");

insert into cidade(idcidade, descricao)
values (4, "Garça");