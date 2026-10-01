CREATE DATABASE atividade;
USE atividade;

CREATE TABLE Curso (
	
    id_curso INT AUTO_INCREMENT PRIMARY KEY,
    nome_curso VARCHAR(100) NOT NULL,
    carga_horaria VARCHAR(5) NOT NULL,
    nome_coordenador VARCHAR(100) NOT NULL

);

CREATE TABLE Aluno (
	matricula INT AUTO_INCREMENT PRIMARY KEY,
    nome_aluno VARCHAR(100) NOT NULL,
    email_aluno VARCHAR(100) NOT NULL,
    id_curso INT UNIQUE,
		FOREIGN KEY (id_curso) REFERENCES Curso(id_curso)
);

INSERT INTO Curso (nome_curso, carga_horaria, nome_coordenador)VALUES 
	("Matemática", "2000", "Jubileu"),
    ("ADS", "3000", "Nylmar");

SELECT * FROM curso;

INSERT INTO Aluno (nome_aluno, email_aluno, id_curso) VALUES
	("Vasconcelos", "vaco@gmail.com", "1"),
    ("Enzo", "enzo@gmail.com", "2")
;

SELECT * FROM aluno;

SELECT 
	a.matricula, 
	a.nome_aluno,
    c.nome_curso,
    c.nome_coordenador
FROM aluno a 
	INNER JOIN curso c 
    WHERE a.id_curso = 2 AND a.id_curso = c.id_curso;
