
CREATE TABLE IF NOT EXISTS usuario (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    contraseña VARCHAR(100) NOT NULL,
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    role role_enum DEFAULT 'USER'
);


CREATE TABLE IF NOT EXISTS personaje (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    saga VARCHAR(100),
    descripcion TEXT,
    fuerza INT,
    inteligencia INT,
    resistencia INT,
    velocidad INT,
    agilidad INT,
    carisma INT,
    alcance INT,
    altura INT,
    peso INT,
    experiencia INT,
    imagen_cuerpo TEXT,
    imagen_batalla TEXT,
    imagen_busto TEXT
);


CREATE TABLE IF NOT EXISTS equipo (
    id SERIAL PRIMARY KEY,
    nombre_equipo VARCHAR(100),
    id_usuario INT,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);


CREATE TABLE IF NOT EXISTS personajes_de_equipo (
    id_equipo INT,
    id_personaje INT,
    PRIMARY KEY (id_equipo, id_personaje),
    FOREIGN KEY (id_personaje) REFERENCES personaje(id),
    FOREIGN KEY (id_equipo) REFERENCES equipo(id)
);


CREATE TABLE IF NOT EXISTS batalla (
    id SERIAL PRIMARY KEY,
    id_equipo_1 INT,
    id_equipo_2 INT,
    FOREIGN KEY (id_equipo_1) REFERENCES equipo(id),
    FOREIGN KEY (id_equipo_2) REFERENCES equipo(id)
);


CREATE TABLE IF NOT EXISTS voto (
    id SERIAL PRIMARY KEY,
    id_usuario INT,
    id_batalla INT,
    id_equipo_votado INT,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id),
    FOREIGN KEY (id_batalla) REFERENCES batalla(id),
    FOREIGN KEY (id_equipo_votado) REFERENCES equipo(id)
);
