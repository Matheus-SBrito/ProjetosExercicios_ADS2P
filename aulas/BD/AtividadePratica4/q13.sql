SELECT
	C.nome,
    P.id_pedido,
    P.valor_total,
    IFNULL(PG.status, "PENDENTE") AS status_pagamento
FROM CLIENTES C
	INNER JOIN PEDIDOS P ON
	C.id_cliente = P.id_cliente
    LEFT JOIN PAGAMENTOS PG ON
    P.id_pedido = PG.id_pedido
    WHERE PG.id_pedido IS NULL;