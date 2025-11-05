# Kata Spring Data JPA

## Duración
1 hora aproximadamente 

## ¿Que se pide en esta kata?

Tienes que crear una tabla que se llame Movie, esta tabla debe ser creada mediante jpa y debe tener los siguientes
campos:

           _________________________________________
           
           | Nombre de columna  | Tipo de dato   |
           _________________________________________
           |id                  | Integer        |
           |title               | String         | 
           |genre               | Enum Generos*  |
           |year                | Integer        |
           |rate                | Float          |
           |sinopsis            | String         |
           _________________________________________

*este enum debe contener los siguientes valores:

    - ACTION
    - DRAMA
	- ADVENTURE
    - BIOGRAPHY
    - TERROR
    - SCIENCE_FICTION

A su vez, debes crear un repositorio mediante JPA y tienes que poder ejecutar las siguientes consultas devolviendo
entidades completas:

    - Búsqueda por Id
	- Búsqueda por título
	- Búsqueda por título o genero
    - Búsqueda por título y año
    - Búsqueda por valoración superior a
    - Búsqueda entre años
    - Búsqueda por todos los campos (No lo permite)

Debes devolver únicamente un campo:

    - Obtener el nombre de las películas entre los años 2002 y 2007
    - Obtener la valoración de una pelicula

## Recuerda

Sólo tienes que tener creado el repositorio, no tienes que crear ningún service, ni llegar a ejecutar estos métodos,
sólo tienes que declararlos

## Solución

La aplicación debe arrancar y no debes obtener ningún fallo las últimas lineas que tienes que ver en tu terminal son:

    2022-11-29 14:14:38.046  INFO 5872 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
    2022-11-29 14:14:38.074  INFO 5872 --- [           main] c.k.s.KataSpringDataJpaApplication       : Started KataSpringDataJpaApplication in 34.922 seconds (JVM running for 41.487)