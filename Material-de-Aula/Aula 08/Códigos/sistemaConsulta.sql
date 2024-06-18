-- Criando as tabelas pacientes, medicos e consultas

CREATE TABLE pacientes (
	id int primary key auto_increment,
    nome varchar(50),
    telefone  varchar(50)
);

CREATE TABLE medicos (
	id int primary key auto_increment,
    nome varchar(50),
    especialidade  varchar(50)
);

CREATE TABLE consultas (
	id int primary key auto_increment,
    data_consulta date,
    descricao  varchar(50),
    id_paciente int,
    id_medico int,
    foreign key (id_paciente) references pacientes(id),
    foreign key (id_medico) references medicos(id)    
);

-- Inserindo dados
insert into pacientes(nome,telefone) values ('Fabio','1111111');
insert into pacientes(nome,telefone) values ('Meg','222222');
insert into pacientes(nome,telefone) values ('Bob','333333');
insert into pacientes(nome,telefone) values ('Maria','444444');

insert into medicos(nome,especialidade) values ('Alberto','Pediatra');
insert into medicos(nome,especialidade) values ('Vicente','Clinico Geral');
insert into medicos(nome,especialidade) values ('Maria Tereza','Clinica Geral');
insert into medicos(nome,especialidade) values ('Michele','Ortopedia');

insert into consultas(data_consulta, descricao,id_paciente, id_medico )
 values ('2024-06-04','Rotina',1,2); 
 insert into consultas(data_consulta, descricao,id_paciente, id_medico )
 values ('2024-06-04','Rotina',3,4);
 
 select * from consultas 
 inner join pacientes on consultas.id_paciente = pacientes.id 
 inner join medicos on consultas.id_medico = medicos.id;
 
 
select consultas.id as 'id da consulta', pacientes.nome as 'Nome paciente', medicos.nome as 'nome do médico'
 from consultas 
 inner join pacientes on consultas.id_paciente = pacientes.id 
 inner join medicos on consultas.id_medico = medicos.id;




