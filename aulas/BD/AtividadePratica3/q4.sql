SELECT
	EM.nome AS especialidade,
	SUM(valor) AS faturamento_agosto
FROM CONSUlTA C
	INNER JOIN MEDICO M ON C.id_medico = M.id_medico
		INNER JOIN ESPECIALIDADE EM ON M.id_especialidade = EM.id_especialidade
	WHERE C.status = "Realizada" AND 
		C.data_hora BETWEEN '2026-08-01' AND '2026-08-31'
	GROUP BY EM.id_especialidade
    ORDER BY faturamento_agosto DESC;