CREATE DATABASE petAmigo;
USE petAmigo;


CREATE TABLE Cliente (

    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome_cliente VARCHAR(100) NOT NULL,
    cpf_clienhte CHAR(11)

);

CREATE TABLE Pet (

    id_pet INT AUTO_INCREMENT PRIMARY KEY,

        id_cliente INT NOT NULL,
        FOREIGN KEY (id_cliente) REFERENCES Cliente (id_cliente),


    nome_pet VARCHAR(50) NOT NULL,
    especie_pet VARCHAR(50) NOT NULL,
    raca_pet VARCHAR(50) NOT NULL

);


CREATE TABLE Veterinario(

    id_veterinario INT AUTO_INCREMENT PRIMARY KEY,
    nome_veterinario VARCHAR(100) NOT NULL,
    crmv_veterinario VARCHAR(10) NOT NULL UNIQUE,
    especialidade_veterinario VARCHAR (50) NOT NULL

);


CREATE TABLE Consulta (

    id_consulta INT AUTO_INCREMENT PRIMARY KEY,

    id_veterinario INT,
        FOREIGN KEY (id_veterinario) REFERENCES Veterinario(id_veterinario),

    id_pet INT,
        FOREIGN KEY (id_pet) REFERENCES Pet(id_pet),

    data_consulta DATE NOT NULL,
    preco FLOAT(5) NOT NULL,
    descricao_consulta TEXT NOT NULL

);


# Inserções/População das tabelas

INSERT INTO Cliente (nome_cliente, cpf_cliente) VALUES
    ("Ana Souza", "12312312312"),
    ("Carlos Pereira", "11122233344"),
    ("Maria Dias", "22233344455");

INSERT INTO Pet (id_cliente, nome_pet, especie_pet, raca_pet) VALUES
    ("1", "Jubileu", "Cachorro", "Pastor Alemão"),
    ("1", "Nylmar", "Cachorro", "Vira Lata"),
    ("2", "Nicolau", "Gato", "Ciames"),
    ("3", "Chapolim", "Gato", "Ciames");

INSERT INTO Veterinario 
    (nome_veterinario, crmv_veterinario, especialidade_veterinario)
    VALUES
    ("Dra. Roberta Vasconcelos", "CRMV-SP 5567", "Geral"),
    ("Dr. Roberto Carlos", "CRMV-SP 1234", "Cardiologista");

INSERT INTO Consulta 
    (id_pet, id_veterinario, data_consulta, preco, descricao_consulta)
    VALUES
    ("1", "1", "2026-10-01", "120", "Vacina Anual"),
    ("3", "1", "2026-10-02", "200", "Alergia na Pele"),
    ("2", "1", "2026-10-05", "80", "Vacina Anual"),
    ("4", "2", "2026-10-05", "300", "Eletro cardiograma"),
    ("1", "1", "2026-10-05", "50", "Exame de Sangue");

# QUESTÃO 1

SELECT * FROM Cliente;


# QUESTÃO 2

SELECT 
    nome, raca_pet
FROM Pet
    WHERE raca_pet = "Pastor Alemão";


# QUESTÃO 3

SELECT 
    * 
FROM Consulta
    WHERE preco > 100;


# Questão 4


SELECT
    p.nome_pet,
    c.nome_cliente
FROM Pet p
    INNER JOIN  Cliente c ON p.id_cliente = c.id_cliente;

