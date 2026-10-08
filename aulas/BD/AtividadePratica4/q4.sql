SELECT
	P.id_pedido,
    P.valor_total,
    PG.forma_pagamento
FROM PEDIDOS P
	INNER JOIN PAGAMENTOS PG ON
    P.id_pedido = PG.id_pedido;