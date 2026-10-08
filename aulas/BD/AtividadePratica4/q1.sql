SELECT
	C.nome,
    P.id_pedido,
    P.valor_total
FROM CLIENTES C
	INNER JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente;