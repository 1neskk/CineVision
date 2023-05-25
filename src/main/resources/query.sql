create database if not exists Cinevision;
use Cinevision;
SHOW TABLES;


create table if not exists tb_users
(
    id int not null auto_increment,
    name varchar(255) not null,
    password varchar(255) not null,
    age int not null default 0,
    gender varchar(255) not null default 'male',
    movie_genre varchar(255) not null default '',
    user_type varchar(255) not null default 'common',
    created_at timestamp default current_timestamp,
    primary key (id)
);

create table if not exists tb_movies
(
    id int not null auto_increment,
    title varchar(255) not null default '',
    director varchar(255) not null default '',
    release_year varchar(255) not null default '',
    genre varchar(255) not null default '',
    primary key (id)
);

insert into tb_users (name, password, user_type) values 
('admin', 'admin', 'admin'),
('user', 'user', 'common');

-- insert into tb_movies (genre) values
-- ('Romance'),
-- ('Comédia'),
-- ('Terror'),
-- ('Suspense'),
-- ('Ação');

INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The godfather', '1972', 'Francis Ford Coppola', 'Suspense');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Interstellar', '2014', 'Cristopher Nolan', 'Ação');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Fight Club', '1999', 'David Fincher', 'Suspense');



select * from tb_users;

