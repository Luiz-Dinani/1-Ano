create database ac2LuizCarlos;

use ac2LuizCarlos;

create table tbFormato (idFormato int primary key auto_increment,
                        tipo varchar(45),
                        tempo int
);

create table tbCampeonato (idCampeonato int primary key auto_increment,
						   nome varchar(45),
                           fkFormato int,
                           foreign key (fkFormato) references tbFormato(idFormato)
);

create table tbDadosFIDE (idDadosFIDE int primary key auto_increment,
						  titulo char(3)
);

create table tbPais (idPais int primary key auto_increment,
                     nome varchar(45),
                     ratingMedio int,
                     qtdGM int,
				     posicaoFIDE int
);
						
create table tbEnxadrista (idEnxadrista int primary key auto_increment,
						   nome varchar(45),
                           sexo char(1) check (sexo in ('m', 'f', 'n')),
                           idade int,
                           rating int,
                           fkCapitao int,
                           fkDadosFIDE int,
                           fkCampeonato1 int,
                           fkCampeonato2 int,
                           fkPais int,
                           estado varchar(45),
                           bairro varchar(45),
                           rua varchar(45),
                           numeroCasa int,
                           foreign key (fkCapitao) references tbEnxadrista(idEnxadrista),
                           foreign key (fkDadosFIDE) references tbDadosFIDE(idDadosFide),
                           foreign key (fkCampeonato1) references tbCampeonato(idCampeonato),
                           foreign key (fkCampeonato2) references tbCampeonato(idCampeonato),
                           foreign key (fkPais) references tbPais(idPais)
);

insert into tbFormato(tipo,tempo) values ('Classico', 90),
										 ('Rapida', 10),
                                         ('Blitz', 5);

insert into tbCampeonato(nome, fkFormato) values ('Copa do Mundo', 1),
											   ('MeltWhater', 2),
                                               ('Tata Steel', 3),
                                               ('Nacional', 1);
insert into tbDadosFIDE(titulo) values ('GM'),
									   ('WGM'),
									   ('IM'),
                                       ('CAP');

insert into tbPais values (null, 'Russia', 2739, 256, 1),
						  (null, 'EUA', 2715, 101, 2),
                          (null, 'Hungria', 2644, 58, 8),
                          (null, 'Brasil', 2543, 14, 30);
insert into tbEnxadrista ( nome, sexo, idade, rating, fkCapitao, fkDadosFIDE, fkCampeonato1, fkCampeonato2, fkPais, estado, bairro, rua, numeroCasa) values
								 ('Kasparov', 'm', 58, 2812,null,1,1,2,1,'Estadovsk','Bairrovsk','Moscou', 10),
								 ('Dubov', 'm', 24, 2710, 1, 1,3,null,1,'Estadovs','Bairrovsk','Moscou', 20),
                                 ('Judit Polgar', 'f', 44, 2735, null, 2, 1, 4, 3, 'Hungrovs','Burkshi', 'Budapest', 50),
                                 ('Krikor', 'm', 34, 2555, null, 1, 4, null, 4, 'Sao Paulo', 'Sao Paulo','Centro', 100),
                                 ('Molina', 'm', 36, 2470, 4, 3, 4, null, 4, 'Acre', 'Rio Branco', 'Aragao', 100),
                                 ('Rafaelzinho', 'm', 30, 2200, 4, 4, null, null, 4, 'Rio Grande do Sul', 'Porto Alegre','Centro', 500);

select * from tbformato;
select * from tbcampeonato;
select * from tbdadosfide;
select * from tbenxadrista;
select * from tbpais;
select * from tbformato, tbcampeonato where fkFormato=idFormato;
select * from tbformato, tbcampeonato where fkFormato=idFormato and tempo=10;
select max(rating) from tbenxadrista;
select * from tbEnxadrista as Jogador, tbenxadrista as Capitao where Jogador.fkCapitao = Capitao.idEnxadrista;
select * from tbEnxadrista as Jogador, tbenxadrista as Capitao where Jogador.fkCapitao = Capitao.idEnxadrista and Jogador.rating<2500;
-- Faltaram esses na prova, eu achei que precisava aparecer todos os enxadristas, mas era só os que não eram capitão de nenhuma equipe
select * from tbEnxadrista as Jogador, tbenxadrista as Capitao, tbPais where Jogador.fkCapitao = Capitao.idEnxadrista and Capitao.fkPais=idPais;
select * from tbEnxadrista as Jogador, tbenxadrista as Capitao, tbPais where Jogador.fkCapitao = Capitao.idEnxadrista and Capitao.fkPais=idPais and tbPais.nome='Russia';