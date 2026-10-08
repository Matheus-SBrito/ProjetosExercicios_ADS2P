SELECT
	P.id_pedido,
    PG.forma_pagamento,
    IFNULL(C.nome, "Cliente Não Identificado") AS nome_cliente
FROM CLIENTES C
	RIGHT JOIN PEDIDOS P ON
	C.id_cliente = P.id_cliente
    INNER JOIN PAGAMENTOS PG ON
    P.id_pedido = PG.id_pedido;