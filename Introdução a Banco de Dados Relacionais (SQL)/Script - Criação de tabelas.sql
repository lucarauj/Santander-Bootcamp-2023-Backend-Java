use viagens;

create TABLE usuarios (
	id int,
	nome varchar(255) not null comment 'Nome do usuário',
	email varchar(100) not null unique comment 'E-mail do usuário',
	endereco varchar(50) not null comment 'Endereço do usuário',
	data_nascimento date not null comment 'Data de nascimento do usuário'
	);

create TABLE destinos (
	id int,
	nome varchar(255) not null unique,
	descricao varchar(255) not null
	);

create TABLE reservas (
	id int,
	id_usuario int,
	id_destino int,
	data date,
	status varchar(255) default 'pendente'
	);
	