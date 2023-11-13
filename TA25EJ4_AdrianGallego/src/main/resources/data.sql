DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

CREATE TABLE peliculas (
codigo int AUTO_INCREMENT,
nombre nvarchar(100),
calificacion_edad int,
PRIMARY KEY (codigo)
);

INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Interestellar', 12);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('El lobo de WallStreet', 18);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('El Renacido', 18);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('KungFu Panda', 12);

CREATE TABLE salas (
codigo int AUTO_INCREMENT,
nombre nvarchar(100),
codigo_pelicula int,
PRIMARY KEY (codigo),
FOREIGN KEY (codigo_pelicula) REFERENCES Peliculas(codigo)
ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO salas (nombre, codigo_pelicula) VALUES ('Sala 1', 1);
INSERT INTO salas (nombre, codigo_pelicula) VALUES ('Sala 2', 2);
INSERT INTO salas (nombre, codigo_pelicula) VALUES ('Sala 3', 3);
INSERT INTO salas (nombre, codigo_pelicula) VALUES ('Sala 4', 4);