create database if not exists Cinevision;
use Cinevision;

create table if not exists tb_users
(
    id int not null auto_increment,
    name varchar(255) not null,
    password varchar(255) not null,
    email varchar(255) not null,
    user_type varchar(255) not null,
    created_at timestamp default current_timestamp,
    primary key (id)
);

create table if not exists tb_movies
(
    id int not null auto_increment,
    name varchar(255) not null,
    description varchar(255) not null,
    image varchar(255) not null,
    created_at timestamp default current_timestamp,
    primary key (id)
);

insert into tb_users (name, password, email, user_type) values 
('admin', 'admin', 'admin@example.com', 'admin'),
('user', 'user', 'user@example.com', 'common');

select * from tb_users;
