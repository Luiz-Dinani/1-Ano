create database luizAc3So;
use luizAc3So;
create table historico (
	idHistorico int primary key auto_increment,
	operacao  varchar(6) check (operacao in('Compra', 'Venda')),
    qtdBtc DOUBLE,
    dataTempo datetime
);

select * from historico;
select sum(qtdBtc) as saldo from historico;