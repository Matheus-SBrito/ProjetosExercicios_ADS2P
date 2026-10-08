# 1)

SELECT
	C.nome,
    P.id_pedido,
    P.valor_total
FROM CLIENTES C
	INNER JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente;

# 2)

SELECT
	C.nome,
    C.cidade,
    P.id_pedido
FROM CLIENTES C
	LEFT JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente;

# 3)

SELECT
	P.id_pedido,
    P.valor_total,
    C.nome
FROM CLIENTES C
	RIGHT JOIN PEDIDOS P ON
    P.id_cliente = C.id_cliente;

# 4)

SELECT
	P.id_pedido,
    P.valor_total,
    PG.forma_pagamento
FROM PEDIDOS P
	INNER JOIN PAGAMENTOS PG ON
    P.id_pedido = PG.id_pedido;


# 5)

SELECT 
	C.*
FROM CLIENTES C
	LEFT JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente
    WHERE P.id_cliente IS NULL;


# 6)

SELECT
	P.id_pedido,
    P.valor_total,
    PG.status
FROM PEDIDOS P
	LEFT JOIN PAGAMENTOS PG ON
    P.id_pedido = PG.id_pedido;


# 7)

SELECT
	id_pedido,
    data_pedido,
    valor_total
FROM PEDIDOS P
	WHERE P.id_cliente IS NULL;


# 8)

SELECT
	C.nome,
    SUM(P.valor_total) AS total_gasto
FROM CLIENTES C
	INNER JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente
    GROUP BY C.nome
	ORDER BY total_gasto DESC;


# 9)

SELECT
	C.nome,
    SUM(P.valor_total) AS total_gasto
FROM CLIENTES C
	LEFT JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente
    GROUP BY C.nome
	ORDER BY total_gasto DESC;


# 10)

SELECT
	C.cidade,
    COUNT(P.id_cliente) AS quantidade_pedidos
FROM CLIENTES C
	LEFT JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente
	GROUP BY C.cidade
    ORDER BY quantidade_pedidos DESC;


# 11)

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


# 12)

SELECT
	C.nome,
    P.id_pedido,
    P.valor_total,
    PG.forma_pagamento
FROM CLIENTES C
	LEFT JOIN PEDIDOS P ON
	C.id_cliente = P.id_cliente
    LEFT JOIN PAGAMENTOS PG ON
    P.id_pedido = PG.id_pedido;

# 13)

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


# 14)

SELECT
	P.id_pedido,
    PG.forma_pagamento,
    IFNULL(C.nome, "Cliente Não Identificado") AS nome_cliente
FROM CLIENTES C
	RIGHT JOIN PEDIDOS P ON
	C.id_cliente = P.id_cliente
    INNER JOIN PAGAMENTOS PG ON
    P.id_pedido = PG.id_pedido;

# 15)

SELECT 
	C.nome,
    P.id_pedido,
    P.valor_total
FROM CLIENTES C
	LEFT JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente
    
UNION

SELECT 
	C.nome,
    P.id_pedido,
    P.valor_total
FROM CLIENTES C
	RIGHT JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente;