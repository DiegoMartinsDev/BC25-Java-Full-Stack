CREATE DATABASE estoque;
USE estoque;

CREATE TABLE nomesAlimentos(
idProduto integer primary key auto_increment,
nome varchar(20) not null,
peso decimal (5,2) not null,
tipo varchar(20) not null
);                
select*from nomesAlimentos; -- exibe a tabela com os dados

delete from nomesAlimentos where idProduto = 100; -- Exclui o produto que não tem nome, peso e tipo não identificado na linha 10


CREATE TABLE controleEstoque( 
idProduto integer not null,
Lote char(6) not null,
validade date not null,
qualidade varchar(25),
quantidade varchar(5),
foreign key(idProduto) references nomesAlimentos(idProduto)
);  
select*from controleEstoque; -- exibe a tabela com os dados 



create table saudeAlimentos(
tipo varchar (20) not null,
cor varchar (20) not null,
aspecto varchar (4) not null,
tamanho char(1) not null,
peso decimal (5,3),
valor decimal(4,2),
idProduto integer unique not null,
foreign key(idProduto) references nomesAlimentos (idProduto)
);
select*from saudeAlimentos;  -- exibe a tabela com os dados 



drop table nomesAlimentos;  -- Exclui a tabela criada 
drop table controleEstoque;  -- Exclui a tabela criada
drop table saudeAlimentos;     -- Exclui a tabela criada

insert into nomesAlimentos values(1,"laranja",55.333,"fruta"),(2,"Batata",30.100,"raizes") ,(3,"Alface",08.700,"verdura"),(4,"mamão papaya",07.900,"fruta"),(5,"gengibre",02.200,"raizes"),(6,"brócolis",05.500,"verdura"),(7,"maçã",06.200,"fruta"),(8,"cenoura",03.900,"raízes"),(9,"abobrinha",04.900,"verdura"),(100,"-----",00.000,"Nao Identificado");
insert into controleEstoque values(1,"1201","2023-12-12","DENTRO DA VALIDADE","10"),(2,"1501","2023-12-12","DENTRO DA VALIDADE",95),(3,"1801","2022-02-02","VENCIDO",50),( 4,"1901","2021-07-07","VENCIDO",30),(5,"1701","2023-02-11","DENTRO DA VALIDADE",70),(6,"1201","2022-11-02","VENCIDO",85),(7,"1901","2020-10-02","VENCIDO",60),(8,"1701","2021-02-02","VENCIDO",40),(9,"1601","2022-10-01","DENTRO DA VALIDADE",20);
insert into saudeAlimentos values("Fruta","Laranja","Bom","P",55.333,55.90,1),("Raizes","amarela","Bom","P",30.300,65.50,2),("Verdura","Verde-clara","Ruim","M",18.000,54.91,3),("Fruta","amarelo","Ruim","G",17.700,12.00,4),("Raizes","Beje","Bom","P",28.300,28.64,5),("Verdura","Verde-escuro","Ruim","M",11.700,74.25,6),("Fruta","Vermelho","Ruim","P",16.200,65.00,7),("Raizes","Laranja","Ruim","M",30.100,95.77,8),("Verdura","Verde","Bom","G",47.200,34.99,9); -- ("Verdura","Verde-clara","Ruim","M",18.000,54.91,10);

update controleEstoque set qualidade = "VENCIDO" where idProduto in (9); ----- Muda a qualidade do produto nessa linha para vencido 
update controleEstqoue set qualidade = "DENTRO DA VALIDADE" where idProduto in (9); -- Muda a qualidade do produto nessa linha pra Dentro da validade

select*from controleEstoque where qualidade = "VENCIDO"; -- Filtro para trazer só os alimentos Vencidos

select*from nomesAlimentos inner join saudeAlimentos on nomesAlimentos.tipo = saudeAlimentos.tipo; -- nesse filtro ele me traz todos os dados da tabel nomesAlimentos e saude alimentos através da coluna tipo
select*from saudeAlimentos inner join controleEstoque on saudeAlimentos.idProduto = controleEstoque.idProduto -- nesse filtro ele me traz os dados da tabela saudeAlimentos e controleEstoque através do IdProdutos

