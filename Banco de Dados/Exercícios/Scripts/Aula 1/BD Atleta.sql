create database Atleta;
use Atleta;
create table Atleta(
	idAtleta int primary key,
    nome varchar(40),
    modalidade varchar(40),
    qtdMedalha int    
);
insert into Atleta values (01, 'Reus', '100m rasos', 1),
						  (02, 'Aubameyang', '100m rasos', 5),
                          (03, 'Mbappe', '100m rasos', 895),
                          (04, 'Luan', 'Arremesso de Mamaco', '5'),
                          (05, 'Renan', 'Arremesso de Mamaco', '15'),
                          (06, 'Ronaldo Fenômeno', 'Melhor jogador de futebol do mundo', '3'),
                          (07, 'Ronaldinho', 'Melhor jogador de futebol do mundo', '2'),
                          (08, 'Usain Bolt', '100m rasos', '8');

select * from Atleta; -- A
select nome, qtdMedalha from Atleta; -- B
select Modalidade, nome from Atleta; -- C
select * from Atleta where modalidade = 'Arremesso de Mamaco'; -- D
select * from Atleta where qtdMedalha>3; -- E
select * from Atleta where idAtleta<6; -- F
select nome from Atleta where modalidade = 'Melhor jogador de futebol do mundo'; -- G
select * from Atleta where idAtleta>=5 && idAtleta<=7; -- H