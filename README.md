ConexionJDBC

Ejemplo básico de conexión a MySQL utilizando JDBC en Java. Este proyecto permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en una tabla llamada `usuarios`.

Requisitos:

1. JDK 8 o superior.
2. MySQL Server configurado en el puerto 3307.
3. Driver JDBC para MySQL (mysql-connector-java).

Configuración de la base de datos:

Ejecuta estos comandos en MySQL:

CREATE DATABASE ecosoft_db;
USE ecosoft_db;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

INSERT INTO usuarios (nombre) VALUES ('cpinzon'), ('jrojas'), ('marcos');

Ejecución:

1. Asegúrate de que MySQL esté activo.
2. Configura tus credenciales en el archivo ConexionJDBC.java (usuario y contraseña).
3. Compila y ejecuta el archivo ConexionJDBC.java.

Funciones del código:

- Leer registros de la tabla `usuarios`.
- Insertar, actualizar y eliminar datos.

¡Listo para usar!
