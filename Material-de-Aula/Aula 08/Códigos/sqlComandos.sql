CREATE DATABASE jovem_programador;

USE jovem_programador;

UPDATE produtos SET quantidade=1 WHERE id=1;

CREATE TABLE produtos (
	id INT primary key auto_increment,
    nome varchar(50),
    marca varchar(50),
    preco decimal(10,2),
    quantidade INT,
    data Date,
    categoria varchar(50)
);

select * from produtos;

-- Atualizando produto
UPDATE produtos set marca = 'Positivo', preco = 1.99, quantidade = 9000 where id = 2;


