
-- insertar clientes a la tabla clientes
INSERT INTO clientes(nombre, direccion, telefono)
VALUES ('Javier', 'Avenida Alemania 01420', '+569 88776655'),
		('Martina', 'Pasaje Prat 732', '+569 55443322'),
		('Benjamin', 'Avenida Javiera Carrera 1530', '+569 99112233'),
		('Florencia', 'Manuel Montt 980', '+569 54277889'),
		('Fernanda', 'Prieto Norte 345', '+569 48345200'),
		('Felipe', 'Avenida Balmaceda 116', '+569 93520015'),
		('Jaime', 'Pasaje Las Rosas 356', '+569 37002710');
        
-- insertar pedidos a la tabla pedidos       
INSERT INTO pedidos(fecha, total, clientes_id_cliente)
VALUES ('2026-05-02', 18990, 1),
	   ('2026-04-15', 42500, 5),
       ('2026-04-28', 65200, 2),
       ('2026-05-26', 120000, 7),
       ('2026-05-19', 29950, 5),
       ('2026-06-09', 34700, 3),
       ('2026-03-08', 80000, 2),
       ('2026-06-30', 29990, 5),
       ('2026-06-05', 55720, 4),      
       ('2026-03-28', 75890, 3),
       ('2026-03-25', 55990, 4),
       ('2026-03-30', 45680, 6),
       ('2026-06-10', 32720, 1),      
       ('2026-03-28', 102890, 3),
       ('2026-05-02', 10990, 5);


 -- proyectar clientes con sus pedidos
SELECT clientes.nombre, pedidos.*
FROM clientes JOIN pedidos
	ON clientes.id_cliente = pedidos.clientes_id_cliente;

-- proyectar pedidos de un cliente por su id   
SELECT pedidos.*, clientes.nombre
From pedidos JOIN clientes
	ON pedidos.clientes_id_cliente = clientes.id_cliente
WHERE clientes.id_cliente = 5;

-- calcular el total de todos los pedidos para cada cliente
SELECT clientes.nombre, SUM(total) AS total_cliente
FROM clientes LEFT JOIN pedidos ON clientes.id_cliente = pedidos.clientes_id_cliente
GROUP BY clientes.nombre;

-- Elimina un cliente específico de la tabla «clientes» y todos sus pedidos asociados de la tabla «pedidos».
DELETE pedidos, clientes
FROM pedidos JOIN clientes
	ON pedidos.clientes_id_cliente = clientes.id_cliente
WHERE clientes.id_cliente = 6;

-- Proyecta los tres clientes que han realizado más pedidos, ordenados de forma descendente por el número de pedidos
SELECT clientes.nombre, COUNT(*) AS total_pedidos
FROM clientes JOIN pedidos 
	ON clientes.id_cliente = pedidos.clientes_id_cliente
GROUP BY clientes.nombre
ORDER BY total_pedidos DESC
LIMIT 3;

SELECT * FROM pedidos;
SELECT * FROM clientes;