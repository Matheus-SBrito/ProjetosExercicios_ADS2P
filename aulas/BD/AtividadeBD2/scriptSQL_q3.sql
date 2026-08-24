CREATE SCHEMA atividade3;
USE atividade3;


CREATE TABLE Categoria (

    codigo_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR(50) NOT NULL,
    descricao TEXT
);

CREATE Table Produto (

    codigo_produto INT AUTO_INCREMENT PRIMARY KEY,
    codigo_categoria INT NOT NULL,
        FOREIGN KEY (codigo_categoria) REFERENCES Categoria(codigo_categoria),
    
    nome_produto VARCHAR(50) NOT NULL,
    preco FLOAT(12,4),
    estoque INT(3)
);


INSERT INTO Categoria 
	(
	nome_categoria, 
	descricao
    )
VALUES
	('Dispositivos de TI','Equipamentos de informatica em geral'),
    ('Moveis','Moveis de Construção em geral');
    
    
INSERT INTO Produto
	(
    codigo_categoria,
    nome_produto,
    preco,
    estoque
    )
VALUES
	('1', 'Monitor LG', '30', '10' ),
    ('2', 'Colchão de casal', '100', '20' );
    

SELECT 
	p.nome_produto,
    c.nome_categoria,
    c.descricao,
    p.preco,
    p.estoque
FROM 
	Produto p
    INNER JOIN Categoria c 
    ON c.codigo_categoria = p.codigo_categoria;