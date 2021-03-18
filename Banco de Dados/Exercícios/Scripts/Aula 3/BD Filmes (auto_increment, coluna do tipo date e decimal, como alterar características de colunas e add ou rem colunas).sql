-- Criação do banco de dados filme
create database filme;
-- Seleciona o banco de dados filme
use filme;
-- Criação da tabela Filme
create table Filme (
   idFilme int primary key,
   titulo varchar(50),
   genero varchar(40),
   diretor varchar(40)
);
-- Exibição dos dados da tabela Filme
select * from Filme;

-- Inserção dos dados de um filme da forma como foi ensinada
insert into Filme values (1, 'Velozes e Furiosos 1', 'Ação', 'Rob Cohen');

-- Inserção dos dados de filme, mas sem informar todos os dados
insert into Filme (idFilme, titulo) values (2, 'Madagascar'),
								           (3, 'Kong vs Godzilla'),
                                           (4, 'Tatuagem'),
                                           (5, 'Shrek');

-- Inserção dos dados de filmes, informando as colunas numa ordem diferente
insert into Filme (titulo, idFilme) values ('Cidade de Deus', 6),
					                       ('Todo mundo em pânico', 7);
                                           
-- Inserção dos dados de um filme, sem informar o titulo e o diretor                                           
insert into Filme (idFilme, genero) values (8, 'Animação');

-- Atualizar os dados não preenchidos da tabela
-- Vamos informar o gênero e o diretor do Madagascar e do Shrek
update Filme set genero = 'Animação', diretor = 'Tom McGrath' where idFilme in (2, 5);

-- Exibição dos dados da tabela Filme
select * from Filme;

-- Preenche as outras informações que estão faltando na tabela
update Filme set genero = 'Drama' where idFilme in (4, 6);
update Filme set genero = 'Ação', diretor = 'Adam Wingard' where idFilme = 3;
update Filme set diretor = 'Hilton Lacerda' where idFilme = 4;
update Filme set diretor = 'Fernando Meirelles' where idFilme = 6;
update Filme set genero = 'Comédia', diretor = 'Keenen Wayans' where idFilme = 7;
update Filme set titulo = 'Shrek 2', diretor = 'Tom McGrath' where idFilme = 8;

-- Exibição dos dados dos filmes ordenados pelo título
select * from Filme order by titulo;

-- Exibição dos dados dos filmes ordenados pelo diretor e para os filmes de um mesmo diretor, ordenados pelo titulo
select * from Filme order by diretor, titulo;

-- Idem ao comando anterior, mas filmes de um mesmo diretor serão ordenados na ordem descendente (do Z para o A)
select * from Filme order by diretor, titulo desc;

-- Idem ao comando anterior, mas diretor e titulo em ordem descendente
select * from Filme order by diretor desc, titulo desc;

-- Exibição dos dados da tabela ordenados pelo gênero e filmes de um mesmo gênero, ordenados pelo título
select * from Filme order by genero, titulo;

-- Exibição dos dados da tabela ordenados apenas pelo gênero
select * from Filme order by genero;

-- Criação de uma nova tabela, para o uso do auto_increment
create table Pessoa (
   idPessoa int primary key auto_increment,  -- auto_increment preenche automaticamente o valor deste campo
   nome varchar(40),
   dataNascimento date
);

-- Exibição dos dados da tabela Pessoa
select * from Pessoa; 

-- Exibição da estrutura da tabela Pessoa
desc Pessoa;  

-- Exibição da estrutura da tabela Filme
desc Filme;

-- Inserindo dados com auto_increment

-- Se vc não especificar quais campos estão sendo inseridos, então tem que 
-- informar null no lugar o idPessoa, para que o auto_increment gere o valor
insert into Pessoa values (null, 'Maria Silva', '2000-04-10'),
						  (null, 'José Souza', '2001-10-05');
                          
-- Inserindo dados com auto_increment, porém especificando os campos 
insert into Pessoa (nome, dataNascimento) values ('Ana Teixeira', '2000-05-11'),
                                                 ('Paulo Fontana', '2002-06-10');                         

-- Neste ponto da aula, nós executamos novamente os 2 inserts acima, para mostrar que qdo o id é 
-- auto incrementado, as pessoas são inseridas novamente, ficando duplicadas (com outro valor de idPessoa)

