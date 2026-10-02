SELECT
	AVG(valor) as valor_medio,
    EM.nome as especialidade
FROM CONSULTA C
	INNER JOIN MEDICO M ON C.id_medico = M.id_medico
		INNER JOIN ESPECIALIDADE EM ON M.id_especialidade = EM.id_especialidade
	GROUP BY EM.id_especialidade
    ORDER BY valor_medio DESC;
