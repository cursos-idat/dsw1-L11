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
  - Referencia: [Repo Desplegable en Render](https://github.com/texai/render-rest-saludo-L11)
  - Pasos:
    - Crear el proyecyo java https://start.spring.io/
    - Implementarlo segun la guía (CRTL-C CTRL-V de 2 archivos)
    - Dejar de ignorar el directorio target
    - Crear archivo Dockerfile (segun referencia)
    - mvnw clean package
    - Crear servicio web en render, vinculando su repositorio
    - Hacer pruebas: /saludo?name=Idat
- Partica (+5 en EC2 participacion)
  - Desplegar en render la implementación de la guia https://spring.io/guides/gs/accessing-data-mysql/ pero para Postrge
  - Referencia: Aplicacion desplegable en render: https://github.com/texai/render-rest-saludo-L11
  - Referencia: Aplicacion desplegable en render (con PG BD) https://github.com/texai/render-rest-saludo
  - Entregable: URL .onrender.com y URL del Repo
  - Tests:
    - GET url.onrender.com/saludo
    - GET url.onrender.com/saludo?name=Peru
    - GET url.onrender.com/demo/all
    - POST url.onrender.com/demo/add
   
## Semana 6

- GitHub CodeSpaces
  - Entorno de desarrollo cloud, nos evita configurar un entorno de desarrollo local, con posibles conflictos entre diferentes versiones de Java
  - 60 horas gratis al mes
  - Detalles: https://github.com/features/codespaces
  - Reporte de uso de Github CodeSpaces: https://github.com/settings/billing
  - Alternativa a Github Codespaces: https://gitpod.io/
  - Práctica CodeSpaces:
    - Crear un nuevo repo en Github (con un archivo README) https://github.com/new
    - Abrir el repositorio con CodeSpaces
      - Desde el repositorio
        - Clic al botón verde "Code"
        - Clic a la pestaña CodeSpaces
        - Clic al botón verde "Open in CodeSpace"
      - Otra manera de abrir nuestro repo en CodeSpaces: https://github.com/codespaces/new
    -  Crear un nuevo proyecto Java con la dependencia Spring Web: https://start.spring.io/
    -  Pasar los archivos generados hacia CodeSpaces
    -  Crear un nuevo Controller.java según ejemplo
    -  Instalar las extensiones: "Extension Pack for Java" y "Rest Client"
    -  Abrir el archivo Application.java
    -  Click en Run and Debug
    -  Hacer público el puerto (pestaña al costao de Terminal)
  - Práctica CodeSpaces + Render
    - Escribir un Dockerfile: https://github.com/texai/render-rest-saludo/blob/main/Dockerfile
    - Abrir el archivo .gitignore y borrar la linea que pone `target/`
    - Abrir el terminal y ejecutar el comando: `chmod +x mvnw`
    - Luego el comando: `./mvnw clean package`
    - [Source Control] Realizar el commit y luego push (Sync)
    - Crear una app web render
    - Vincular al repositorio
    - Probar ...onrender.com
  







