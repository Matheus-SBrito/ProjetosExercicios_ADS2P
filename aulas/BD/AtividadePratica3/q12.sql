SELECT 
	C.data_hora,
    M.nome AS medico,
    EM.nome AS especialidade,
    C.observacoes
FROM CONSULTA C
	INNER JOIN MEDICO M ON C.id_medico = M.id_medico
		INNER JOIN ESPECIALIDADE EM ON M.id_especialidade = EM.id_especialidade
    WHERE C.observacoes LIKE "%retorno%" AND C.status = "Realizada"
    ORDER BY C.data_hora ASC;
    
    