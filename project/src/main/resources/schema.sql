CREATE TABLE IF NOT EXISTS usuario (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255),
    password VARCHAR(255),
    email VARCHAR(255) UNIQUE
);

CREATE TABLE IF NOT EXISTS usuario_authorities (
    usuario_id INTEGER NOT NULL,
    authorities VARCHAR(255) DEFAULT 'ROLE_USER',
    CONSTRAINT fk_usuario FOREIGN KEY (usuario_id) REFERENCES usuario(id)
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