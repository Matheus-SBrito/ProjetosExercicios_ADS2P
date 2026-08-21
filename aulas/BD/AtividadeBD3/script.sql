#CREATE DATABASE emprestimos;
USE emprestimos;

CREATE TABLE Aluno (

    id_aluno INT AUTO_INCREMENT PRIMARY KEY,
    nome_aluno VARCHAR(100) NOT NULL,
    turma VARCHAR (100) NOT NULL
);

CREATE TABLE Livro (

    id_livro INT AUTO_INCREMENT PRIMARY KEY,
    titulo_livro VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL

);

CREATE TABLE Emprestimo (

    id_emprestimo INT  PRIMARY KEY,

        id_livro INT NOT NULL,
        FOREIGN KEY (id_livro) REFERENCES Livro(id_livro),

        id_aluno INT NOT NULL,
        FOREIGN KEY (id_aluno) REFERENCES Aluno(id_aluno),

    data_emprestimo DATE NOT NULL,
    data_devolucao DATE

);

INSERT INTO Aluno
    (
		id_aluno,
        nome_aluno,
        turma
    )
VALUES 
    (
    101,
    "Ana Souza",
    "1º Info "
    ),

    (
    102,
    "João Lima",
    "1º Info"
    ),

    (
    103,
    "Lucas Alves" ,
    "2º Info"
    ),

    (
    104,
    "Carla Mendes",
    "2º Info"
    );


INSERT INTO Livro
    (
    titulo_livro,
    autor
    )
VALUES
    (
    "Banco de Dados para Iniciantes",
    "Carlos Silva"
    ),

    (
    "Introdução à Programação",
    "Maria Santos"
    ),

    (
    "Sistemas Operacionais",
    "Pedro Costa"
    ),

    (
    "Redes de Computadores",
    "José Pereira"
    );


INSERT INTO Emprestimo
    (
    id_emprestimo,
    data_emprestimo,
    data_devolucao,
    id_aluno,
    id_livro
    )
VALUES
    (1,"2026-05-10","2026-08-20",101,1),
    (2,"2026-05-11","2026-08-21",102,2),
    (3,"2026-06-12",null,101,3),
    (4,"2026-06-13",null,103,1),
    (5,"2026-07-14","2026-08-24",104,4),
    (6,"2026-08-15",null,102,3);
    
SELECT * FROM Livros;
SELECT nome_aluno FROM Aluno;
SELECT * FROM Emprestimo;

SELECT
	Emprestimo.data_emprestimo,
    Livro.titulo_livro
FROM Emprestimo
	INNER JOIN Livro ON Emprestimo.id_livro = Livro.id_livro
    INNER JOIN Aluno ON Emprestimo.id_aluno = Aluno.id_aluno
    WHERE Aluno.nome_aluno = "Ana Souza";
	