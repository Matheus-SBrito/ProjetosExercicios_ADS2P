SELECT
	P.id_pedido,
    P.valor_total,
    C.nome
FROM CLIENTES C
	RIGHT JOIN PEDIDOS P ON
    P.id_cliente = C.id_cliente;