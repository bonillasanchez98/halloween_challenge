# Halloween Challenge Code
![Halloween Challenge Code](https://github.com/user-attachments/assets/63e63e24-40d2-42dc-9db3-b8477e2cbb86)

<p>
Este reto consiste en crear una API RESTful utilizando Java. La cual debe permitir la creación, lectura, actualización y eliminación de monstruos en una base de datos de criaturas.

Se uso una arquitectura por capas, donde en la capa de modelo solo se implementa una sola entidad en la cual recae toda la logica de negocio.
</p>

## Features
 Algunas de las caracteristicas del proyecto:
 - Incluye metodos CRUD para la gestion de los monstruos
 - Paginacion y ordenamiento ascendente segun el campo al que se quiere ordenar.
 - Desplegado en la plataforma https://render.com/
 - Documentacion con Swagger https://halloween-challenge.onrender.com/swagger-ui/index.html#/
  ### Endpoints features
  - ### Local
Ruta raiz para acceder a los recursos de manera local:
 http://localhost:8080/halloween-challenge
 **Metodos**
- **GET:** /monsters?pageNum=num&pageSize=num
- **GET BY ID:** /monster/{id}
- **POST:** /monster
- **PUT:** /upd-monster/{id}
- **DELETE:** /dlt-monster/{id}

** Endpoint para buscar un monstruo por su nombre como parametro: **
http://localhost:8080/halloween-challenge/monster?name={monsterName}

** Endpoint para buscar un monstro con parametros de paginacion y ordenamiento: ** 
http://localhost:8080/halloween-challenge/pag-and-sort/monsters?pageNum={num}&pageSize={num}&field={fieldName}
- #### Remoto
Ruta raiz para acceder a los recursos de manera remota:
https://halloween-challenge.onrender.com/halloween-challenge/
## Technologies
Las tecnologias usadas en este proyecto fueron:
 - Java 17
 - Spring Boot 3.3.5
 - Postgres 16
 - Swagger 2.3.0
 - Render
## Structure
![image](https://github.com/user-attachments/assets/e87ab774-7875-4636-b44a-9d8cdce643e2)

## Author
by
</br>
https://linkedin.com/in/josebonillasanchez
</br>
bonillasanchez98@gmail.com
