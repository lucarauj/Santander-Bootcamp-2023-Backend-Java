use viagens;

insert into usuarios (id, nome, email, data_nascimento, endereco) values (
	1,
	"Lucas Araujo",
	"lucas@hotmail.com",
	"1990-10-01",
	"Rua Ananinas - Arcos - MG"	
)

select * from usuarios;

insert into destinos (id, nome, descricao) values (
	1,
	"João Pessoa",
	"Férias de Setembro"
)

select * from destinos;
select * from destinos where nome LIKE "%João%";

insert into reservas (id, id_usuario, id_destino, status, data) values (
	1,
	1,
	1,
	'pendente',
	"2023-09-15"
)

select * from reservas;