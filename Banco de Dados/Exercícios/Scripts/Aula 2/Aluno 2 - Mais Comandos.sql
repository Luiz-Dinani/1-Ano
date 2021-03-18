-- Criação do banco de de dados aluno
create database Aluno; -- Aluno é o nome do banco de dados
-- Selecionar o Banco de Dados aluno
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







-- Aqui começam os comandos novos




select * from Aluno;
desc aluno;
describe aluno; -- Esses 2 comando são iguais

-- Exibir os alunos cujo RA estehja, entre um valor em outro
select * from Aluno where ra  between 02211040 and 02211040;
select * from Aluno where ra  >= 02211040 and ra <= 02211050; -- Esse e o comando anterior são iguais 
select * from Aluno where ra  >= 02211040 && ra <= 02211050; -- &&=and Esse e o comando anterior são iguais 
select * from Aluno where ra  > 02211050; -- Apenas maior que 02211050
select * from Aluno where ra  <> 02211041; -- <> É o símbolo de diferente (padrão SQL, funciona em todos os SGBDs), logo ele vai excluir o aluno de RA 02211041
select * from Aluno where ra  != 02211041; -- != Também é o símbolo de diferente (É usado por muitos SGBDs, mas não é padrão), vai fazer a mesma coisa que o anterior

-- Exibir os Dados dos alunos em ordem alfabética de nome
select * from Aluno order by nome; -- ordenar por nome
select * from Aluno order by nome asc; -- ordenar por nome ascendente, já acontece por padrão, portanto, L54=L53
select * from Aluno order by nome desc; -- ordenar por nome decrescente Z-Aselect * from Aluno order by nome asc; -- ordenar por nome ascendente, já acontece por padrão, portanto, L54=L53

select * from Aluno order by bairro; -- ordenar por bairro, crescente
select * from Aluno order by nome desc; -- ordenar por bairro decrescente Z-A



-- Exibir os dados dos alunos cujo nome comece com a letra "L"
select * from Aluno where nome like 'L%'; -- % Significa que podem vir nenhum ou qualquer outro caracter
select * from Aluno where nome like 'Luiz%'; -- Traz só quem tem o nome começando com "Luiz" 
select * from Aluno where ra like '%5'; -- Exibir o RA de todos os alunos cujo 5 é o último caracter
select * from Aluno where nome like '%Carlos%'; -- O Carlos pode estar em qualquer lugar do nome, por isso fica entre %
select * from Aluno where bairro like 'Q%'; -- Exibir os alunos que morarm em bairros começando com 'Q'
select * from Aluno where nome like '%S'; -- Exibir os alunos comm o nome terminando em S
select * from Aluno where nome like '_u%'; -- O _ exige que tenha algum caracter antes do U, portanto U como segunda letra
select * from Aluno where bairro like '_a%'; -- Exibir bairro com segunda letra sendo A
select * from Aluno where nome like '__i%'; -- Exibir os alunos com i sendo a terceira letra (tem dois _)]
select * from Aluno where nome like '%h_'; -- Exibir os alunos cuja penúltima letra é H
select * from Aluno where nome like '%_h%'; -- Exibir os alunos cujo algum dos nomes tenha h como penúltima letra
select * from Aluno where nome like '%o' or nome like '%e'; -- Exibir os alunos cujo último dos nomes tenha O ou E como última letra
select * from Aluno where nome like '%o' or nome like '%e'; -- Exibir os alunos cujo último dos nomes tenha O ou E como última letra


-- O like é melhor para quando está procurando por um padrão (usando % ou_)

select * from Aluno where nome like '%z %' and nome like '%o'; -- Exibir os alunos cujo primeiro nome termine em z e último nome termine em optimize

-- Na verdade o %z % procura todos os nomes que tenham Z seguido de uma espaço, não necessáriamente o primeiro nome


select * from aluno;
-- Exibir os dados dos alunos cujo RA seja 2211041 ou 2211045 ou 2211046
-- Dá pra usar os comandos abaixo com as letras também, só tem que usar ''
select * from Aluno where ra in (2211041, 2211045, 2211046); -- O in diz que é pra achar só esses RAs
select * from Aluno where ra = 2211041 or RA = 2211045 or Ra = 2211046; -- Esse comando é igual ao anterior, só ocupa mais espaço
select * from Aluno where ra not in (2211041, 2211045, 2211046); -- O not in diz que é pra achar todos menos esses RAs 
select * from Aluno where ra <> 2211041 and RA <> 2211045 and Ra <> 2211046; -- Esse comando é igual ao anterior, só ocupa mais espaço

-- Alterar o bairro do Aluno de ra 2211045 para CECAP 1
update Aluno set bairro = 'CECAP 1' where RA = 2211045; -- Atualiza e 'seta' o bairro como CECAP 1
select * from aluno where ra = 2211045; -- Verifica resultado

update Aluno set bairro = 'Rio de janeiro versão bairro', nome = 'Diabo Devil 666 ' where ra = 2211062;
select * from aluno where ra = 2211062; -- Verifica resultado

delete from aluno where ra = 2211062; -- Deleta o cara com esse RA
select * from aluno where ra = 2211062; -- Verifica resultado

-- Excluir a tabela
-- drop table Aluno;
-- Pra recuperar é só executar o todo o código sem essa última linha
select * from Aluno;

-- Exlcuir o banco de dados (schema) aluno
-- drop database aluno;
-- Pra recuperar é só executar o todo o código sem essa última linha