# Desarrollo de Servicios Web 1

## Semana 1

- Presentación personal (xp pro, lenguajes, empresas)
- Presentación del curso
- Encuesta: Intro (conocimientos: Java, Spring o Spring Boot, HTML, git, Maven, Docker)
- Participación: ¿Que es un web service?, Ejemplos
- Guía Idat: Tema 1 - Arquitectura y Estándares / Sub Tema 1.1 ¿Qué es Web Services?
- SOAP vs Rest
- Guía Idat: Tema 1 - Arquitectura y Estándares / Sub Tema 1.2 Tipos de Web Services
- Intro: Request & Response (diagrama)
- Intro: Chrome DevTools
- Demo git
- Software Requerido:
  - Java JDK 17
    - <https://www.oracle.com/java/technologies/downloads/#jdk17-windows>
  - VS Code
    - <https://code.visualstudio.com/download>
  - VS Code ext: Rest Client
    - <https://marketplace.visualstudio.com/items?itemName=humao.rest-client>
  - VS Code ext: Extension Pack for Java
    - <https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack>
  - VS Code ext: Maven for Java
    - <https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-maven>
  - git
    - <https://git-scm.com/downloads>
- Creación de cuenta en GitHub.com
  - Link entre VS code y github:
    - Crear un directorio vacío
    - Abrir ese directorio con VS code
    - Ir a sección "source control" en vs code (barra de íconos lateral)
    - Clic en "Publish to github", seguir los pasos
  - Guia Guthub en consola: <https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account>

## Semana 2

- Guia Sprint: <https://spring.io/guides/gs/producing-web-service/>
- Guía Idat: Tema 2 - Servicios SOAP / Sub Tema 2.1 Primero llegó SOAP, luego REST
- [Github] Creción de Repo de clase: cursos-idat/dsw1-{id}
- Github key config
  - Demo
  - Ejercicios git: {repo}/alumnos/A123456-Ernesto-Anaya/correo.txt
- Diagrama de secuencia de mensajes: Requests y Responses
  - Diagrama de secuencia de mensajes: Caso Búsqueda y Asientos Redbus.pe
  - Tarea: Diagrama de secuencia de mensajes de caso a elección del alumno
- Guía Idat: Tema 2 - Servicios SOAP / Sub Tema 2.2 JAX/WS: (is Deprecated)
- Tarea: "Hola {nombre}" usando SOAP web service
  - Resolución
- Guia Sprint: <https://spring.io/guides/gs/consuming-web-service/>

## Semana 3

- Repaso ws soap paises
- Consumiento un servicio Soap
- EC1 EJ1: traductor de día del español al inglés
- Resolución del ejercicio del examen

## Semana 4

- Guia MySQL https://spring.io/guides/gs/accessing-data-mysql/
- EC1 EJ2: Implementar CRUD completo a entidad

## Semana 5
- Guia Rest: https://spring.io/guides/gs/rest-service/
- Ejecución de aplicación:
  - `mvnw clean package`
  - `java -jar target/*.jar`  
- Docker, Dockerfile, docker-compose
- render.com
  - simple rest
  - pg db
- Practica:
  - Ejecutar la [guia Rest](https://spring.io/guides/gs/rest-service/) y desplegarla en [render](https://render.com) 
  - Referencia: https://github.com/texai/render-rest-saludo
  - Pasos:
    - Crear el proyecyo java https://start.spring.io/
    - Implementarlo segun la guía (CRTL-C CTRL-V de 2 archivos)
    - Dejar de ignorar el directorio target
    - Crear archivo Dockerfile (segun referencia)
    - mvnw clean package
    - Crear servicio web en render, vinculando su repositorio
    - Hacer pruebas: /saludo?name=Idat
- StackOverflow survey
- GitHub Code Spaces
   
## Backlog

- .
