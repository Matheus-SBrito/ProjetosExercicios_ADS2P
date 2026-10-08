SELECT
	C.nome,
    SUM(P.valor_total) AS total_gasto
FROM CLIENTES C
	INNER JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente
    GROUP BY C.nome
	ORDER BY total_gasto DESC;