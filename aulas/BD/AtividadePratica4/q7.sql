SELECT
	id_pedido,
    data_pedido,
    valor_total
FROM PEDIDOS P
	WHERE P.id_cliente IS NULL;