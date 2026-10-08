SELECT
	C.nome,
    C.cidade,
    P.id_pedido
FROM CLIENTES C
	LEFT JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente;