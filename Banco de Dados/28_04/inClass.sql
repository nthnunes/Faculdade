create database inclass28_04;
use inclass28_04;

create table departamento(
    id int not null,
    descricao varchar(20) not null,
    constraint pk_departamento primary key (id)
) engine InnoDB;

insert into departamento (id, descricao)
values (1, 'DRH');
insert into departamento (id, descricao)
values (2, 'TI');
insert into departamento (id, descricao)
values (3, 'Almoxarifado');
insert into departamento (id, descricao)
values (4, 'Compras');
insert into departamento (id, descricao)
values (5, 'Contabilidade'), (6, 'Portaria');

select * from departamento;
update departamento set  descricao = 'Portaria'
where id = 6;

describe departamento;

use inclass28_04;
alter table departamento
add cadastro date not null;

select * from departamento;

update departamento
set cadastro = now()
where id > 0;