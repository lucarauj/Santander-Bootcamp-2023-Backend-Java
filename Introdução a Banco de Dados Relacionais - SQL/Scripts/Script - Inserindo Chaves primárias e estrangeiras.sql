USE viagens;

alter TABLE usuarios
MODIFY COLUMN id int AUTO_INCREMENT,
ADD PRIMARY KEY (id);

alter TABLE destinos
MODIFY COLUMN id int AUTO_INCREMENT,
ADD PRIMARY KEY (id);

alter TABLE reservas
MODIFY COLUMN id int AUTO_INCREMENT,
ADD PRIMARY KEY (id);

alter TABLE reservas
ADD CONSTRAINT fk_reservas_usuarios
FOREIGN KEY(id_usuario) REFERENCES usuarios(id); 

alter TABLE reservas
ADD CONSTRAINT fk_reservas_destinos
FOREIGN KEY(id_destino) REFERENCES destinos(id); 