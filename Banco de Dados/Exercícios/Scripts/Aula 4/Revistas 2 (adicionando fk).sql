-- O código inteiro dela está na pasta Aula 3
use Revista;

insert into Editora value (null, 'Globo', '1960-03-20');
alter table revista add column fkEditora int;

alter table revista add foreign key (fkEditora) references Editora (idEditora); -- 1

-- 2
update Revista set fkEditora = 1002 where idRevista = 1;
update Revista set fkEditora = 1002 where idRevista = 2;
update Revista set fkEditora = 1003 where idRevista = 3;
update Revista set fkEditora = 1002 where idRevista = 4;
update Revista set fkEditora = 1001 where idRevista = 5;
update Revista set fkEditora = 1002 where idRevista = 6;
update Revista set fkEditora = 1002 where idRevista = 7;
update Revista set fkEditora = 1000 where idRevista = 8;

select * from revista; -- 3
select * from editora, revista where fkEditora=idEditora; -- 4
select * from editora, revista where fkeditora=idEditora and idEditora=1002; -- 5