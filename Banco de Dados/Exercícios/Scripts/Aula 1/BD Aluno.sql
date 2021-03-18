-- Comentário kk
-- Criação do banco de de dados aluno
create database Aluno; -- Aluno é o nome do banco de dados
-- Selecionar o Banco de Dados Aluno
use Aluno;

-- Criação da tabela Aluno
create table Aluno (
  RA int primary key,
  nome varchar(50),
  bairro varchar (50)
  );

-- Exibir a tabela Aluno
select * from Aluno;
-- * significa todas as colunas
-- no lugar do *, vc pode colocar somente os nomes das colunas que vc quer exibir
select ra from Aluno;
select nome, ra from Aluno; -- alterando a ordem de exibição, o nome aparece antes do RA

-- Inserção  de dados de um aluno na tabela
insert into Aluno values (02211045, 'Luiz Carlos Dinani Martins Filho', 'Quiririm (lol)');
-- Exibir os dados da tabela
select * from Aluno; -- Daria só pra ir lá na linha 13 e executar o comando da linha (Ctrl+Enter)
insert into aluno values (02211041, 'Leo Nunes', 'Ferraz de Vasconcelos'),
						 (02211062, 'Yan Cruz santos', 'Parque Paulistano'),
                         (02211056, 'Renan Moreira Lima', 'Vila Rio Branco'),
                         (02211046, 'Luiz Henrique', 'Jardim Regina');
-- Exibir os dados dos alunos que são do bairro Quiririm (lol)
select * from aluno where bairro = 'Quiririm (lol)';
insert into Aluno values (02211054, 'Rafael Gomes', 'Jardim São José');