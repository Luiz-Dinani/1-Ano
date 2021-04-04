create database GastosFamilia;

use GastosFamilia;

create table tbPessoa(
					  idPessoa int primary key auto_increment,
                      nome varchar(45),
                      aniversário date,
                      profissao varchar(45),
                      idioma char(3),
                      idioma2 char(3)
);

create table tbGasto(
						idGasto int primary key auto_increment,
                        `data` date,
                        valor decimal(5,2),
                        descricao varchar(50)
);

alter table tbGasto add column fkPessoa int, add foreign key (fkPessoa) references tbPessoa(idPessoa);

insert into tbPessoa values (null, 'Luiz Filho', '2003-03-20', 'Estudante', 'Por', 'Eng'),
							(null, 'Anna Paola', '2006-02-18', 'Estudante', 'Por', 'Eng'),
							(null, 'Marli Lucas', '1965-10-04', 'Advogada', 'Por', 'Eng'),
							(null, 'Luiz Carlos', '1951-03-01', 'Aposentado', 'Por', null),
							(null, 'Judite Silva', '1936-06-09', 'Aposentada', 'Por', null);
                            
insert into tbGasto values	(null, '2021/03/20', 5, 'Comprar Refrigerante',1),
							(null,'2021/03/25',3,'Tomar Leite',1),
							(null,'2021/04/05',10,'Comprar Gillete',1),
                            (null,'2021/03/25',3,'Tomar Leite',2),
                            (null,'2021/03/25',3,'Tomar Leite',3),
                            (null, '2021/03/20', 5, 'Comprar Refrigerante',2),
                            (null, '2021/03/20', 5, 'Comprar Refrigerante',3),
                            (null,'2021/03/25',3,'Tomar Leite',4),
                            (null,'2021/04/05',10,'Comprar Gillete',4),
                            (null,'2021/03/25',3,'Tomar Leite',5);

select * from tbPessoa;
select * from tbGasto;
select * from tbPessoa where profissao = 'Estudante';
select * from tbGasto where valor = 5;
select * from tbPessoa, tbGasto where fkPessoa=IdPessoa order by idPessoa;
select * from tbPessoa, tbGasto where fkPessoa=IdPessoa and idPessoa = 4;

update tbPessoa set idioma2 = 'Fra' where idPessoa = 4;
select * from tbPessoa where idPessoa = 4; 

select sum(valor) as 'Soma dos Valores', avg(valor) as 'Média dos Gastos' from tbGasto;
select max(valor), min(valor) from tbGasto;
select sum(valor) as 'Soma dos Valores', avg(valor) as 'Média dos Gastos' from tbGasto where fkPessoa = 2;
select max(valor), min(valor) from tbGasto where fkPessoa = 2;

delete from tbGasto where idGasto = 1;