create database if not exists Cinevision;
use Cinevision;

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
    release_date date not null default '2023-01-01',
    genre varchar(255) not null default '',
    primary key (id)
);

insert into tb_users (name, password, user_type) values 
('admin', 'admin', 'admin'),
('user', 'user', 'common');

insert into tb_movies (genre) values
('Romance'),
('Comédia'),
('Terror'),
('Suspense'),
('Ação');

select * from tb_users;
select genre from tb_movies;
