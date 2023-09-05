use viagens;

select * from destinos;
select * from reservas;

select * from destinos
where id not in (select id_destino from reservas);

select * from usuarios
where id not in (select id_usuario from reservas);

select nome, (select count(*) from reservas where id_usuario = usuarios.id) as total_reservas from usuarios; 