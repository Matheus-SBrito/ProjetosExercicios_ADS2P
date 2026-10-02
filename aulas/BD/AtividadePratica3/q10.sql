SELECT
	C.data_hora,
    P.nome AS paciente,
    M.nome AS medico,
    C.valor
FROM CONSULTA C
	INNER JOIN MEDICO M ON C.id_medico = M.id_medico
    INNER JOIN PACIENTE P ON C.id_paciente = P.id_paciente
    WHERE C.valor BETWEEN 300 AND 350 AND
		C.status = "Realizada"
    ORDER BY C.valor DESC;