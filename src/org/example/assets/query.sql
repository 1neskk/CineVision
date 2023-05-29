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
    release_year varchar(255) not null default '',
    genre varchar(255) not null default '',
    primary key (id)
    );

insert into tb_users (name, password, user_type) values
                                                     ('admin', 'admin', 'admin'),
                                                     ('user', 'user', 'common');

INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Interstellar', '2014', 'Christopher Nolan', 'Science Fiction/Adventure');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Pulp Fiction', '1994', 'Quentin Tarantino', 'Thriller');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Dark Knight', '2008', 'Christopher Nolan', 'Action');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Godfather', '1972', 'Francis Ford Coppola', 'Crime/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Jurassic Park', '1993', 'Steven Spielberg', 'Adventure/Action');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Titanic', '1997', 'James Cameron', 'Romance/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Matrix', '1999', 'The Wachowskis', 'Action/Science Fiction');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Shawshank Redemption', '1994', 'Frank Darabont', 'Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Inception', '2010', 'Christopher Nolan', 'Action/Science Fiction');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Back to the Future', '1985', 'Robert Zemeckis', 'Adventure/Comedy');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Forrest Gump', '1994', 'Robert Zemeckis', 'Comedy/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Silence of the Lambs', '1991', 'Jonathan Demme', 'Thriller/Horror');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Star Wars: Episode IV - A New Hope', '1977', 'George Lucas', 'Science Fiction/Adventure');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Avengers', '2012', 'Joss Whedon', 'Action/Science Fiction');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Social Network', '2010', 'David Fincher', 'Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Shining', '1980', 'Stanley Kubrick', 'Horror');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Lion King', '1994', 'Roger Allers, Rob Minkoff', 'Animation/Adventure');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Fight Club', '1999', 'David Fincher', 'Drama/Thriller');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Hangover','2009', 'Todd Phillips', 'Comedy');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Gladiator', '2000', 'Ridley Scott', 'Action/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Exorcist', '1973', 'William Friedkin', 'Horror');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Indiana Jones and the Raiders of the Lost Ark', 1981, 'Steven Spielberg', 'Adventure/Action');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Notebook', '2004', 'Nick Cassavetes', 'Romance/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Terminator', '1984', 'James Cameron', 'Action/Science Fiction');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Jaws', '1975', 'Steven Spielberg', 'Thriller/Adventure');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('E.T. the Extra-Terrestrial', '1982', 'Steven Spielberg', 'Science Fiction/Adventure');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Departed', '2006', 'Martin Scorsese', 'Crime/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Grease', '1978', 'Randal Kleiser', 'Romance/Musical');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Bourne Identity', '2002', 'Doug Liman', 'Action/Thriller');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Casablanca', '1942', 'Michael Curtiz', 'Romance/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Top Gun', '1986', 'Tony Scott', 'Action/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Sixth Sense', '1999', 'M. Night Shyamalan', 'Thriller/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Home Alone', '1990', 'Chris Columbus', 'Comedy');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Ghostbusters', '1984', 'Ivan Reitman', 'Comedy/Science Fiction');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Princess Bride', '1987', 'Rob Reiner', 'Adventure/Romance');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Fast and the Furious', '2001', 'Rob Cohen', 'Action');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Gone with the Wind', '1939', 'Victor Fleming', 'Romance/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Apocalypse Now', '1979', 'Francis Ford Coppola', 'War/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Pretty Woman', '1990', 'Garry Marshall', 'Romance/Comedy');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Mad Max: Fury Road', '2015', 'George Miller', 'Action/Science Fiction');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Revenant', '2015', 'Alejandro González Iñárritu', 'Adventure/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Breakfast Club', '1985', 'John Hughes', 'Comedy/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Conjuring', '2013', 'James Wan', 'Horror');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Raiders of the Lost Ark', 1981, 'Steven Spielberg', 'Action/Adventure');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Rocky', '1976', 'John G. Avildsen', 'Sports/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Great Gatsby', '2013', 'Baz Luhrmann', 'Romance/Drama');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Blade Runner', '1982', 'Ridley Scott', 'Science Fiction/Thriller');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('The Hangover', '2009', 'Todd Phillips', 'Comedy');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Zombieland', '2009', 'Ruben Fleischer', 'Comedy/Horror');
INSERT INTO tb_movies (title, release_year, director, genre) VALUES ('Love Actually', '2003', 'Richard Curtis', 'Romance/Comedy');

select * from tb_users;
