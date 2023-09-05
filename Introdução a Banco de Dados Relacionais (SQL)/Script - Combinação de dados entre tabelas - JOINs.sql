use viagens;

select * from usuarios;
select * from reservas;

select * from usuarios 
inner join reservas on usuarios.id = reservas.id_usuario;

select * from usuarios 
left join reservas on usuarios.id = reservas.id_usuario;

select * from usuarios 
right join reservas on usuarios.id = reservas.id_usuario;


comment 'O MariaDB não suporta a sintaxe FULL JOIN diretamente'

select * from usuarios 
full join reservas;

select * from usuarios
left join reservas ON usuarios.id = reservas.usuario_id
union all
select * from usuarios
right join reservas ON usuarios.id = reservas.usuario_id;
