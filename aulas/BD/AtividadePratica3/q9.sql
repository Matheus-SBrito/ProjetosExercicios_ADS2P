SELECT
	M.nome AS medico,
    COUNT(C.id_consulta) AS consultas_canceladas,
    SUM(valor) AS receita_perdida
FROM CONSULTA C
	INNER JOIN MEDICO M ON C.id_medico = M.id_medico
    WHERE C.status = "Cancelada"
    GROUP BY M.nome
    ORDER BY receita_perdida DESC;    