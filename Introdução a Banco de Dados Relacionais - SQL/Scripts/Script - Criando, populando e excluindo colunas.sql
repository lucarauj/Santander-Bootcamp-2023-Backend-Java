USE viagens;

select * from usuarios;

alter table usuarios 
add rua varchar(100),
add numero varchar(10),
add cidade varchar(50),
add estado varchar(20);

update usuarios 
set rua = substring_index(substring_index(endereco, '-', 1), '-', -1),
	cidade = substring_index(substring_index(endereco, '-', 2), '-', -1),
	estado = substring_index(endereco, '-', -1);
	
update usuarios set numero = "100" where id = 1;
update usuarios set numero = "200" where id = 2;

drop table usuarios column endereco;

alter table usuarios drop column endereco;