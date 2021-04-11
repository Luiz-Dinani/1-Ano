create database funcDependente;

use funcDependente;
-- Criação da tabela Funcionário, já com uma FK para ela mesma, configurando um relacionamento recursivo (nesse caso um funcionário supervisiona outros funcionários)
create table tbFuncionario (
							idFuncionario int primary key auto_increment,
                            nome varchar(45),
                            salario decimal(7,2) check (salario > 1100), -- Salário mínimo
                            sexo char(1) check(sexo = 'm' or sexo = 'f' or sexo = 'n'),
                            fkSupervisor int,
                            foreign key (fkSupervisor) references tbFuncionario(idFuncionario)
                            )auto_increment = 1000;
                            
-- Criação da tabela Dependente, configurada como entidade fraca
create table tbDependente(
						fkFuncionario int,
                        idDependente int, -- NÃO COLOCAR PRIMARY KEY AQUI, POIS SERÁ UMA PK COMPOSTA, TAMBÉM NÃO COLOCAR AUTO_INCREMENT
                        nomeDependente varchar(45),
                        tipo varchar(45),
                        dataNasc date,
                        foreign key (fkFuncionario) references tbFuncionario(idFuncionario),
                        primary key (fkFuncionario, idDependente)
                        );
                        
-- Inserts Funcionário
insert into tbFuncionario values (null, 'Claudio Nunes', 20000, 'm', null),
								 (null, 'Joao Silva', 15000, 'm', 1000),
								 (null, 'Maria Souza', 12000, 'f', 1000),
								 (null, 'Ana Teixeira', 10000, 'f', 1001),
								 (null, 'Carlos Peixeira', 8000, 'm', 1002);
                                 
select * from tbFuncionario;

-- inserts Dependentes
insert into tbDependente values(1000, 1, 'Cláudia Nunes', 'Conjuge', '1990/03/05'), -- 1000 signifa que é o Claudio, 1 significa que é o primeiro dependente
						  	   (1000, 2, 'Pedro Nunes', 'Filho', '2010/04/06'), -- 1000 signifa que é o Claudio, 2 significa que é o segundo dependente
                               (1000, 3, 'Petra Nunes', 'Filha', '2012/05/10'), -- 1000 signifa que é o Claudio, 3 significa que é o terceiro dependente
                               (1001, 1, 'Joana Silva', 'Conjuge', '2000/10/04'), -- 1000 = Joao e 1 é o primeiro dependente dele
                               (1001, 2, 'Jurema Silva', 'Conjuge', '2020/11/10'), -- 1000 = Joao e 2 é o segundo dependente dele
                               (1002, 1, 'Mario Souza', 'Conjuge', '2001/02/05'); -- 1000 = Joao e 2 é o segundo dependente dele
                               
select * from tbFuncionario, tbDependente where fkFuncionario=idFuncionario;
select * from tbFuncionario, tbDependente where fkFuncionario=idFuncionario and nome='Claudio Nunes';

-- Exibir os dados dos Funcionário e dos seus supervisores
select * from tbFuncionario as f, tbFuncionario as s where f.fkSupervisor = s.idFuncionario;