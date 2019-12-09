# ResuelveFCSueldos
Sistema encargado de calcular el sueldo de cada jugador en resuelveFC.

**Prerrequisitos**
- JDK8
- Maven
- Jboss EAP 7.1

**Instalación del JDK 8**

- Descargamos el jdk, dirígete a [Java downloads](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).

- Podemos ejecutar el .exe y seguir los pasos o ejecutar el siguiente comando:

 > jdk-8u25-windows-x64.exe /s ADDLOCAL="ToolsFeature,SourceFeature,PublicjreFeature"

- Para verificar que ya está instalado, abrimos la consola de Windows (pulsas Windows + R y luego escribes cmd para ingresar a la consola de windows) y colocamos el siguiente comando:

>java –version
  
> **Nota** Nos debería de aparecer la versión del JDK que instalamos, en este caso estamos utilizando la versión 1.8.

**Instalación de Maven**
-	Descarga la última versión de Maven y descomprímela:

>Dirígete a [MAVEN](https://maven.apache.org/download.cgi)

>Para este ejemplo la he descargado y descomprimido en C:\maven\

-	Definir las variables de entorno

>Agregar Maven (\bin) a tu Path y crea una variable de entorno M2_HOME

>Abre las propiedades (System Properties) pulsando Windows + R y escribes sysdm.cpl

>Luego en la pestaña de "Opciones Avansadas" (Advanced) ingresas a "Variables de entorno" (Environment Variables) y agregar al Path C:\maven\apache-maven-3.6.3\bin (incluyendo la carpeta \bin)

>En la misma ventana agrega una nueva variable M2_HOME con la ruta donde dejaste maven, en en este ejemplo C:\maven\apache-maven-3.6.3\

>Asegurate que tengas JAVA_HOME bien definido en tus variables de entorno apuntando a tu java.

>Verifica si todo quedo bien con Maven, otra vez pulsas Windows + R y luego escribes cmd para ingresar a la consola de windows.

>En la consola comprueba con el siguiente comando, deberas de ver la c¿version del maven:

>>mvn –v

**Descargar [JBOSS EAP 7](https://developers.redhat.com/products/eap/download?sc_cid=701f2000000RmAJAA0&gclid=EAIaIQobChMIgraVpomf5gIVRb7ACh3t0gyxEAAYASAAEgIBF_D_BwE&gclsrc=aw.ds)**

- Buscamos la versión 7.1 y descargamos el Zip File, descomprime el archivo y coloca el servidor en la siguiente ruta:

> C:\server\

# Levantar el proyecto

- Una vez que dejamos listo nuestro ambiente iniciamos con el levantamiento del proyecto, primero descargamos el proyecto y lo ponemos en la siguiente ruta:

>C:\Ambiente\workspace\

- Después abrimos una consola (pulsas Windows + R y luego escribes cmd para ingresar a la consola de windows) y colocamos lo siguiente:

>cd C:\Ambiente\workspace\BackResuelveFC 

- Esto es para posicionarnos en la ruta de nuestro proyecto, después en la misma consola ejecutamos el siguiente comando:

>mvn -Dmaven.compiler.fork=true -Dmaven.compiler.executable="C:\Program Files\Java\jdk1.8.0_65\bin\javac" compile clean install

- Esto es para deployar nuestro proyecto, es necesario ver donde se instalo el JDK en tu maquina y poner la ruta en la variable Dmaven.compiler.executable=””, por lo regular siempre lo hace en el mismo lugar aunque si debe coincidir con la ruta que tú tienes.

- Al ejecutar el comando anterior nos crea un archivo WAR, este archivo lo tenemos que copiar en la ruta del servidor donde toma las aplicaciones que va a levantar, esto se hace con el siguiente comando:

>copy C:\Ambiente\workspace\BackResuelveFC\target\ResuelveFC.war C:\server\jboss-eap-7.1\standalone\deployments

- Revisa que la ruta de tu proyecto y la del Jboss coincidan con las que están en el comando.

- Ya que tenemos el archivo .war en la ruta del servidor, vamos a correr el servidor, abrimos otra consola y nos posicionamos en la ruta  C:\server\jboss-eap-7.1\bin, esto se hace con el siguiente comando:

>cd C:\server\jboss-eap-7.1\bin

- Estando en esta ruta ejecutamos el siguiente comando:

>standalone.bat

Listo, ya quedo levantado nuestro proyecto, hasta este punto ya tenemos nuestro webservice listo, podemos ejecutar el servicio con alguna aplicación para probar servicios SOAP o REST, en este caso utilizaremos Boomerang, esta herramientas la puedes descargar desde el Google Chrome:

-	Creamos un nuevo proyecto y lo nombramos

-	Le damos click al botón de Create a Service

-	Seleccionamos la pestaña de REST y nombramos nuestro servicio

-	En el combo donde están los métodos de petición seleccionamos POST

-	Colocamos la siguiente URL http://localhost:8080/ResuelveFC/servicio/calcularSueldo/

-	En la pestaña de request colocamos el siguiente JSON:

      { 
          "jugadores":[
          {        
             "nombre": "Juan",
             
             "nivel": "A",
             
             "goles": 12,
             
             "sueldo": 20000,
             
             "bono": 4000,
             
             "sueldo_completo": null,
             
             "equipo": "ResuelveFC"
             
        },
        
        {
        
             "nombre": "Pedro",
             
             "nivel": "B",
             
             "goles": 14,
             
             "sueldo": 30000,
             
             "bono": 6000,
             
             "sueldo_completo": null,
             
             "equipo": "ResuelveFC"
             
        },
        
        {
        
             "nombre": "Martín",
             
             "nivel": "C",
             
             "goles": 32,
             
             "sueldo": 40000,
             
             "bono": 8000,
             
             "sueldo_completo": null,
             
             "equipo": "ResuelveFC"
             
        },
        
        {
        
             "nombre": "Luis",
             
             "nivel": "Cuauch",
             
             "goles": 38,
             
             "sueldo": 50000,
             
             "bono": 10000,
             
             "sueldo_completo": null,
             
             "equipo": "ResuelveFC"
             
        }],"equipos":[
    
        {
        
             "equipo": "ResuelveFC",
             
             "tipoNiveles": [{
             
                   "nivel": "A",
                   
                   "golesXmes": 10
                   
                  },{
                  
                   "nivel": "B",
                   
                   "golesXmes": 20
                   
                  },{
                  
                   "nivel": "C",
                   
                   "golesXmes": 30
                   
                  },{
                  
                   "nivel": "Cuauch",
                   
                   "golesXmes": 40
                   
                  }
                  
             ]
             
        }]  }

-	Después le damos click en Send

## Hasta aquí ya podemos ver los resultados del cálculo de esta forma, si quieres ver el Front realizado para este servicio, puedes descargar el siguiente repositorio y seguir los pasos que aparecen en el README.md:
>https://github.com/ppzzmm/FrontResuelve




