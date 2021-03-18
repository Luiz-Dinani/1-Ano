create database Geracao_Futura; -- Por causa do nome da projeto da escola, tendeu? Muito bom né
use Geracao_Futura;

create table Alunos(ra int primary key,
					nome varchar(50),
					telefone char(11),
                    email varchar(50)
);

insert into Alunos values (2211045,  'Luiz Carlos', '992205-7837', 'luizc.dinani@gmail.com'),
						  (2211044, 'Lucas Mesquita', '99999-9999', 'lucas@gmail.com'),
						  (2211008,'Caua', '99999-1234', 'caua@gmail.com'),
						  (2211999, 'Jorge Mariano', '99999-4321', 'microbiomaltrapilho@gmail.com'),
						  (2211123,'Glaciete', '99999-1010', 'glacietejzago@gmail.com');
select * from alunos;

create table EscolaEM (idEscola int primary key auto_increment,
					   nome varchar(50),
                       bairro varchar(50)
);

insert into EscolaEM (nome, bairro) values ('ETEC Jorge Street',	'Jardim São Caetano'),
										   ('Colégio USCS', 'Santo Antônio'),
										   ('Colégio Objetivo', 'Campestre');
select * from EscolaEM;

create table Empresas (
						IdEmpresa int primary key auto_increment,
                        nome varchar(50),
                        representante varchar(50)
);

insert into Empresas (nome, representante) values ('Safra', 'Odir'),
												  ('Lloyds Bank', 'Jhonny Depp'),
												  ('C6 Bank', 'Alhon Musk');
select * from Empresas;              
              
alter table Alunos add column fkEscolaEM int, add fkEmpresa int;
alter table Alunos add foreign key (fkEscolaEM) references EscolaEM (IdEscola), add foreign key (fkEmpresa) references Empresas(idEmpresa);

update Alunos set fkEscolaEM = 1, fkEmpresa = 1 where ra in (02211045, 02211008);
update Alunos set fkEscolaEM = 2, fkEmpresa = 3 where ra = 2211123;
update Alunos set fkEscolaEM = 3, fkEmpresa = 3 where ra = 2211044;
update Alunos set fkEscolaEM = 3, fkEmpresa = 2 where ra = 2211999;

select * from Alunos;

select * from Alunos, EscolaEM where fkEscolaEM=idEscola;
select * from Alunos, Empresas where fkEmpresa=IdEmpresa;
select * from Alunos, EscolaEM, Empresas where fkEscolaEM=idEscola and fkEmpresa=IdEmpresa;