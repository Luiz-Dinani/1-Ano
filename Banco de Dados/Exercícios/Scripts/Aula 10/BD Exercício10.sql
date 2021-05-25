-- create database Exercicio10;
use Exercicio10;

create table tbDepartamento(idDepto int primary key,
							nomeDepto varchar(45),
							fkGerente int,
                            dataInicioGer date
);

create table tbFuncionario (idFunc int primary key,
							nomeFunc varchar(30),
                            salario decimal(10,2),
                            sexo char(1) check (sexo in('m', 'f', 'n')),
                            fkSupervisor int, 
                            dataNasc date,
                            fkDepto int,
                            foreign key (fkDepto) references tbDepartamento(idDepto)
);

create table tbProjeto (idProj int primary key,
						nomeProj varchar(45),
						localProj varchar(45),
                        fkDepto int,
                        foreign key (fkDepto) references tbDepartamento(idDepto)
);

create table tbFuncProj (fkFunc int,
						 fkProj int,
                         horas decimal(3,1),
						 foreign key (fkFunc) references tbFuncionario(idFunc),
                         foreign key (fkProj) references tbProjeto(idProj),
                         primary key (fkFunc, fkProj)
);

insert into tbDepartamento values (105, 'Pesquisa', 2, '2008/05/22'), -- Usar - ao invés de /
								  (104, 'Admnistração', 7, '2015/01/01'),
                                  (101, 'Matriz', 8, '2001/06/19');

insert into tbFuncionario values (1, 'Joao Silva', 3500, 'm', 2, '1985/01/09', 105),
								 (2, 'Fernando Wong', 4500, 'm', 8, '1975/12/08', 105),
                                 (3, 'Alice Sousa', 2500, 'f', 7, '1988/01/19', 104),
                                 (4, 'Janice Moarais', 4300, 'f', 8, '1970/06/20', 104),
                                 (5, 'Ronaldo Lima', 3800, 'm', 1, '1982/09/15', 105),
                                 (6, 'Joice Leite', 2500, 'f', 1, '1992/07/31', 105),
                                 (7, 'Antonio Pereira', 2500, 'm', 4, '1989/03/26', 104),
                                 (8, 'Juliano Brito', 5500, 'm', null, '1957/11/10', 101);

insert into tbProjeto values (1, 'Produto X', 'Santo André', 105),
							 (2, 'Produto Y', 'Itu', 105),
                             (3, 'Produto Z', 'São Paulo', 105),
                             (10, 'Informatização', 'Mauá', 104),
                             (20, 'Reorganização', 'São Paulo', 101),
                             (30, 'Benefícios', 'Mauá', 104);
							
insert into tbFuncProj values (1, 1, 32.5),
							  (1, 2, 7.50),
                              (5, 3, 40.0),
                              (6, 1, 20.0),
                              (6, 2, 20.0),
                              (2, 2, 10.0),
                              (2, 3, 10.0),
                              (2, 10, 10.0),
                              (2, 20, 10.0),
                              (3, 30, 30.0),
                              (3, 10, 10.0),
                              (7, 10, 35.0),
                              (7, 30, 5.00),
                              (4, 30, 20.0),
                              (4, 20, 15.0),
                              (8, 20, null);

alter table tbDepartamento add foreign key (fkGerente) references tbFuncionario(idFunc);
alter table tbFuncionario add foreign key (fkSupervisor) references tbFuncionario(idFunc);

select * from tbDepartamento;
select * from tbFuncionario;
select * from tbProjeto;
select * from tbFuncProj;

insert into tbFuncionario value (null, 'Cecília Ribeiro', 2800, 'f', null, '1980/04/05', 104); -- Não consegui inserir, pois falta chave primária (idFunc) e não tem auto_increment
insert into tbFuncionario value (3, 'Alice Sousa', 2800, 'f', 4, '1980/04/05', 104); -- Não consegui inserir, pois o idFunc = 3 já está em uso
insert into tbFuncionario value (9, 'Cecília Ribeiro', 2800, 'f', 4, '1980/04/05', 107); -- Não consegui inserir, pois o departamento 107 não existe
insert into tbFuncionario value (9, 'Cecília Ribeiro', 2800, 'f', 4, '1980/04/05', 104); -- Sim, consegui inserir

