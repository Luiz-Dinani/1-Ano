create database caseFuncionario1;

use caseFuncionario1;

create table Funcionario (
   idFunc int primary key auto_increment,
   nome varchar(40),
   genero char(1),
   check (genero = 'm' or genero ='f' or genero = 'n'),
   -- no MySQL, versões anteriores a 8.0.16, devem usar enum no lugar do check:
   -- genero enum('m','f','n'),
   salario double, -- decimal(7,2) 7 significa que o número tem 7 digitos, considerando os digitos antes da 
                         -- virgula e os depois
                         -- 2 significa que tem 2 diginos após a vírgula
                         -- decimal(7,2) significa um número do tipo 99999,99
   check (salario > 0),  -- isso não funciona em versões anteriores a 8.0.16 do MySQL
                         -- se fosse nota: check (nota >= 0 and nota <= 10)
   cpf char(11) unique,
   fkSupervisor int,  -- implementação de um relacionamento recursivo um para muitos
   foreign key(fkSupervisor) references Funcionario(idFunc)
) auto_increment = 1000;

select * from Funcionario;
desc Funcionario;

-- o comando a seguir não funciona pois está tentando inserir 'x' para genero
/*insert into Funcionario values
    (null, 'Maria Aparecida','x',15000,'15915998788', null);
*/
-- inserção de um funcionário, que não tem supervisor    
insert into Funcionario values
    (null, 'Maria Aparecida','f',15000, '15915998788',null);

-- Inserir o mesmo cpf - unique - Este comando dará erro
/*insert into Funcionario values
    (null, 'Maria Desaparecida','f', 15000, '15915998788', null); */
    
insert into Funcionario values
    (null, 'Vitória','f', 50000, '15915915877', 1000);
    
-- inserção de mais um funcionário (supervisor deste funcionário será a Maria Aparecida - id 1000)    
insert into Funcionario values
	(null, 'José da Silva','m',5000,'12345678999', 1000);
-- inserção de mais um funcionário (supervisor deste funcionário será o José da Silva - id 1001)
insert into Funcionario values
    (null, 'João Oliveira','m', 2000,'65498788844',1001);

-- Exibir os dados dos funcionários e dos supervisores correspondentes
-- se existissem 2 tabelas, uma Funcionario e outra Supervisor, ficaria assim o comando:
-- select * from funcionario join supervisor on fksupervisor = idfunc;
-- mas como a tabela é a mesma, tanto de Funcionario como de Supervisor, então o certo é:
select * from funcionario as func join funcionario as supervisor 
													on func.fksupervisor = supervisor.idfunc;
                                                    
select func.nome as NomeFunc, supervisor.nome as Supervisor from funcionario as func join funcionario as supervisor on func.fksupervisor = supervisor.idfunc;

-- Criação da tabela Dependente, que é uma entidade fraca em relação a Funcionario 
create table Dependente (
   fkFunc int,
   foreign key (fkFunc) references Funcionario(idFunc),
   idDep int,
   primary key (fkFunc, idDep),  -- chave primária composta
   nomeDep varchar(40),
   dataNasc date,
   parentesco varchar(45)
);
-- Inserção de dependentes
insert into Dependente values
   (1000, 1, 'Ana', '2012-10-01','filha'),
   (1000, 2, 'Paulo', '1984-03-05', 'marido'),
   (1001, 1, 'Antônio', '1968-09-06', 'pai'),
   (1002, 1, 'Clara', '2014-06-01', 'irmã'),
   (1001, 2, 'Vitório', '1994-06-01', 'irmão');

select * from funcionario;
-- Exibe a tabela Dependente
select * from Dependente;

-- Inserir dados de um funcionário sem supervisor.
insert into Funcionario values
    (null, 'Mateus','m',1292, '12345671112',null);

-- exibir os dados dos funcionários e seus dependentes - SELECT LIMITADO - traz apenas a JUNÇÃO
SELECT * FROM funcionario, dependente WHERE idFunc = fkFunc;

-- exibir os dados dos funcionários e seus dependentes utilizando o JOIN
SELECT * FROM funcionario inner join dependente	on idFunc = fkFunc;
                                   
-- exibir os dados dos funcionários sem dependentes e os funcionários com dependentes                                   
SELECT * FROM funcionario left join dependente on idFunc = fkFunc;
                             
-- exibir os dados dos dependentes e funcionários e dos funcionários sem dependentes
SELECT * FROM  dependente right join funcionario on idFunc = fkFunc;
                                    
-- exibir os dados dos dependentes, dos supervisores e dos dependentes de forma correspondente
SELECT * FROM funcionario as f 	INNER JOIN funcionario as s	on s.idFunc = f.fkSupervisor
                                INNER JOIN dependente on f.idFunc = fkFunc;
    
-- exibir os dados dos dependentes, dos supervisores e dos dependentes de forma correspondente apenas de um determinado funcionário  
SELECT * FROM funcionario as f 
	INNER JOIN funcionario as s	on s.idFunc = f.fkSupervisor
	INNER JOIN dependente on f.idFunc = fkFunc
    where f.nome = 'José da Silva'; 
    
-- exibir apenas o nome do funcionário, o nome do supervisor, o nome do dependente e o parentesco dos funcionários, seus supervisores e dependentes
SELECT f.nome, s.nome, nomeDep, parentesco FROM funcionario as f INNER JOIN funcionario as s on s.idFunc = f.fkSupervisor 
																 INNER JOIN dependente on f.idFunc = fkFunc; 

-- Exibir os dados dos funcionários com e sem dependentes.
select * from funcionario left join dependente on fkFunc = idFunc;

-- Exibir os dados dos funcionários sem dependentes.
select * from funcionario
left join dependente on fkFunc = idFunc
where fkFunc is null;

-- Exibir os dados dos funcionários, seus respectivos supervisores e seus dependentes.
select * from funcionario as f
inner join funcionario as s on s.idFunc = f.fkSupervisor
inner join dependente on fkFunc = f.idFunc;

-- Exibir os dados dos funcionários e seus respectivos supervisores, funcionários sem supervisor, e seus respectivos dependentes.
select * from funcionario as f
left join funcionario as s on s.idFunc = f.fkSupervisor
inner join dependente on fkFunc = f.idFunc;