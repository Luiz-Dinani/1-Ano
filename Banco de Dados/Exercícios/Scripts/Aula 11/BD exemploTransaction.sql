create database exemploTransaction;

use exemploTransaction;

create table tbAluno (ra int primary key auto_increment,
				      nomeAluno varchar(40),
                      bairro varchar(40)
);

insert into tbAluno values (null, 'Maria Oliveira', 'Tatuapé'),
						   (null, 'Betariz Barbosa', 'Saúde'),
						   (null, 'João Teixeira', 'Paraíso');
select * from tbAluno;

start transaction; -- No SQL Server é Begin Transaction
select * from tbAluno;
delete from tbAluno where ra=2;
update tbAluno set bairro = 'Capão Redondo' where ra = 1;
-- Dá pra finalizar de dois jeitos:
-- rollback; -- Desfaz todas as mudanças feitas no transaction e retorna ao ponto anterior
-- commit; -- Confirma todas as mudanças feitas no transaction, não tem mais como desfazer (nem com o rollback), tem que inserir dnv e dar outro updtate
select * from tbAluno;