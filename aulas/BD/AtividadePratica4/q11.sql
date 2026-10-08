SELECT
	C.nome,
    P.id_pedido,
    P.valor_total,
    PG.forma_pagamento
FROM CLIENTES C
	INNER JOIN PEDIDOS P ON
	C.id_cliente = P.id_cliente
    INNER JOIN PAGAMENTOS PG ON
    P.id_pedido = PG.id_pedido;