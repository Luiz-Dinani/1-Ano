-- Banco de Dados original na pasta Aula 1

use musicas;

-- 1 e 2
create table Album (idAlbum int primary key auto_increment,
					nome varchar(40),
                    gravadora varchar(40));

insert into album (nome, gravadora) values('Rádio PMM', 'PMM records'),
										  ('Rádio Sr Sider', 'Sr Sider records'),
                                          ('The Number of The Beast', 'EMI'),
                                          ('One Night Only', 'Atlantic Records'),
                                          ('Nerd Hits', '7mz Records'),
                                          ('Retrospectiva Musical', 'Inutil Records'),
                                          ('Sonic Firestorm', 'Sanctuary Records');

-- 3
alter table musica add column fkAlbum int;
alter table musica add foreign key (fkAlbum) references Album(idAlbum);

-- 4
update Musica set fkAlbum = 1 where idMusica = 1;
update Musica set fkAlbum = 2 where idMusica = 2;
update Musica set fkAlbum = 3 where idMusica = 3;
update Musica set fkAlbum = 4 where idMusica = 4;
update Musica set fkAlbum = 5 where idMusica = 5;
update Musica set fkAlbum = 5 where idMusica = 6;
update Musica set fkAlbum = 5 where idMusica = 7;
update Musica set fkAlbum = 6 where idMusica = 8;
update Musica set fkAlbum = 6 where idMusica = 9;
update Musica set fkAlbum = 7 where idMusica = 10;
update Musica set fkAlbum = 7 where idMusica = 11;
update Musica set fkAlbum = 7 where idMusica = 12;
update Musica set fkAlbum = 3 where idMusica = 13;
update Musica set fkAlbum = 3 where idMusica = 14;
update Musica set fkAlbum = 4 where idMusica = 15;

-- 5
select * from musica, album where fkAlbum=idAlbum;

-- 6
select * from musica, album where fkAlbum=idAlbum and Album.nome = 'The Number of The Beast';
-- 7
select * from musica, album where fkAlbum=idAlbum and Album.gravadora = 'Atlantic Records';