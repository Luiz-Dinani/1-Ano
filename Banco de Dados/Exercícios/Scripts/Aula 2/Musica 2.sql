use musicas;
select * from Musica where idMusica <> 5 && idMusica <> 10; -- A
select * from Musica order by Titulo; -- B
select * from Musica order by Titulo desc; -- C
select * from Musica where Titulo like 'M%'; -- D
select * from Musica where artista like '%n'; -- E
select * from Musica where genero like '_a%'; -- F
select * from Musica where titulo like '%n_'; -- G
update Musica set genero = 'Muitos' where idMusica = 9; -- H
update Musica set artista = 'Lucas Inutilismo', genero = 'Muitos' where idMusica = 8; -- I
select * from Musica;
delete from Musica where idMusica = 1;
drop table Musica;