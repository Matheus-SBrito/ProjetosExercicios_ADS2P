SELECT
	EM.nome AS especialidade,
    MAX(valor) AS maior_valor,
    MIN(valor) AS menor_valor
FROM CONSULTA C
	INNER JOIN MEDICO M ON C.id_medico = M.id_medico
		INNER JOIN ESPECIALIDADE EM ON M.id_especialidade = EM.id_especialidade
	GROUP BY EM.nome
    ORDER BY EM.nome DESC;