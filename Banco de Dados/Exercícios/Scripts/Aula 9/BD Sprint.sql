create database sprint;

use sprint;

create table tbGrupo (idGrupo int primary key auto_increment,
					  nomeGrupo varchar(45),
                      descricao varchar(100)
);

create table tbAluno (RA int primary key,
					  fkGrupo int,
                      foreign key (fkGrupo) references tbGrupo(idGrupo),
					  nomeAluno varchar(45),
					  email varchar(45)
);

create table tbProfessor (idProfessor int primary key auto_increment,
						  nomeProfessor varchar(45),
						  disciplina varchar(45)
) auto_increment 10000;

-- Tabela intermediária das tabelas tbGrupo e tbProfessor
create table tbGrupoProfessor (fkProfessor int,
							   fkGrupo int,
							   dateTimeAvaliacao datetime,
                               avaliacao decimal(4,2),
                               foreign key (fkProfessor) references tbProfessor(idProfessor),
                               foreign key (fkGrupo) references tbGrupo(idGrupo),
                               primary key (fkProfessor, fkGrupo, dateTimeAvaliacao)
);

insert into tbGrupo values (null, 'LIPMP', 'Linha de Produção com Molde Personalizável'),
						   (null, 'VegCare', 'Monitoramento do plantio de batatas');
                           
insert into tbAluno values (10, 1, 'Luiz', 'luizc.dinani@gmail.com'),
						   (11, 1,  'Yan', 'yan@gmail.com'),
						   (12, 1,  'Elissa', 'elissa@gmail.com'),
						   (20, 2,  'Caua', 'caua@gmail.com'),
						   (21, 2,  'Bambu', 'bambu@gmail.com'),
						   (22, 2,  'Lucas Mesquita', 'lucasM@gmail.com');

insert into tbProfessor values (null, 'Brandao', 'Pesquisa e Inovacao'),
							   (null, 'Thiago', 'Socio-Emocional');
                               
insert into tbGrupoProfessor values (10000, 1, '2021-05-20 20:00:00', 10.00),
									(10001, 1, '2021-05-20 20:30:00', 10.00),
									(10000, 2, '2021-10-15 12:30:50', 8.50),
									(10001, 2, '2021-10-30 15:50:30', 8.00);

select * from tbGrupo;
select * from tbAluno;
select * from tbProfessor;
select * from tbGrupoProfessor;
select * from tbAluno join tbGrupo on fkGrupo=idGrupo;
select * from tbAluno join tbGrupo on fkGrupo=idGrupo and idGrupo=1;
select avg(avaliacao) from tbGrupoProfessor;
select max(avaliacao), min(avaliacao) from tbGrupoProfessor;
select sum(avaliacao) from tbGrupoProfessor;
select * from tbProfessor right join tbGrupoProfessor on fkProfessor=idProfessor;
select * from tbProfessor join tbGrupoProfessor on fkProfessor=idProfessor and fkGrupo=2;
select nomeGrupo from tbGrupo join tbGrupoProfessor on idGrupo=fkGrupo and fkProfessor=10000;
-- Verificar resolução da professora, esse meu primeiro jeito parece uma gambiarra, já o segundo nem funciona. select * from tbGrupo, tbAluno, tbProfessor, tbGrupoProfessor where idGrupo=tbAluno.fkGrupo and idGrupo=tbGrupoProfessor.fkGrupo and idProfessor=fkProfessor; -- select * from tbGrupo join tbAluno on idGrupo=fkGrupo, tbProfessor left Join tbGrupoProfessor on idProfessor=fkProfessor;
-- Versão correta do Exercício 13 usando o Join
select * from tbGrupoProfessor as tbGP join tbProfessor on fkProfessor = idProfessor
									   join tbGrupo on fkGrupo=idGrupo
									   join tbAluno on tbGP.fkGrupo=tbAluno.fkGrupo;
                                       
select count(distinct(avaliacao)) from tbGrupoProfessor;
select fkProfessor, avg(avaliacao), sum(avaliacao) from tbGrupoProfessor group by fkProfessor;
select fkGrupo, avg(avaliacao), sum(avaliacao) from tbGrupoProfessor group by fkGrupo;
select fkProfessor, min(avaliacao), max(avaliacao) from tbGrupoProfessor group by fkProfessor;
select fkGrupo, min(avaliacao), max(avaliacao) from tbGrupoProfessor group by fkGrupo;