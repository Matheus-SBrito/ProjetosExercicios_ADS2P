CREATE TABLE Departamento (

    codigo_departamento INT PRIMARY KEY,
    nome_departamento VARCHAR(50) NOT NULL,
    localizacao VARCHAR(50) NOT NULL,
    telefone_departamento VARCHAR(30)

)

CREATE TABLE Funcionario (

    matricula INT AUTO_INCREMENT PRIMARY KEY,
    codigo_departamento INT NOT NULL,
        FOREIGN KEY (codigo_departamento) REFERENCES Departamento (codigo_departamento),
    
    cpf INT(12) UNIQUE,
    nome_funcionario VARCHAR(100) NOT NULL,
    cargo VARCHAR(50) NOT NULL

)