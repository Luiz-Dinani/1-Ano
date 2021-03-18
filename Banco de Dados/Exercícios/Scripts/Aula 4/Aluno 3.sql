-- O banco de dados original está na pasta Aula 1
use Aluno;

create table tbCursos (
	idCurso int primary key auto_increment,
    nome char(5),
    coordenador varchar(15)
) auto_increment = 100;

-- Inserção dos dadso da tabela Cruso
insert into tbCursos values (null, 'ADS', 'Gerson'),
						 (null, 'CCO', 'Marise'),
                         (null, 'Redes', 'Alex');

select * from tbCursos;

-- Acrescentar coluna chamada fkCurso na tabela Aluno

alter table Aluno add fkCurso int;

select * from Aluno;

-- Acrescentar Restrição de FK à coluna fkCurso da tabela Aluno
-- Ou seja, fkCurso vai virar uma Foreign Key

alter table Aluno add foreign key(fkCurso) references tbCursos(idCurso);

-- Preencher os dados de fkCurso para os registros já existentes
update Aluno set fkCurso = 100 where ra in (2211041, 2211046, 02211054);
update Aluno set fkCurso = 101 where ra in (2211045, 2211062);
update Aluno set fkCurso = 102 where ra in (2211056);

-- Exibirs os dados dos alunos e dos cursos correspondetes

select * from Aluno, tbCursos where fkCurso=idCurso;

-- Exibirs os dados dos alunos e dos cursos correspondetes, mas somente do curso de CCO

select * from Aluno, tbCursos where fkCurso=idCurso and nome='CCO'; -- Vai falar que nome é ambíguo, pois aparece tanto na tabela Aluno quanto na tbCursos

-- Para corrigir basta fazer colocar tbCursos. na frente de nome
select * from Aluno, tbCursos where fkCurso=idCurso and tbCursos.nome='CCO';

-- Exibir os dados dos alunos e dos cursos correspondetes, mas sem repetir o valor do fk
select ra, Aluno.nome, bairro, tbCursos.* from Aluno, tbCursos where fkCurso=idCurso; -- o tbCursos.* mostra todos os dados da tabela cursos

-- Inserção de novo aluno, agora com a FK

insert into aluno value (02211044, 'Lucas Mesquita', 'Polo Norte', 101);
insert into aluno value (02211099, 'Ribamar', 'Polo Sul', 102);