create database bd_tarea22;

use bd_tarea22;

create table clientes(
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(250) DEFAULT NULL,
    apellido varchar(250) DEFAULT NULL,
    direccion varchar(250) DEFAULT NULL,
    dni int(11) DEFAULT NULL,
    fecha date DEFAULT NULL,
    PRIMARY KEY (id)
);


create table videos (
    id int(11) NOT NULL AUTO_INCREMENT,
    title varchar(250) DEFAULT NULL,
    director varchar(250) DEFAULT NULL,
    cli_id int(11) DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT videos_fk FOREIGN KEY (cli_id) REFERENCES clientes(id)
);

