
USE clinica_vidaplena;
SELECT
	COUNT(id_consulta) AS total_consultas_realizadas,
    SUM(valor) AS faturamento_total,
    AVG(valor) AS ticket_medio,
	MAX(valor) AS maior_valor,
    MIN(valor) AS menor_valor
FROM CONSULTA
	WHERE status != 'Agendada';    