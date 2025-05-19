INSERT INTO personaje (id, nombre, saga, fuerza, inteligencia, resistencia, velocidad, agilidad, carisma, alcance, altura, peso, experiencia, imagen_cuerpo, imagen_batalla, imagen_busto, descripcion)
VALUES
-- Narnia
(1, 'Aslan', 'Narnia', 95, 90, 100, 80, 70, 100, 90, 250, 300, 100, 'assets/cuerpo/aslan.jpg', 'assets/batalla/aslan.jpg', 'assets/busto/aslan.jpg', 'El noble león creador de Narnia, símbolo de sabiduría y poder divino que guía a los protagonistas.'),
(2, 'Peter Pevensie', 'Narnia', 75, 70, 80, 75, 70, 85, 60, 185, 85, 80, 'assets/cuerpo/peter.jpg', 'assets/batalla/peter.jpg', 'assets/busto/peter.jpg', 'Valiente líder de los reyes de Narnia, destaca en combate y estrategia con gran sentido de justicia.'),
(3,'Susan Pevensie', 'Narnia', 55, 80, 65, 70, 75, 90, 85, 170, 60, 75, 'assets/cuerpo/susan.jpg', 'assets/batalla/susan.jpg', 'assets/busto/susan.jpg', 'Hábil arquera y la más sensata de los hermanos, combina gracia con pragmatismo en sus decisiones.'),
(4, 'Lucy Pevensie', 'Narnia', 45, 85, 60, 65, 80, 95, 70, 160, 50, 70, 'assets/cuerpo/lucy.jpg', 'assets/batalla/lucy.jpg', 'assets/busto/lucy.jpg', 'La más joven pero valiente, posee una fe inquebrantable en Aslan y gran conexión con Narnia.'),
(5, 'El Príncipe Caspian', 'Narnia', 70, 75, 75, 75, 75, 80, 65, 180, 78, 85, 'assets/cuerpo/caspian.jpg', 'assets/batalla/caspian.jpg', 'assets/busto/caspian.jpg', 'Heredero al trono que lucha para liberar Narnia, combinando nobleza con habilidades guerreras.'),

-- Los Pitufos
(6, 'Papá Pitufo', 'Los Pitufos', 10, 50, 15, 25, 30, 40, 15, 25, 5, 40, 'assets/cuerpo/papa_pitufo.jpg', 'assets/batalla/papa_pitufo.jpg', 'assets/busto/papa_pitufo.jpg', 'Sabio líder de los pitufos, siempre con soluciones y consejos para su aldea.'),
(7, 'Pitufo Fortachón', 'Los Pitufos', 20, 10, 20, 30, 25, 15, 10, 23, 5, 25, 'assets/cuerpo/fortachon.jpg', 'assets/batalla/fortachon.jpg', 'assets/busto/fortachon.jpg', 'El más fuerte físicamente, siempre listo para ayudar con trabajos pesados.'),
(8, 'Pitufina', 'Los Pitufos', 12, 30, 15, 35, 40, 50, 10, 22, 4, 30, 'assets/cuerpo/pitufina.jpg', 'assets/batalla/pitufina.jpg', 'assets/busto/pitufina.jpg', 'Única pitufo mujer, astuta y bondadosa que aporta equilibrio a la aldea.'),
(9, 'Pitufo Patoso', 'Los Pitufos', 4, 30, 8, 12, 2, 80, 6, 24, 4, 3, 'assets/cuerpo/patoso.jpg', 'assets/batalla/patoso.jpg', 'assets/busto/patoso.jpg', 'Torpe pero de gran corazón, sus errores suelen salvar situaciones inesperadas.'),

-- Star Wars
(10, 'Luke Skywalker', 'Star Wars', 80, 85, 75, 70, 75, 90, 60, 175, 75, 90, 'assets/cuerpo/luke.jpg', 'assets/batalla/luke.jpg', 'assets/busto/luke.jpg', 'Héroe que pasó de granjero a Jedi, símbolo de esperanza contra el Imperio.'),
(11, 'Darth Vader', 'Star Wars', 95, 70, 90, 60, 55, 85, 70, 202, 120, 100, 'assets/cuerpo/vader.jpg', 'assets/batalla/vader.jpg', 'assets/busto/vader.jpg', 'Temible lord Sith con un pasado trágico, dominado por la Fuerza Oscura.'),
(12, 'Yoda', 'Star Wars', 40, 100, 55, 50, 60, 80, 40, 66, 17, 110, 'assets/cuerpo/yoda.jpg', 'assets/batalla/yoda.jpg', 'assets/busto/yoda.jpg', 'Sabio maestro Jedi de 900 años, guía a otros con profunda filosofía.'),
(13, 'Princess Leia', 'Star Wars', 50, 80, 60, 75, 70, 95, 55, 165, 60, 80, 'assets/cuerpo/leia.jpg', 'assets/batalla/leia.jpg', 'assets/busto/leia.jpg', 'Líder rebelde valiente que combina diplomacia con acción en la lucha.'),
(14, 'Han Solo', 'Star Wars', 70, 75, 65, 85, 80, 90, 65, 180, 80, 85, 'assets/cuerpo/han.jpg', 'assets/batalla/han.jpg', 'assets/busto/han.jpg', 'Contrabandista carismático que se convierte en héroe de la Rebelión.'),

