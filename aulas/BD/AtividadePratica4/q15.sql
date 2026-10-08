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