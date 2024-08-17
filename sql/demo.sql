-- simple movie table
CREATE TABLE movie
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(128) NOT NULL,
    release_date date NOT NULL,
    genre VARCHAR(64),
    rating INT
);

-- some test data
INSERT INTO movie (title, release_date, genre, rating) VALUES ('American Werewolf in London', '1981-08-21', 'Horror', 10);

