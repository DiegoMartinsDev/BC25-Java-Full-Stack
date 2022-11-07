Create database alimentos;
use alimentos;

 create table hortalicas( 
    idHortalica integer primary key auto_increment,
    nome varchar(20) not null,
    cor varchar(15)not null,
    tamanho char(1) not null,
    gosto varchar(10) not null
 );select*from hortalicas;
 
 create table verdura( 
     idVerdura integer primary key auto_increment,
     nome varchar(20) not null,
	 cor varchar(15)not null,
     tamanho char(1) not null,
     gosto varchar(10) not null,
     peso decimal(3,1) not null
 ); select*from verdura;
 
 create table legumes(
     idlegumes integer primary key auto_increment,
     nome varchar(20) not null,
     tamanho char (1) not null,
     cor varchar (15) not null
 );select*from legumes;
 
 insert into hortalicas values(1,"Aspargo","verde","P","meio amargo");
 insert into hortalicas values(1,"couve-flor","branca","medio","doce");
 insert into hortalicas values(1,"brócolis","verde-escuro","medio","Meio amargo");
 