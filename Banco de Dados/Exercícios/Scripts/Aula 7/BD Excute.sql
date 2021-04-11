create database Excute;
use Excute;

create table tbProjeto (
						 idProjeto int primary key auto_increment,
                         nome varchar(45),
                         descricao varchar(100)
);

create table tbAluno (
					   RA int primary key auto_increment,
                       nome varchar(45),
                       telefone char(11),
                       fkProjeto int,
                       fkRepresentante int,
                       foreign key (fkProjeto) references tbProjeto(idProjeto),
                       foreign key (fkRepresentante) references tbAluno(RA)
)auto_increment=10000;

create table tbAcompanhante (
							  fkAluno int,
                              idAcompanhante int,
                              nome varchar(45),
                              relacao varchar(45),
                              primary key (idAcompanhante, fkAluno)
);
                              
insert into tbProjeto(nome, descricao) values 
											  ('LIPMP', 'Linha de Produção com Molde Personalizável'),
											  ('VegCare', 'Monitoramento do plantio de batatas'),
											  ('StrawControl','Monitoramento do plantio de morangos em ambientes fechados');
                                              
insert into tbAluno(nome, telefone, fkProjeto, fkRepresentante) values 
																	   ('Luiz Carlos', '12920017526', 1, null),
																	   ('Yan Gimenes', '11920057837', 1, 10000),
                                                                       ('Elissa Nayara', '11949470557', 1, 10000),
                                                                       ('Alexandre de Jesus', '11999803672', 1, 10000),
                                                                       ('Lucas Soares', '11996277627', 1 , 10000),
                                                                       ('Victor Gabriel', '11996272767', 1 , 10000),
                                                                       ('Rafael Benedito', '11996272767', 1 , 10000),
                                                                       ('Caua Benini', '11992657767', 2 , null), 
                                                                       ('Mateus Lavigne', '11929567767', 2 , 10007),
                                                                       ('Victor Garcia', '11929567767', 2 , 10007),
                                                                       ('Fernando', '1194945570', 2 , 10007),
                                                                       ('Lucas Mesquita', '1194123545', 2 , 10007),
                                                                       ('Enzo Godoy', '1199589180', 2 , null), 
                                                                       ('Gustavo Leal', '1195783280', 3 , 10012),
                                                                       ('Rodrigo Garcez', '1191234320', 3 , 10012),
                                                                       ('Joao Pedro', '1199389870', 3 , 10012),
                                                                       ('Enan', '1199655565', 3 , 10012),
                                                                       ('Rafael Faria', '1191234567', 3 , 10012),
                                                                       ('Gabriel Sanches', '1192134567', 3 , 10012);
          
insert into tbAcompanhante (fkAluno, idAcompanhante, nome, relacao) values	
																			(10000, 1, 'Luiz Carlos Pai', 'Pai'),
																			(10000, 2, 'Marli Lucas', 'Mae'),
																			(10000, 3, 'Anna Paola', 'Irma'),
																			(10001, 1, 'Pai do Yan', 'Pai'),
																			(10007, 1, 'Pai do Caua', 'Pai'),
																			(10011, 1, 'Pai do Lucas', 'Pai');
-- update tbAcompanhante set fkAluno = 10011 where fkAluno=10012 and idAcompanhante = 1; Tive que mudar algumas fkAluno. Desse jeito funciona perfeitamente, só muda a fk do Aluno que eu queria (uma preocupação seria alterar todas as colunas que tem idAcompanhante = 1, já que ela é a chave primária da tabela e deve ser apresentada no update)

select * from tbProjeto;
select * from tbAluno;
select * from tbAcompanhante;
select * from tbAluno, tbProjeto where fkProjeto = idProjeto;
select * from tbAluno, tbAcompanhante where RA = fkAluno;
select * from tbAluno as a, tbAluno as r where a.fkRepresentante = r.RA;
select * from tbAluno, tbProjeto where fkProjeto = idProjeto and tbProjeto.nome="LIPMP";
select * from tbAluno, tbAcompanhante, tbProjeto  where RA=fkAluno and tbAluno.fkProjeto=idProjeto;