-- Marvel
(15, 'Iron Man', 'Marvel', 70, 100, 80, 85, 80, 95, 75, 193, 102, 100, 'assets/cuerpo/ironman.jpg', 'assets/batalla/ironman.jpg', 'assets/busto/ironman.jpg', 'Genio inventor cuya armadura lo convierte en superhéroe tecnológico.'),
(16, 'Thor', 'Marvel', 95, 85, 95, 80, 75, 85, 85, 195, 150, 110, 'assets/cuerpo/thor.jpg', 'assets/batalla/thor.jpg', 'assets/busto/thor.jpg', 'Dios nórdico del trueno que combina fuerza divina con noble corazón.'),
(17, 'Hulk', 'Marvel', 100, 50, 100, 50, 60, 70, 90, 244, 500, 110, 'assets/cuerpo/hulk.jpg', 'assets/batalla/hulk.jpg', 'assets/busto/hulk.jpg', 'Monstruo verde de fuerza ilimitada creado por radiación gamma.'),
(18, 'Capitán América', 'Marvel', 85, 70, 85, 85, 80, 90, 70, 190, 100, 95, 'assets/cuerpo/capitan.jpg', 'assets/batalla/capitan.jpg', 'assets/busto/capitan.jpg', 'Súper soldado símbolo de libertad con escudo indestructible.'),
(19, 'Spider-Man', 'Marvel', 65, 85, 70, 95, 95, 85, 60, 175, 75, 80, 'assets/cuerpo/spiderman.jpg', 'assets/batalla/spiderman.jpg', 'assets/busto/spiderman.jpg', 'Ágil héroe que balancea por NYC con sus telarañas y agudos sentidos.'),
(20, 'Venom', 'Marvel', 90, 60, 90, 85, 80, 75, 80, 210, 120, 100, 'assets/cuerpo/venom.jpg', 'assets/batalla/venom.jpg', 'assets/busto/venom.jpg', 'Simbiote alienígena que otorga poder pero corrompe a su huésped.'),
(21, 'Doctor Strange', 'Marvel', 50, 100, 70, 60, 65, 85, 40, 183, 80, 95, 'assets/cuerpo/doctorstrange.jpg', 'assets/batalla/doctorstrange.jpg', 'assets/busto/doctorstrange.jpg', 'Hechicero supremo que protege la realidad con artes místicas.'),
(22, 'Black Panther', 'Marvel', 85, 85, 85, 85, 85, 90, 75, 190, 80, 90, 'assets/cuerpo/blackpanther.jpg', 'assets/batalla/blackpanther.jpg', 'assets/busto/blackpanther.jpg', 'Rey de Wakanda con traje de vibranium y habilidades felinas.'),

-- DC
(23, 'Superman', 'DC', 100, 90, 100, 95, 85, 100, 90, 191, 105, 110, 'assets/cuerpo/superman.jpg', 'assets/batalla/superman.jpg', 'assets/busto/superman.jpg', 'El último hijo de Krypton, símbolo de esperanza con poderes sobrehumanos.'),
(24, 'Batman', 'DC', 70, 95, 80, 75, 85, 95, 60, 188, 95, 100, 'assets/cuerpo/batman.jpg', 'assets/batalla/batman.jpg', 'assets/busto/batman.jpg', 'Millonario que combate el crimen en Gotham con ingenio y tecnología.'),
(25, 'The Flash', 'DC', 50, 90, 60, 100, 100, 90, 50, 180, 80, 95, 'assets/cuerpo/flash.jpg', 'assets/batalla/flash.jpg', 'assets/busto/flash.jpg', 'Velocista que puede correr a la velocidad de la luz.'),
(26, 'Aquaman', 'DC', 95, 75, 90, 80, 85, 80, 90, 198, 100, 100, 'assets/cuerpo/aquaman.jpg', 'assets/batalla/aquaman.jpg', 'assets/busto/aquaman.jpg', 'Soberano de Atlantis que controla los océanos y sus criaturas.'),
(27, 'Green Lantern', 'DC', 75, 85, 80, 70, 75, 90, 80, 190, 85, 95, 'assets/cuerpo/greenlantern.jpg', 'assets/batalla/greenlantern.jpg', 'assets/busto/greenlantern.jpg', 'Portador de anillo que materializa sus pensamientos con energía.'),

-- Transformers
(28, 'Optimus Prime', 'Transformers', 95, 85, 95, 80, 70, 90, 100, 300, 250, 120, 'assets/cuerpo/optimus_prime.jpg', 'assets/batalla/optimusprime.jpg', 'assets/busto/optimus_prime.jpg', 'Noble líder Autobot que lucha por la libertad con honor.'),
(29, 'Megatron', 'Transformers', 100, 80, 95, 75, 70, 85, 90, 300, 270, 115, 'assets/cuerpo/megatron.jpg', 'assets/batalla/megatron.jpg', 'assets/busto/megatron.jpg', 'Despiadado líder Decepticon obsesionado con el poder absoluto.'),

