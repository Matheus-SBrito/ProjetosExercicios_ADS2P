SELECT
	P.nome AS paciente,
    COUNT(C.id_consulta) AS consultas_realizadas,
    SUM(C.valor) AS total_pago
FROM CONSULTA C 
	INNER JOIN PACIENTE P ON C.id_paciente = P.id_paciente
		INNER JOIN CONVENIO CP ON P.id_convenio = CP.id_convenio
	WHERE P.id_convenio IS NULL AND C.status = "Realizada"
    GROUP BY P.nome
    ORDER BY total_pago DESC;