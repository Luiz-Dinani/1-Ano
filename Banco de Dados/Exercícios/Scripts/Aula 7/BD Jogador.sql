create database PraticaJogador;

use PraticaJogador;

create table tbTime (
					 idTime int primary key auto_increment,
                     nome varchar(45),
                     tecnico varchar(45),
                     Criacao date
                     );

create table tbJogador (
						idJogador int primary key auto_increment,
                        nome varchar(45),
                        posicao char(3),
                        salario decimal(12,2),
                        fkConselheiro int,
						fkTime int,
                        foreign key (fkConselheiro) references tbJogador(idJogador),
                        foreign key (fkTime) references tbTime(idTime)
                        );

create table tbSeguidor (
						  fkJogador int,
                          idSeguidor int,
                          nome varchar(45),
                          nickname varchar(45),
                          sexo char(1) check (sexo in ('m', 'f', 'n')),
                          foreign key (fkJogador) references tbJogador(idJogador),
                          primary key (fkJogador, idSeguidor)
                          ); 

insert into tbTime(nome, tecnico, criacao) values ('Bayern', 'Hansi Flick', '1900/02/27'),
												  ('Corinthians', 'Vagner Mancini', '1910/09/01'),
                                                  ('São Caetano', 'Wilson Raimundo Junior', '1989/12/04');

insert into tbJogador(nome, posicao, salario, fkConselheiro, fkTime) values ('Lewandowski', 'ATA', 99999999, null, 1),
																			('Choupo-Moting', 'ATA',  5000, 1, 1),
																			('Cassio', 'GOL', 100000, null, 2),
                                                                            ('Fagner', 'LAT', 30000, 3, 2),
                                                                            ('Barba', 'AME', 9999999999, null, 3),
                                                                            ('Corrido', 'GOL', 100, 5, 3);
                                                                            
insert into tbSeguidor values (1, 1, 'Luiz', 'Luigi Claudio', 'm'),
							  (1, 2, 'Mateus', 'Pina', 'm'),
							  (3, 1, 'Odir', 'Odair kkkkk', 'm'),
							  (5, 1, 'Jorge', 'Maltazar', 'm'),
							  (6, 1, 'Glaciete', 'Smoke', 'f');
                              
select * from tbTime;
select * from tbJogador;
select * from tbSeguidor;
select nome, tecnico from tbTime where nome like "B%";
select * from tbJogador order by posicao desc;
select * from tbJogador where posicao = "GOL";
select * from tbTime where tecnico like "%n_";
select * from tbTime order by tecnico;
select * from tbTime order by criacao desc;

update tbJogador set posicao = "ATA" where idJogador=5;
select * from tbJogador where idJogador=5;

select * from tbTime, tbJogador where idTime = fkTime;
select * from tbTime, tbJogador where idTime = fkTime and tbTime.nome="Sao Caetano";
select * from tbJogador as Jogador, tbJogador as Conselheiro where Jogador.fkConselheiro = Conselheiro.idJogador;
select * from tbJogador as Jogador, tbJogador as Conselheiro, tbTime where Jogador.fkConselheiro = Conselheiro.idJogador and Jogador.fkTime = tbTime.idTime;
select * from tbJogador as Jogador, tbJogador as Conselheiro, tbTime where Jogador.fkConselheiro = Conselheiro.idJogador and Jogador.fkTime = tbTime.idTime and Jogador.nome="Corrido";
select * from tbJogador, tbSeguidor where idJogador=fkJogador;
select * from tbJogador, tbSeguidor where idJogador=fkJogador and tbJogador.nome = "Cassio";
select sum(salario) as "Soma", avg(salario) as "Media" from tbJogador;
select min(salario), max(salario) from tbJogador;
select * from tbJogador where salario<30000;
select sum(salario) as "Soma", avg(salario) as "Media" from tbJogador where salario<30000;

delete from tbJogador where idJogador=4;
select * from tbJogador;

drop table tbSeguidor;
drop table tbJogador;
drop table tbTime;