-- Excluindo os registros duplicados pq inserimos novamente todas as pessoas
delete from Pessoa where idPessoa >= 5;

-- Inserção de uma nova pessoa (o valor do idPessoa desconsidera que foram excluídos registros)
insert into Pessoa values (null, 'Pedro Meirelles', '2002-07-03');

-- Inserção de uma pessoa propositamente com erro
-- A data de nascimento do Pateta está errada (31/fev) e por isso esse comando dá erro ao executar
-- Porém o MySQL consome idPessoa, de forma que o próximo valor a ser inserido "pula" 3 números
insert into Pessoa values (null, 'Mickey', '1950-11-05'),
						  (null, 'Pateta', '1955-02-31'),
                          (null, 'Pluto', '1957-09-05');
                          
-- Apesar do idPessoa ser auto_increment, se especificarmos um valor de idPessoa, ele usa esse valor
-- desde que já não tenha um registro com esse valor de idPessoa                         
insert into Pessoa values (5, 'Mickey', '1950-11-05'),
						  (6, 'Pateta', '1955-02-28'),
                          (7, 'Pluto', '1957-09-05');
                          
-- Exibição dos dados da tabela Pessoa                          
select * from Pessoa;

-- Se especificarmos 0 (zero) no lugar do idPessoa, ele gera um novo idPessoa, seguindo a numeração
insert into Pessoa values (0, 'Minnie', '1960-08-06');

-- Exibição da estrutura da tabela Pessoa
desc Pessoa;

-- Acrescentar uma coluna nova na tabela Pessoa
-- Os 2 comandos abaixo são equivalentes
alter table Pessoa add sexo char(1);
alter table Pessoa add column sexo char(1);

-- Inserção de uma nova pessoa, agora especificando inclusive o sexo
insert into Pessoa values (null, 'Lidia', '2002-09-08','f');

-- Atualização do valor do sexo para os demais registros que já existiam
update Pessoa set sexo = 'f' where idPessoa in (1, 3, 19,20);
update Pessoa set sexo = 'm' where idPessoa between 4 and 18;

-- Excluir uma coluna da tabela Pessoa
alter table Pessoa drop sexo;
alter table Pessoa drop column sexo;

-- Podemos alterar o tipo de uma coluna
alter table Pessoa modify nome varchar(50);                                                        
alter table Pessoa modify column nome varchar(50);  

-- Tentativa de diminuir o tamanho da coluna nome (mas dá erro, pois já tem valor inserido)
alter table Pessoa modify nome varchar(5);

-- Alterando o tipo da coluna dataNascimento 
alter table Pessoa modify dataNascimento int;                                                                                                             
alter table Pessoa modify dataNascimento date; 

-- Exibindo dados da tabela Pessoa ordenados pela data de nascimento
select * from Pessoa order by dataNascimento;

-- Alterando o número do auto_increment 
alter table Pessoa auto_increment = 50;

-- Inserção de uma nova pessoa (vai ficar com idPessoa = 50)
insert into Pessoa values (null, 'Ze Ruela', '1970/10/08'); 

-- Criação de uma nova tabela para mostrar a configuração do número inicial
-- do auto_increment
create table Produto (
   idProduto int primary key auto_increment,
   nome varchar(40) default 'Indefinido',
   preco decimal(5,2)     -- preço máximo será 999,99
                          -- decimal (5,2) - 5 significa que terá 5 dígitos no total
                          --               - 2 dígitos após a vírgula
) auto_increment = 1000;  

-- Inserção de produtos   - obs: decimal é inserido sem aspas
insert into Produto (nome, preco) values ('Mouse Logitech', 200.50),
										 ('Pendrive 8GB', 10);
select * from Produto;

insert into Produto (preco) values (900);
desc Produto;

-- Como renomear uma coluna que já foi criada
-- Qualquer versão do MySQL
alter table Produto change nome nomeProduto varchar(40);
-- Versões posteriores ao MySQL 8.0
alter table Produto rename column nomeProduto to nomeProd;

-- No SQL Server (Microsoft) não se usa auto_increment
-- No lugar é identity(100,10)
create table Carro (
   idCarro int primary key identity(100, 10),
   -- 100 é o número inicial
   -- 10 é o incremento - por exemplo: 100, 110, 120,....
);   