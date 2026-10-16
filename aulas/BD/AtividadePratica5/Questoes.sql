USE clinica_vidaplena;

# Questão 1

SELECT 
	nome, cpf
FROM Paciente
	WHERE id_convenio = (
		SELECT 
			id_convenio
		FROM convenio
        WHERE nome = "Unimed"
);


# Questão 2

SELECT 
	m.nome,
    m.crm
FROM medico m
	WHERE m.id_especialidade = (
		SELECT
			id_especialidade
		FROM especialidade
			WHERE nome = "Cardiologia"
);


# Questão 3

SELECT
	id_consulta,
    data_hora,
    valor
FROM consulta
	WHERE valor > (
		SELECT
			AVG(valor)
        FROM consulta
);

# Questão 4

SELECT
	id_consulta,
    data_hora,
    valor
FROM consulta
	WHERE valor = (
		SELECT
			MAX(valor)
        FROM consulta
);


# Questão 5

SELECT
	id_paciente,
    nome
FROM paciente
	WHERE id_paciente NOT IN (
        SELECT
			id_paciente
		FROM consulta
	);
    

# Questão 6

SELECT
	nome,
    crm
FROM medico
	WHERE id_medico NOT IN (
    SELECT
		id_medico
	FROM consulta
    );
    

# Quesão 7

SELECT
	nome
FROM especialidade
	WHERE id_especialidade NOT IN (
    SELECT
		id_especialidade
	FROM medico
    );
    
    
# Questão 8

SELECT
	nome,
	telefone
FROM convenio
	WHERE id_convenio NOT IN (
		SELECT
			id_convenio
		FROM paciente 
        WHERE id_convenio IS NOT NULL
);


# Questão 9

SELECT

	p.nome,
    (
		SELECT
			COUNT(*)
		FROM consulta c
			WHERE c.id_paciente = p.id_paciente
    ) AS quantidade_consulta
    
FROM paciente p;


# Questão 10

SELECT
	id_consulta,
    data_hora,
    valor,
    status
FROM consulta
	WHERE valor < (
		SELECT
			AVG(valor)
		FROM consulta
			WHERE status NOT IN ('Agendada', 'Cancelada')
);


# Questão 11

SELECT
	nome
FROM paciente p
	WHERE p.id_convenio = (
		SELECT 
			id_convenio
		FROM convenio
			WHERE id_convenio = 
            (SELECT id_convenio FROM paciente WHERE nome = 'Ana Beatriz Lima')
);


# Questão 12

SELECT
	c.data_hora,
    c.valor,
    c.status
FROM consulta c
	WHERE id_medico IN (
		SELECT
			id_medico
		FROM medico
			WHERE id_especialidade = 3
);


# Questão 13

SELECT
	nome,
    data_nascimento
FROM paciente
	WHERE data_nascimento > (
		SELECT
			MIN(data_nascimento)
		FROM paciente
)
ORDER BY data_nascimento ASC;


# Questão 14

SELECT
	nome,
    (
		SELECT
			COUNT(*)
		FROM consulta c
			WHERE c.id_medico = m.id_medico
    ) AS
    qtd_consultas

FROM medico;


# Questão 15

SELECT
	nome,
    data_nascimento
FROM paciente
WHERE data_nascimento = (
	SELECT
		MIN(data_nascimento)
	FROM paciente
);
