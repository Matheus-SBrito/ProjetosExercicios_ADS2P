SELECT 
	C.*
FROM CLIENTES C
	LEFT JOIN PEDIDOS P ON
    C.id_cliente = P.id_cliente
    WHERE P.id_cliente IS NULL;