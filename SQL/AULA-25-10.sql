-- AULA INICIAL 24.10
-- COMANDOS BÁSICOS

SHOW DATABASES; -- LISTA OS BANCOS DE DADOS EXISTENTES

CREATE DATABASE empresa; -- cria um banco de dados com nome empresa

USE empresa; -- Seleciona o banco empresa para aplicar SQL

DROP DATABASE empresa; -- Apaga seu banco de dados

SHOW TABLES; -- LISTA TABELAS DO BANCO

-- CRIANDO TABELAS
-- DEPARTAMENTO: idDepartamento(numerico), nome(texto, salarioMax(numerico)

CREATE TABLE departamento(
idDepartamento INTEGER PRIMARY KEY auto_increment, -- CHAVE PRIMÁRIA
nome varchar (30) NOT null, -- TEXTO VARIÁVEL
salarioMax DECIMAL (10,2) NOT NULL -- DECIMAL DIGITOS PRECISÃO

);

DESC departamento; -- detalhar a tabela

-- tabela empregado

CREATE TABLE empregado(
idEmpregado integer primary key auto_increment,  -- o banco preenche automaticamente
nome varchar(30) not null, -- torna nome obrigatório
email varchar(30) unique not null, -- email não pode ser repitido
dataNasc Date not null, -- "199-02-01" - Padrão americano
salario decimal (10,2) not null, -- 10 digitos e 2 em precisão
idDepartamento INTEGER NOT NULL, -- campo pra guardar a chave do departamento
foreign key(idDepartamento) references departamento(idDepartamento) -- oficializa o departamento

);

CREATE TABLE dependente(
 idDependente integer primary key auto_increment,
 nome varchar(30) not null,
 dataNasc date not null,
 idResponsavel integer not null, -- idempregado
 foreign key(idResponsavel) references empregado(idEmpregado) -- torna o banco do relacionamento
 );
-- INSERIR DADOS -- 
insert into departamento values(null, "Recursos Humanos", 5500.0); -- segue a orddem das colunas
insert into departamento values(null, "TI", 8000.00);
insert into departamento values(null, "Suporte", 6000.00);

select*from departamento;
 insert into empregado values(null, "Joao","joao@gmail.com","2000-02-02",2000.00,1);
 insert into empregado values(null,"Maria","Maria@gmail.com","2011-11-11",3000.00,2);
 insert into empregado values(null,"Breno","Breno@gmail.com","1999-09-09",4000.00,3);
 
 select*from empregado; -- lista todos os empregados cadastrados

insert into dependente(nome, dataNasc,idResponsavel) values ("Ruan","2000-06-06",1);
insert into dependente(nome, dataNasc,idResponsavel) values ("Max","2000-07-07",2);
insert into dependente(nome, dataNasc,idResponsavel) values ("Ben","2000-08-08",3);
insert into dependente(nome, dataNasc,idResponsavel) values ("Ian","2000-05-05",1);

select*from dependente;

-- atualizar registros

update empregado
set salario = 5000.00; -- todos receberão 5000.00

update empregado
set salario = 5050.0, nome = "Tito", email = "tito@gmail.com", dataNasc = "1001-10-10"
where idEmpregado = 1;

update dependente
set nome = "Norb", dataNasc = "2552-12-12"
where idResponsavel = 1;

-- Deletar registros



