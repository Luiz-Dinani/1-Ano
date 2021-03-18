use Atleta;
select * from Atleta where idAtleta <> 3; -- A
select * from Atleta order by modalidade; -- B
select * from Atleta order by qtdMedalha desc; -- C
select nome from Atleta where nome like '%o%'; -- D
select nome from Atleta where nome like 'L%'; -- E
select nome from Atleta where nome like '%g'; -- F
select nome from Atleta where nome like '%a_'; -- G
update Atleta set qtdMedalha = 900 where idAtleta = 3; -- H
update Atleta set nome = 'Diabo Devil 666', qtdMedalha = 10 where idAtleta = 4; -- I
delete from Atleta where idAtleta = 5; -- J
-- drop table Atleta; -- K (Deixei esse como comentário para não ter que ficar criando a tabela de novo