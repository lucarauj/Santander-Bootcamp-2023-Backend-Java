use viagens;

select * from usuarios;

explain
select * from usuarios where nome = "Lucas Araujo";

create index idx_nome on usuarios (nome);

drop index idx_nome on usuarios;