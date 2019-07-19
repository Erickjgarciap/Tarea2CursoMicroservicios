# Tarea2CursoMicroservicios
Tarea2 Microservicios

# Tarea 2

El proyecto consta de dos microservicios que disparan un evento y lanzan un mensaje hacia una cola que esta expuesta 
atraves de rabbitmq como lo vimos en clase.
El micro servicio usuario dispara un evento y tiene que mandar el mensaje a la cola, donde el micro servicio tarjeta 
recibe el mensaje de esa cola y dispara otro evento.

# Tecnologias requeridas

- Es importante tener el rabbitmq arriba por que de lo contrario los mensajes de la cola no se enviaran y el procedimiento no se completa.

- Tener Nodejs instalado para ejecutar el front

- Maven instalado

# Compilar el proyecto!
Proyecto users:
  - Descargar el proyecto users en una ruta especifica, para ejecutarlo se realiza de la siguiente manera
  - 
  - Es importante levantar los dos microservicios ya que si uno no se levanta no se podran comunica.
  - El proyecto se compila asi
```sh
$ cd /ruta/users/
$ mvn clean package -DskipTests
```
- El proyecto se ejecuta asi, siempre en la misma ruta donde lo compilaste antes
```sh
$ java -jar target/users-0.0.1-SNAPSHOT.jar
```
Al final se levantara un servidor en el puerto 9093 para el proyecto employee

Proyecto tarjeta:
  - Descargar el proyecto tarjeta en una ruta especifica, para ejecutarlo se realiza de la siguiente manera
  - 
  - Es importante levantar los dos microservicios ya que si uno no se levanta no se podran comunica.
  - El proyecto se compila asi
```sh
$ cd /ruta/tarjeta/
$ mvn clean package -DskipTests
```
- El proyecto se ejecuta asi, siempre en la misma ruta donde lo compilaste antes
```sh
$ java -jar target/tarjeta-0.0.1-SNAPSHOT.jar
```
Al final se levantara un servidor en el puerto 9092 para el proyecto workstation


# Compilar el Front

Para compilar el front las tecnologias usadas son 
-Angularjs

Descargar el proyecto front y para compilarlo seria lo siguiente:

```sh
$ cd /rutadondelodescargaste/front/colas1
$ npm install
$ ng serve
```
Una vez que se acabe de instalar todo con el npm install se levantara un servidor del front con el comando ng serve.
la ruta del front es http://localhost:4200 como se muestra en la imagen

![alt text](https://github.com/Erickjgarciap/Tarea2CursoMicroservicios/blob/master/Captura%20de%20Pantalla%202019-07-19%20a%20la(s)%2017.21.39.png)

Despues de levantar los microservicios y el front se procede a rellenar el formulario y observar todo lo que pasa en la terminal de cada jar

![alt text](https://github.com/Erickjgarciap/Tarea2CursoMicroservicios/blob/master/Captura%20de%20Pantalla%202019-07-19%20a%20la(s)%2017.28.02.png)

Si se selecciona el checkbox se dispara el evento y reaccionan todas las colas, si no, solo se guarda en base de datos.


La siguiente tabla muestra rutas para poder obervar los datos guardados en la base de usuarios

| Nombre | ruta | Response|
| ------ | ------ |-----|
| Consulta usuarios |http://localhost:9093/users |lista de usuarios
| Consulta usuario id| http://localhost:9093/users{id} |usuarios





