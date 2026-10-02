# Questão 2

USE clinica_vidaplena;
SELECT
	COUNT(C.id_medico) AS consultas_realizadas,
    SUM(C.valor) AS faturamento,
	M.id_medico, M.nome AS medico
FROM CONSULTA C
	INNER JOIN MEDICO M ON C.id_medico = M.id_medico
    WHERE C.status != "Agendada"
    GROUP BY C.id_medico
    ORDER BY faturamento DESC;
