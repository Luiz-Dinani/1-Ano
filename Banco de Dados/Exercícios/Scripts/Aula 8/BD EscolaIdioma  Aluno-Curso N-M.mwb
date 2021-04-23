create database EscolaIdioma;

use EscolaIdioma;

create table tbAluno (
						RA int primary key auto_increment,
                        nomeAluno varchar(45),
                        bairro varchar(45)
) auto_increment = 1000;

create table tbCurso (
						idCurso int primary key auto_increment,
                        nomeCurso varchar(45),
                        coordenador varchar(45)
);

-- Criação da tabela Associativa tbAlunoCurs. Ela vai receber informações que tem a ver com o aluno e com o curso

create table tbAlunoCurso(
							fkRa int,
                            fkCurso int,
							dataInicio date,
                            media decimal(4,2),
                            nivel char(2),
                            foreign key (fkRA) references tbAluno(RA),
                            foreign key (fkCurso) references tbCurso(idCurso),
                            primary key (fkRA, fkCurso, dataInicio)
);

-- Inserção de Dados na tbAluno
insert into tbAluno values (null, 'Maria', 'Saúde'),
						   (null, 'João', 'Consolação');
-- Inserção de Dados na tbCurso                          
insert into tbCurso values (null, 'Espanhol', 'Juan'),
						   (null, 'Inglês', 'Beth');

-- Inserção de Dados na tbAlunoCurso                          
insert into tbAlunoCurso values (1000, 1, '2015-02-01', 9.0, 'A1'),
                                (1000, 2, '2017-02-01', 7.0, 'I3'),
                                (1001, 1, '2020-02-01', 7.0, 'B1'),
                                (1001, 2, '2019-02-01', 8.5, 'I2');

select * from tbAluno;
select * from tbCurso;
select * from tbAlunoCurso;
select * from tbAluno, tbCurso, tbAlunoCurso where fkRA = RA and fkCurso=idCurso;
select * from tbAluno, tbCurso, tbAlunoCurso where fkRA = RA and fkCurso=idCurso and nomeCurso = 'Ingles';
select * from tbAluno, tbCurso, tbAlunoCurso where fkRA = RA and fkCurso=idCurso and nomeAluno = 'João';
select sum(media) as 'Soma das médias', round(avg(media)) as 'Média das médias' from tbAlunoCurso;
select min(media) as 'Menor Média', max(media) as 'Maior Média' from tbAlunoCurso;

-- Exibir a maior menor média agrupada por curso
select min(media) as 'Menor Média', max(media) as 'Maior Média' from tbAlunoCurso group by fkCurso;

-- Exibir a maior menor média agrupada por curso, aparecendo a fk do Curso
select fkCurso, min(media) as 'Menor Média', max(media) as 'Maior Média' from tbAlunoCurso group by fkCurso;

-- Exibir a maior menor média agrupada por curso, aparecendo a fk RA
select fkRA as 'RA', min(media) as 'Menor Média', 
max(media) as 'Maior Média' from tbAlunoCurso group by fkRA;

-- Exibir médias diferentes
select distinct media from tbAlunoCurso;

select count(media) as 'Quantidade de médias' from tbAlunoCurso; 
select count(distinct media) as 'Quantidade de médias' from tbAlunoCurso; -- Exibir quantidade de médias diferentes