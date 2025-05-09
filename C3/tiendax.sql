CREATE TABLE productos (
    num_serie INT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    inventario VARCHAR(50) NOT NULL,
    PRIMARY KEY (num_serie)
   );

CREATE TABLE se_compone (
    num_serie INT NOT NULL,
    num_pedido INT NOT NULL,
    cantidad INT NOT NULL,
    PRIMARY KEY (num_serie, num_pedido),
    FOREIGN KEY (num_serie) REFERENCES productos (num_serie),
    FOREIGN KEY (num_pedido) REFERENCES ventas_compras (num_pedido)
);

