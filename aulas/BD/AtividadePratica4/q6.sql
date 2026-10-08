SELECT
	P.id_pedido,
    P.valor_total,
    PG.status
FROM PEDIDOS P
	LEFT JOIN PAGAMENTOS PG ON
		P.id_pedido = PG.id_pedido;