-- El Señor de los Anillos
(30, 'Samwise Gamgee', 'El Señor de los Anillos', 60, 85, 85, 70, 65, 90, 75, 130, 60, 110, 'assets/cuerpo/samwise.jpg', 'assets/batalla/samwise.jpg', 'assets/busto/samwise.jpg', 'Leal jardinero cuyo coraje sostiene la misión del Anillo.'),
(31, 'Frodo Baggins', 'El Señor de los Anillos', 50, 75, 60, 80, 70, 95, 60, 120, 45, 100, 'assets/cuerpo/frodo_baggins.jpg', 'assets/batalla/frodo_baggins.jpg', 'assets/busto/frodo_baggins.jpg', 'Portador del Anillo que carga con el peso de la Tierra Media.'),
(32, 'Aragorn', 'El Señor de los Anillos', 95, 85, 95, 90, 85, 90, 100, 185, 80, 150, 'assets/cuerpo/aragorn.jpg', 'assets/batalla/aragorn.jpg', 'assets/busto/aragorn.jpg', 'Guerrero y legítimo heredero al trono de Gondor.'),
(33, 'Gandalf el gris', 'El Señor de los Anillos', 70, 90, 80, 60, 55, 95, 90, 180, 75, 140, 'assets/cuerpo/gandalf_gris.jpg', 'assets/batalla/gandalf_gris.jpg', 'assets/busto/gandalf_gris.jpg', 'Mago sabio que guía la Comunidad con conocimiento ancestral.'),
(34, 'Gandalf el blanco', 'El Señor de los Anillos', 75, 100, 80, 65, 55, 90, 90, 180, 75, 160, 'assets/cuerpo/gandalf_blanco.jpg', 'assets/batalla/gandalf_blanco.jpg', 'assets/busto/gandalf_blanco.jpg', 'Renacido con mayor poder para enfrentar a Sauron.'),
(35, 'Legolas', 'El Señor de los Anillos', 80, 85, 90, 95, 95, 90, 90, 180, 75, 130, 'assets/cuerpo/legolas.jpg', 'assets/batalla/legolas.jpg', 'assets/busto/legolas.jpg', 'Elfo arquero con puntería infalible y gracia sobrenatural.'),
(36, 'Gimli', 'El Señor de los Anillos', 95, 70, 90, 70, 65, 75, 80, 150, 85, 140, 'assets/cuerpo/gimli.jpg', 'assets/batalla/gimli.jpg', 'assets/busto/gimli.jpg', 'Enano guerrero cuya fuerza y lealtad no conocen límites.'),
(37, 'Sauron', 'El Señor de los Anillos', 95, 90, 100, 40, 30, 55, 100, 220, 5000, 160, 'assets/cuerpo/sauron.jpg', 'assets/batalla/sauron.jpg', 'assets/busto/sauron.jpg', 'Señor Oscuro que forjó el Anillo Único para dominar todo.'),

-- El Hobbit
(38, 'Bilbo Baggins', 'El Hobbit', 50, 90, 70, 80, 75, 95, 60, 120, 45, 100, 'assets/cuerpo/bilbo_baggins.jpg', 'assets/batalla/bilbo_baggins.jpg', 'assets/busto/bilbo_baggins.jpg', 'Hobbit que descubre coraje en una aventura inesperada.'),
(39, 'Thorin Oakenshield', 'El Hobbit', 95, 75, 90, 70, 60, 85, 85, 180, 90, 130, 'assets/cuerpo/thorin_oakenshield.jpg', 'assets/batalla/thorin_oakenshield.jpg', 'assets/busto/thorin_oakenshield.jpg', 'Orgulloso rey enano obsesionado con recuperar Erebor.')

ON CONFLICT (id) DO UPDATE SET nombre = EXCLUDED.nombre, saga = EXCLUDED.saga, fuerza = EXCLUDED.fuerza, inteligencia = EXCLUDED.inteligencia, resistencia = EXCLUDED.resistencia, velocidad = EXCLUDED.velocidad, agilidad = EXCLUDED.agilidad, carisma = EXCLUDED.carisma, alcance = EXCLUDED.alcance, altura = EXCLUDED.altura, peso = EXCLUDED.peso, experiencia = EXCLUDED.experiencia, imagen_cuerpo = EXCLUDED.imagen_cuerpo, imagen_batalla = EXCLUDED.imagen_batalla, imagen_busto = EXCLUDED.imagen_busto;


INSERT INTO usuario (id, nombre, email, contraseña, role)
VALUES
  (1, 'admin', 'admin@example.com', 'admin123', 'ADMIN'),
  (2, 'user', 'user@example.com', 'user123', 'USER')
ON CONFLICT (id) DO UPDATE SET
    nombre = EXCLUDED.nombre,
    email = EXCLUDED.email,
    contraseña = EXCLUDED.contraseña,
    role = EXCLUDED.role;
