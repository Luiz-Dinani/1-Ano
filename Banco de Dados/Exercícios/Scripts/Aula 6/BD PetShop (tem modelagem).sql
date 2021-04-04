create database PetShop;
use PetShop;

create table tbCliente(
						idCliente int primary key auto_increment,
                        nome varchar(45),
                        telFixo char(12),
                        celular char(12),
                        endereco varchar(50)
);

create table tbPet(
						idPet int primary key auto_increment,
                        nome varchar(45),
                        tipo varchar(45),
                        raca varchar(45),
                        peso decimal(4,2) not null check (peso>0)
)auto_increment=101;

alter table tbPet add column fkCliente int, add foreign key (fkCliente) references tbCliente(idCliente);

insert into tbCliente (nome,telFixo,celular,endereco) values
															('Anna', null, '12 920017525', 'Taubate'),
															('Douglas', '11 383538569', '11 949470557', 'Sao Paulo'),
                                                            ('Luiz',  null, '11 999803672', 'Taubate'),
                                                            ('Julia',  null, '11 996277627', 'Sao Caetano do Sul'),
                                                            ('Emerson Sheik', null, '11 920057837', 'Sao Paulo');


insert into tbPet(nome, tipo, raca, peso, fkCliente) values 
															('Effy', 'Gato', 'Vira Lata', 3, 1),
														    ('TamTam', 'Cachorro', 'Corgi', 5, 2),
															('Cho', 'Cachorro', 'Corgi', 5, 2),
															('Mimi', 'Peixe', 'Pacu', 10, 3),
															('Kiang', 'Gato', 'Bombaim', 5, 4),
															('Fu', 'Gato', 'Ragdoll', 7, 4),
															('Mazekeen', 'Gato', 'Mongol', 7, 4),
															('Cuta', 'Macaco', 'Prego', 3, 5);

select * from tbCliente;
select * from tbPet;

alter table tbCliente modify nome varchar(50);

select * from tbPet where tipo = 'Cachorro';

select nome, peso from tbPet;

select * from tbPet order by nome;
select * from tbCliente order by endereco desc;
select * from tbPet where nome like 'm%';
select * from tbCliente where nome like '% Sheik';

update tbCliente set telFixo = '12 383556385' where idCliente;
select * from tbCliente where idCliente = 1;

select * from tbCliente, tbPet where fkCliente = idCliente;
select * from tbCliente, tbPet where fkCliente = idCliente and fkCliente = 1;
select sum(peso) as 'Soma dos Pesos', avg(peso) 'Media dos Pesos' from tbPet;
select max(peso), min(peso) from tbPet;
select sum(peso) as 'Soma dos Pesos', avg(peso) 'Media dos Pesos' from tbPet where tipo = 'Cachorro';

delete from tbPet where idPet = 104;
select * from tbPet;
-- drop table tbCliente, tbPet;