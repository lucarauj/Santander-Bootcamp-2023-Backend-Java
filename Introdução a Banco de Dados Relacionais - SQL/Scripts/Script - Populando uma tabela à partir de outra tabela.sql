use viagens;

create TABLE usuarios_nova (
	id int,
	nome varchar(255) not null comment 'Nome do usuário',
	email varchar(255) not null unique comment 'E-mail do usuário',
	endereco varchar(100) not null comment 'Endereço do usuário',
	data_nascimento date not null comment 'Data de nascimento do usuário'
	);
	
insert into usuarios_nova (id, nome, email, endereco, data_nascimento)
SELECT id, nome, email, endereco, data_nascimento
FROM usuarios;

select * from usuarios_nova;

drop table usuarios;

alter table usuarios_nova rename usuarios;

select * from usuarios;