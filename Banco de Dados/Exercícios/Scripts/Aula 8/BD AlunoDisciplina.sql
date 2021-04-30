create database AlunoDisciplina;

use AlunoDisciplina;

create table tbAluno (RA int primary key auto_increment,
					  nome varchar(45),
                      bairro varchar(45)
);

create table tbDisciplina (idDisciplina int primary key auto_increment,
						   nomeDisciplina char(3)
);

create table tbAlunoDisciplina (fkRA int,
                                fkDisciplina int,
                                media decimal(4,2),
                                qtdFaltas int,
                                primary key (fkRA, fkDisciplina),
                                foreign key (fkRA) references tbAluno(RA),
                                foreign key (fkDisciplina) references tbDisciplina(idDisciplina)
);

insert into tbAluno values (null, 'Luiz', 'Quiririm'),
						   (null, 'Caua', 'Santa Paula'),
                           (null, 'Jorge', 'Santa Paula'),
                           (null, 'Glaciete', 'Quiririm');
                           
insert into tbDisciplina values (null, 'BD'),
								(null, 'Alg'),
								(null, 'TI'),
								(null, 'ARQ');
                                
insert into tbAlunoDisciplina values (1, 1, 8.4, 0),
									 (2, 1, 10, 0),
                                     (3, 1, 8, 3),
                                     (4, 1, 10, 5),
                                     (1, 2, 9.6, 3),
									 (2, 2, 9, 0),
                                     (3, 2, 9, 0),
                                     (4, 2, 10, 0),
                                     (1, 3, 7.75, 5),
									 (2, 3, 7, 0),
                                     (3, 3, 7.5, 0),
                                     (4, 3, 7, 0),
                                     (1, 4, 10, 0),
									 (2, 4, 8, 2),
                                     (3, 4, 9, 3),
                                     (4, 4, 8, 0);
                                     
select * from tbAluno;
select * from tbDisciplina;
select * from tbAlunoDisciplina;
select * from tbAluno, tbDisciplina, tbAlunoDisciplina where RA=fkRA and idDisciplina=fkDisciplina;
select * from tbAluno, tbDisciplina, tbAlunoDisciplina where RA=fkRA and idDisciplina=fkDisciplina and nomeDisciplina='BD';
select * from tbAluno, tbDisciplina, tbAlunoDisciplina where RA=fkRA and idDisciplina=fkDisciplina and nome='Luiz';
select sum(media) as 'Soma das Médias', sum(qtdFaltas) as 'Soma das Faltas' from tbAlunoDisciplina;
select round(avg(media),3) as 'Média das Médias', round(avg(qtdFaltas),2) as 'Média das Faltas' from tbAlunoDisciplina;
select max(media), min(media) from tbAlunoDisciplina;
select max(qtdFaltas), min(qtdFaltas) from tbAlunoDisciplina;
select max(media), min(media) from tbAlunoDisciplina group by fkDisciplina;
select max(media), min(media) from tbAlunoDisciplina group by fkRA;
select media from tbAlunoDisciplina;
select distinct media from tbAlunoDisciplina;
select count(media) as 'Quantidade de médias' from tbAlunoDisciplina;
select count(distinct media) from tbAlunoDisciplina;