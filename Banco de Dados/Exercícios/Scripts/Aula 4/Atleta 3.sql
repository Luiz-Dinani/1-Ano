-- O Banco de Dados está na pasta Aula 1

use atleta;

create table Pais( idPais int primary key auto_increment,
				   nome varchar(50),
                   capital varchar(50)
);
insert into Pais (nome,capital) values ('Alemanha', 'Berlim'),
									   ('Gabão', 'Libreville'),
                                       ('França', 'Paris'),
									   ('Brasil', 'Brasília'),
									   ('Jamaica', 'Kingston');
-- 1
alter table Atleta add column fkPais int;
alter table Atleta add foreign key (fkPais) references Pais(idPais);

-- 2
update Atleta set fkPais = 1 where idAtleta = 1;
update Atleta set fkPais = 2 where idAtleta = 2;
update Atleta set fkPais = 3 where idAtleta = 3;
update Atleta set fkPais = 4 where idAtleta in(4,5,6,7);
update Atleta set fkPais = 5 where idAtleta = 8;

-- 3
select * from Atleta, Pais where fkPais=IdPais;


-- 4
select * from atleta, Pais where fkPais=IdPais and Pais.nome='Brasil';