# LegendsClash

TFG de Desarrollo de Aplicaciones Web por Santiago Alejandre Chaya


## Los programas necesarios para que funcione la app: 

### PostgreSQL

Se debe instalar PostgreSQL, una vez instalado abrir un servidor que se llame legends_clash con un usuario y contraseña postgre si es posible y comprobar el puerto en el que se ejecuta, servirá para más tarde. 

### IntelliJ

Después de clonar el repositorio, abrir la carpeta project en intellij

### Visual Studio Code

Arrastrar la carpeta completa del repositorio a VS code

## Iniciar la app:

### IntelliJ:

Copiar el application.propperties.sample en un nuevo archivo application.propperties. 

Se deben escribir tus propias variables.

Ejecutar 

```bash
mvn clean install
```

Ejecutar 

```bash
mvn spring-boot:run
```

### PostgreSQL:

Si no ha dado ningún error Spring Boot se puede comprobar la creación de las tablas. 

### VScode: 

Una vez en VScode debes comprobar que en api.service.ts y en user.service.ts está bien el puerto de API_URL que debe estar señalando a tu IntelliJ

Una vez todo está correcto:

```bash
cd legends-clash
```
```bash
npm install
```
```bash
ng serve --open
```