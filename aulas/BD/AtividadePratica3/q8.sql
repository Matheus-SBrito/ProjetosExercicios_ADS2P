SELECT
	P.nome AS paciente,
    P.telefone,
    C.nome as convenio,
    P.endereco
FROM PACIENTE P
	INNER JOIN CONVENIO C ON P.id_convenio = C.id_convenio
    WHERE P.endereco LIKE "%Aldeota%"
    ORDER BY P.nome ASC;