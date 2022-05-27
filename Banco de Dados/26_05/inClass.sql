CREATE DATABASE ex11;
use ex11;

CREATE TABLE departamento (
CodDepto INT NOT NULL,
descrcao VARCHAR(40) NOT NULL,
CONSTRAINT PK_Departamento PRIMARY KEY (coddepto)
) ENGINE InnoDB;

CREATE TABLE Empregado (
CodEmp INT NOT NULL,
Nome VARCHAR(80) NOT NULL,
RG	VARCHAR(15),
Salario	DECIMAL(8,2),
CodDepto INT,	
Gerente CHAR(3),
CONSTRAINT PK_Empregado PRIMARY KEY (CodEmp),
CONSTRAINT FK_Empregado_Departamento foreign key (CodDepto) REFERENCES departamento(CodDepto)
) ENGINE InnoDB;

CREATE TABLE dependente (
codemp INT NOT NULL,
CodDep INT NOT NULL,
Nome VARCHAR(80) NOT NULL,
RG VARCHAR(15),
Sexo CHAR(1),
Data_Nasc DATE,
Grau_Parentesco  VARCHAR(40),
CONSTRAINT PK_Dependente PRIMARY KEY (codemp,CodDep),
CONSTRAINT FK_Dependente_Emregado FOREIGN KEY (codemp)
REFERENCES empregado(codemp)
) ENGINE InnoDB;

CREATE TABLE projeto (
CodProj VARCHAR(10) NOT NULL,
Nome VARCHAR(40) NOT NULL,
CodDepto INT NOT NULL,
CONSTRAINT PK_Projeto PRIMARY KEY (codproj),
CONSTRAINT FK_Projeto_Departamento FOREIGN KEY (coddepto)
REFERENCES departamento(coddepto)
) ENGINE InnoDB;

CREATE TABLE projeto_empregado (
CodProj VARCHAR(10) NOT NULL,
CodEmp INT NOT NULL,
Horas INT NOT NULL,
CONSTRAINT PK_Projeto_Empregado PRIMARY KEY (CodProj,CodEmp),
CONSTRAINT FK_Projeto_Empregado_Empregado FOREIGN KEY (CodEmp)
REFERENCES empregado(CodEmp),
CONSTRAINT FK_Projeto_Empregado_Projeto FOREIGN KEY (CodProj)
REFERENCES projeto(CodProj)
) ENGINE InnoDB;


INSERT INTO departamento 
VALUES (10,'Pesquisa'),(20,'Administração'),(30,'Finanças');

INSERT INTO empregado
VALUE(1,'Francisco Santos','146263269',1000,10,'Sim'),
(2,'Marcos Silva','256325638',500,20,'Não'),
(3,'José Souza','256398563',3000,20,'Sim'),
(4,'Maria Silva','569856423',2000,30,'Não'),
(5,'Claudete Pereira','125469856',800,30,'Não'),
(6,'Sonia Oliveira','568941263',700,30,'Sim'),
(7,'Vinicius Gaspar','541256986',1800,10,'Não'),
(8,'Luiz Carlos Ladeira','256845965',1500,20,'Não');

INSERT INTO dependente 
VALUES (1,1,'Pedro','146263269','M','983-03-25','Filho'),
(1,2,'Silmara','256325638','F','1962-08-16','Esposa'),
(2,1,'Marcelo','256398563','M','1981-03-14','Filho'),
(4,1,'Mariana','569856423','F','1983/11/15','Filha'),
(4,2,'Fernanda','856985412','F','1965/03/18','Esposa'),
(6,1,'Rafaela',NULL,'F','2000/12/16','Filha'),
(8,1,'Jessica',NULL,'F','1992-03-22','Filha'),
(8,2,'Lucas',NULL,'M','1992-03-22','Filho');

INSERT INTO projeto
VALUES ('P100','Projeto A',20),
('P200','Projeto B',30),
('P300','Projeto C',10),
('P400','Projeto D',30),
('P500','Projeto E',10),
('P600','Projeto F',20);

INSERT INTO projeto_empregado VALUES
('P100',1,100),
('P100',7,80),
('P200',2,60),
('P200',8,60),
('P300',5,80),
('P300',6,80),
('P400',4,60),
('P400',5,80),
('P400',6,60),
('P500',1,240),
('P600',3,120),
('P600',7,120);


-- 1)
use ex11;
select distinct empregado.nome from empregado
join projeto_empregado
on (projeto_empregado.codemp = empregado.codemp);


-- 2)
use ex11;
select d.coddepto, d.descrcao, avg(e.salario) "Media Depto"
from departamento d
join empregado e on (e.coddepto = d.coddepto)
group by d.coddepto, d.descrcao
order by d.coddepto;