create database Bandtec;
use Bandtec;
create table tbCursos(idCurso int primary key auto_increment, 
					 nomeCurso char(5) unique, -- O unique diz que esse campo é único, logo, não podem haver 2 cursos com o mesmo nome 
                     coordenador varchar(50)
) auto_increment=100;

insert into tbCursos values (null, 'ADS', 'PortsTrader'),
			                (null, 'CCO', 'Marise'),
                            (null, 'Redes', 'LuanGameplay');
                            
create table tbAlunos (ra int primary key auto_increment,
					  nomeAluno varchar(50),
                      bairro varchar(50),
                      fkCurso int,
                      foreign key (fkCurso) references tbCursos(idCurso)
) auto_increment=5000;
                      
insert into tbAlunos values (null, 'Luiz', 'Quiririm',101),
						   (null, 'Caua', 'Prosperidade', 101),
                           (null, 'Pedro', 'Nova Gerty', 100),
                           (null, 'CaveiraGames', 'Nova Iguaçu', 102);
                           
-- Ver todos os dados das duas tabelas ao mesmo tempo
select * from tbAlunos, tbCursos;

-- Ver dados específicos de tabelas diferentes
select nomeALuno, nomeCurso from tbAlunos, tbCursos where fkCurso=idCurso;

-- Se as duas tabelas tivessem uma coluna com o mesmo nome, por exemplo, ao invés de nomeAluno e nomeCurso seria apenas 'nome' para as duas tabelas
select tbAlunos.nome, tbCursos.nome from tbAlunos, tbCursos where fkCurso=idCurso;

-- Se ao a coluna fkCurso se chamasse idCurso, igual na tbCursos, ficaria assim
select tbAlunos.nome, tbCursos.nome from tbAlunos, tbCursos where tbAlunos.idCurso=tbCursos.idCurso;

-- Exibir só de quem é de CCO
select nomeALuno, nomeCurso from tbAlunos, tbCursos where fkCurso=idCurso and nomeCurso='CCO';





                      