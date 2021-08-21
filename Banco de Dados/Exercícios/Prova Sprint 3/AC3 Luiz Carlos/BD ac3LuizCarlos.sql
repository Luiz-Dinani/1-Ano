CREATE database ac3LuizCarlos ;
USE ac3LuizCarlos ;

CREATE TABLE Campeonato(
  idCampeonato INT primary key auto_increment,
  Nome VARCHAR(45),
  Plataforma VARCHAR(45) check(Plataforma in('Lichess', 'Chess.com','Chess24'))
  );

CREATE TABLE Pais(
  idPais INT primary key auto_increment,
  nome VARCHAR(45),
  qtdCompetidores VARCHAR(45)
  );

CREATE TABLE Enxadrista(
  idEnxadrista INT primary key auto_increment,
  nome VARCHAR(45),
  Idade INT(2),
  Sexo CHAR(1) check (sexo in('h','m','n')),
  fkPais INT,
  foreign key (fkPais) references Pais(idPais)
  );

CREATE TABLE EnxadristaCampeonato(
  fkEnxadrista INT,
  fkCampeonato INT,
  qtdTitulos INT,
  PRIMARY KEY (fkEnxadrista, fkCampeonato),
  foreign key (fkEnxadrista) references Enxadrista(idEnxadrista),
  foreign key (fkCampeonato) references Campeonato(idCampeonato)
);

insert into campeonato(nome, plataforma) values ('New in Chess', 'Chess.com'),
												('Campeonato BandChess', 'Lichess'),
												('Olimpiadas', 'Chess24');

insert into pais(nome, qtdCompetidores) values ('Russia', 2),
											   ('Brasil', 2),
                                               ('EUA', 2);

insert into enxadrista(nome, idade, sexo, fkPais) values ('Dubov', 25, 'm', 1),
														 ('Nepominiatchi', 30, 'm', 1),
                                                         ('Krikor', 34, 'm', 2),
                                                         ('Rafael Leitao', 30, 'm', 2),
                                                         ('Levy Rozman', 25, 'm', 3),
                                                         ('Alexandra Botez', 23, 'f', 3);
insert into enxadristaCampeonato values (1, 1, 2),
										(1, 3, 1),
                                        (2, 1, 1),
                                        (3, 1, 5),
                                        (3, 2, 15),
                                        (3, 3, 5),
                                        (4, 1, 3),
                                        (4, 2, 7),
                                        (4, 3, 1),
                                        (5, 2, 2),
                                        (6, 2, 1);
                                        
select * from Campeonato;
select * from Pais;
select * from Enxadrista;
select * from EnxadristaCampeonato;
select * from Enxadrista, Pais where fkPais=idPais;
select * from EnxadristaCampeonato join Enxadrista on fkEnxadrista = idEnxadrista
								   join Campeonato on fkCampeonato = idCampeonato;
select * from enxadrista join pais where enxadrista.nome='krikor' and pais.nome='Brasil';
select Enxadrista.Nome, EnxadristaCampeonato.qtdTitulos from EnxadristaCampeonato join Enxadrista on fkEnxadrista = idEnxadrista;
select fkEnxadrista, sum(qtdTitulos) as 'Soma Titulos', avg(qtdTitulos) as 'Media Titulos', min(qtdTitulos) as 'Menor qtd de Titulos', max(qtdTitulos) as 'Maior qtd de Titulos' from enxadristaCampeonato group by fkEnxadrista;
insert into enxadrista(nome, idade, sexo, fkPais) value ('Raffael', 31, 'm', 2);
select * from Enxadrista left join EnxadristaCampeonato on idEnxadrista = fkEnxadrista;
update Pais set qtdCompetidores = 3 where idPais = (select idPais from Pais where nome = 'Brasil');
select * from Campeonato;