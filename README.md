# Challenge Foro Hub

## Descripción

ForumHub es una API RESTful para la gestión de foros, permitiendo la creación, listado, detalle, actualización y eliminación de tópicos. La API está protegida con autenticación JWT.

## Requisitos

- Java 17 o superior
- Maven
- MySQL

## Configuración

1. Clona el repositorio:
    ```sh
    git clone https://github.com/tu_usuario/forumhub.git
    cd forumhub
    ```

2. Configura la base de datos en `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/forumhub
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contrasena
    spring.jpa.hibernate.ddl-auto=update
    spring.flyway.enabled=true
    spring.flyway.locations=classpath:db/migration

    jwt.secret=tu_jwt_secreto
    jwt.expiration=86400000
    ```

3. Compila y ejecuta la aplicación:
    ```sh
    mvn spring-boot:run
    ```

4. Accede a la documentación Swagger en:
    ```
    http://localhost:8080/swagger-ui/
    ```

## Endpoints

- POST `/login` - Autenticación de usuario
- POST `/topicos` - Crear un nuevo tópico
- GET `/topicos` - Listar todos los tópicos
- GET `/topicos/{id}` - Obtener detalles de un tópico por ID
- PUT `/topicos/{id}` - Actualizar un tópico por ID
- DELETE `/topicos/{id}` - Eliminar un tópico por ID

## Autores

- Tu Nombre
- Colaborador 1
- Colaborador 2
