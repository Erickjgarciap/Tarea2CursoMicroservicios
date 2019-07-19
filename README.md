# Tarea2CursoMicroservicios
Tarea2 Microservicios

# Tarea 2

El proyecto consta de dos microservicios que disparan un evento y lanzan un mensaje hacia una cola que esta expuesta 
atraves de rabbitmq como lo vimos en clase.
El micro servicio usuario dispara un evento y tiene que mandar el mensaje a la cola, donde el micro servicio tarjeta 
recibe el mensaje de esa cola y dispara otro evento.

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



