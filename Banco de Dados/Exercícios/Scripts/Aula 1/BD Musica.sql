-- Criação do banco de de dados Musicas
create database Musicas; -- Musicas é o nome do banco de dados
-- Selecionar o Banco de Dados Musicas
use Musicas;
-- Criação da tabela Musica
create table Musica (
  idMusica int primary key,
  titulo varchar(40),
  artista varchar (40),
  genero varchar (40)
  );

-- Inserção  de dados de uma musica na tabela
insert into Musica values (01, 'MC Poze nos anos 80', 'PMM', 'Funk nos anos 80'),
						  (02, 'Tropa do Kong', 'Sr Sider', 'Rave Funk'),
                          (03, 'Hallowed be thy name', 'Iron Maiden', 'Metal'),
                          (04, 'Closer than close', 'Bee Gees', 'Rock'),
                          (05, 'Rap da Akatsuki', '7 Minutoz', 'Rap de anime'),
                          (06, 'Rap do Kisame', '7 Minutoz', 'Rap de anime'),
                          (07, 'Rap do Kakuzu', '7 Minutoz', 'Rap de Anime'),
                          (08, '2019 em uma música', 'Inutilismo', 'Variados'),
                          (09, '2020 em uma música', 'Inutilismo', 'Variados'),
                          (10, 'Fury of the Storm', 'DragonForce', 'Metal'),
                          (11, 'Through the Fire and Flames', 'DragonForce', 'Metal'),
                          (12, 'Soldiers of the Wasteland', 'DragonForce', 'Metal'),
                          (13, 'Fear of the dark', 'Iron Maiden', 'Metal'),
                          (14, 'Dance of the Death', 'Iron Maiden', 'Metal'),
                          (15, 'Staying Alive', 'Bee Gees', 'Rockp');

-- Exibir os dados da tabela
select * from Musica; -- A
select titulo, artista from Musica; -- B
select genero, artista from Musica; -- C
select * from Musica where genero = 'metal'; -- D
select * from Musica where artista = '7 minutoz'; -- E
select  titulo from Musica where genero = 'Rock'; -- F
select titulo, genero from Musica where artista = 'PMM'; -- G
select * from Musica where idMusica> 5 && idMusica<10; -- H
select * from Musica where idMusica<= 5; -- I
select * from Musica where idMusica>= 5; -- J
