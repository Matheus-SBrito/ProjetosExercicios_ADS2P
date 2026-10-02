SELECT
	CP.nome AS convenio,
    COUNT(CP.nome) AS consultas_realizadas,
    SUM(C.valor) AS faturamento
FROM CONSULTA C
	INNER JOIN PACIENTE P ON C.id_paciente = P.id_paciente
		INNER JOIN CONVENIO CP ON P.id_convenio = CP.id_convenio
	WHERE CP.nome IN ("Unimed", "Hapvida") AND
		C.status =  "Realizada"
    GROUP BY CP.nome
    ORDER BY CP.nome DESC;