delete from tbFuncProj where fkFunc=3 and fkProj=10; -- Sim, consegui deletar
delete from tbFuncionario where idFunc=4; -- Não consegui deletar, pois o funcionário 4 atua como foreign key na tabela tbFuncionário (fkSupervisor)
delete from tbFuncionario where idFunc=2; -- Não consegui deletar, pois o funcionário 2 atua como foreign key nas tabelas tbFuncionário (fkSupervisor), tbProjeto (fkGerente), tbFuncProj (fkFunc);

update tbFuncionario set salario = 2800 where idFunc = 3; -- Sim, consegui alterar
update tbFuncionario set fkDepto = 101 where idFunc = 3; -- Sim, consegui alterar
update tbFuncionario set fkDepto = 107 where idFunc = 3; -- Não consegui alterar, pois o departamento 107 não existe

select dataNasc, salario from tbFuncionario where nomeFunc = 'Joao Silva';
select salario from tbFuncionario;
select distinct(salario) from tbFuncionario;
select * from tbFuncionario order by nomeFunc;
select * from tbFuncionario order by salario desc;
select * from tbFuncionario where salario >=2000 and salario <= 4000;
select nomeFunc, salario from tbFuncionario where nomeFunc like ('J%');
select nomeFunc, salario from tbFuncionario where nomeFunc like ('%A');
select nomeFunc from tbFuncionario where nomeFunc like ('__n%');
select nomeFunc, dataNasc from tbFuncionario where nomeFunc like ('%S____');
select * from tbFuncionario join tbDepartamento on fkDepto=idDepto and nomeDepto='Pesquisa';
select * from tbFuncionario join tbDepartamento on fkDepto=idDepto and nomeDepto='Pesquisa' and salario>3500;
select * from tbFuncionario join tbDepartamento on fkDepto=idDepto and nomeDepto='Pesquisa' and nomeFunc like ('J%');
select Func.idFunc as 'id Funcionário', Func.nomeFunc as 'Nome Funcionário', Sup.idFunc as 'id Supervisor', Sup.nomeFunc as 'Nome Supervisor' 
	  from tbFuncionario as Func join tbFuncionario as Sup on Func.fkSupervisor = Sup.idFunc;
select Proj.idProj, Proj.fkDepto, nomeFunc, dataNasc from tbFuncProj join tbProjeto as Proj on fkProj = idProj -- Poderia ter colocado Func. antes de nomeFunc e dataNasc, desde que colocasse "as Func" na linha 108, mas como esses dados não aparecem em outras tabelas, isso não é necessário
																	 join tbFuncionario on fkFunc = idFunc
																	 and localProj = 'São Paulo';
select Func.idFunc, nomeFunc, Proj.idProj, Proj.nomeProj, horas from tbFuncProj join tbFuncionario as Func on fkFunc = idFunc
																				join tbProjeto as Proj on fkProj = idProj;
select * from tbFuncionario where dataNasc < '1980/01/01';
select count(distinct(salario)) from tbFuncionario;
select count(distinct(localProj)) from tbProjeto;
select avg(salario), sum(salario) from tbFuncionario;
select max(salario), min(salario) from tbFuncionario;
select tbDepartamento.idDepto, avg(salario), sum(salario) from tbFuncionario join tbDepartamento on fkDepto = idDepto group by idDepto;

insert into tbFuncionario values (10, 'José da Silva', 1800, 'm', 3, '2000/10/12', null),
								 (11, 'Benedito Almeida', 1200, 'm', 5, '2001/09/01', null);
insert into tbDepartamento values(110, 'RH', 3, '2018/11/10');

select * from tbFuncionario left join tbDepartamento on fkDepto = idDepto;
select * from tbFuncionario right join tbDepartamento on fkDepto = idDepto;