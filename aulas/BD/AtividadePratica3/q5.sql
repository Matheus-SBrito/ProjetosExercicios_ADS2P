# QUESTÃO 5
SELECT
	C.data_hora,
    M.nome AS medico,
    EM.nome AS especialidade,
    C.valor,
    C.status
FROM CONSULTA C
	INNER JOIN MEDICO M ON C.id_medico = M.id_medico
		INNER JOIN ESPECIALIDADE EM ON M.id_especialidade = EM.id_especialidade
	WHERE EM.nome IN ("Pediatria", "Cardiologia") AND C.status = "Agendada"
    ORDER BY C.data_hora ASC;