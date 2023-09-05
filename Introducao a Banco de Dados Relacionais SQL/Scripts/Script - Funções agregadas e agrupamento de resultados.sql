use viagens;

select count(*) from usuarios
where id in (select id_usuario from reservas); 

select count(*) from usuarios
inner join reservas on usuarios.id = reservas.id_usuario; 

select count(*), id_destino from reservas
group by id_destino; 

select count(*) AS quantidade_reservas, id_destino from reservas
group by id_destino
order by quantidade_reservas desc;