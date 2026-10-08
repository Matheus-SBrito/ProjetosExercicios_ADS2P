SELECT
	C.cidade,
    COUNT(P.id_cliente) AS quantidade_pedidos
FROM CLIENTES C
	LEFT JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente
	GROUP BY C.cidade
    ORDER BY quantidade_pedidos DESC;