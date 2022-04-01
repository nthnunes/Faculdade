CREATE DATABASE aula01;
USE aula01;

CREATE TABLE departamento(
	codigo INT UNSIGNED NOT NULL,
	descricao VARCHAR(50) NOT NULL,
	CONSTRAINT PK_Departamento PRIMARY KEY (codigo)
) ENGINE INOODB;

DESC departamento;

ALTER TABLE departamento
ADD COLUMN telefone VARCHAR(15) NULL;

DESC departamento;

INSERT INTO departamento (codigo, descricao)
VALUES (100, 'Tecnologia da Informação');

INSERT INTO departamento (codigo, descricao, telefone)
VALUES (101, 'Departamento de Recursos Humanos', '(14) 33221510');

INSERT INTO departamento (codigo, descricao)
VALUES (102, 'Almoxarifado');

SELECT * FROM departamento;