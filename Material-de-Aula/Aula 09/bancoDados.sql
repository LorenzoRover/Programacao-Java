use jovem_programador;

create table pessoas(
	id int primary key auto_increment,
    nome varchar(50) not null,
    idade int,
    email varchar(50) not null
);

insert into pessoas(nome,idade,email)
	values("Fabio",25,"fabio@gmail.com");
    
insert into pessoas(nome,idade,email)
	values("Meg",21,"meg@gmail.com");
    
select * from pessoas;