create database exemplo_funcao;
use exemplo_funcao;
create table Aluno(
					RA int primary key auto_increment,
                    nome varchar(50),
                    telFixo char(13),
                    telCelular char(14),
                    sexo char(1) check (sexo = 'm' or sexo = 'f' or sexo = 'n'),
                    notaVest decimal(4,2) check (notaVest >= 0 and notaVest <= 10)
                    ) auto_increment=2211000;

/* 
	O check no mySQL funciona apenas nas versões posteriores a 8.0.16
    O decimal (4,2) diz que haverão 4 números, sendo 2 deles dps da vírgula, portanto o maior número será 99,99
*/
insert into aluno values(null, 'Bruno Silva', '(11)5432-1234', '(11)99765-9988','K',7.5); -- Não funciona pq k não é um sexo válido
insert into aluno values(null, 'Bruno Silva', '(11)5432-1234', '(11)99765-9988','m',25); -- Não funciona pq 25 não é uma nota válida


insert into aluno values(null, 'Bruno Silva', '(11)5432-1234', '(11)99765-9988','m', 7);
insert into aluno values(null, 'Gabriel Cesar', '(11)5411-1335', '(11)99765-9988','m', 8);
insert into aluno values(null, 'Jorge Mariano', '(11)5422-1436', '(11)99765-9988','m', 9.20);
insert into aluno values(null, 'Marina Silva', '(11)5433-1537', '(11)99765-9988','n', 6);
insert into aluno values(null, 'Glaciete Zago', '(11)544-1638', '(11)99765-9988','f', 10);

select * from aluno;

-- Exibir a soma das notas de vestibular
select sum(notaVest) from Aluno;

-- Exibir a soma das notas de vestibular, mas nomeando a coluna do resultado. Indepente do jeito escolhido, essa coluna é exibida temporariamente
select sum(notaVest) as 'Soma das Notas' from Aluno;

-- Exibir a média das notas de vestibular
select avg(notaVest) as 'Média das notas' from aluno;

-- Exibir a nota máxima e a nota mínima da tabela Aluno
select max(notaVest) as 'Maior nota', min(notaVest) as 'Menor Nota' from Aluno;

-- Exibir a média das notas de vestibular das alunas mulheres
select avg(notaVest) as 'Média das notas' from aluno where sexo = 'F';


-- Exibir a nota máxima e a nota mínima da tabela Aluno dos alunos com sexo M
select max(notaVest) as 'Maior nota', min(notaVest) as 'Menor Nota' from Aluno where sexo = 'M';

-- Limitar o númeor de casas decimais exibidas pode-se usar a função ROUND(num,casaDecimais) ou TRUNCATE (mesma sintaxe do round)
select round(avg(notaVest),2) as 'Média das notas' from aluno;

/* A diferença entre round e truncate é que o Round arredonda o número, enquanto o truncate só corta os número depois da casa definida*/
select avg(notaVest),1 as 'Média das notas' from aluno where sexo = 'm'; -- Normal

select round(avg(notaVest),1) as 'Média das notas' from aluno where sexo = 'm'; -- Round

select truncate(avg(notaVest),1) as 'Média das notas' from aluno where sexo = 'm'; -- Truncate

-- Exibir a quantidade de itens numa coluna
select count(notaVest) as'Quantidade de notas' from aluno;
-- Exibir a quantidade de itens numa coluna com nota maior que 8
select count(notaVest) as'Quantidade de notas' from aluno where notaVest >= 8;