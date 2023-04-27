# Sistemas móviles y ubicuos
# Aplicación Room


### Fecha: 27/04/2023
### Autor: Cameo Pereira, Estela.
### Objetivo: Desarrollo de la aplicación Room.

## Introducción

El objetivo principal de esta aplicación es crear una aplicación de Android "Room" en la que se introduzcan nombre y apellidos de un cliente en la pantalla principal y esta información se irá listando en la parte de abajo de la pantalla en modo texto normal y, además, estos datos se almacenen en una base de datos. Se ha añadido la opción de poder vaciar la base de datos.
<br>

## Resumen

Para el desarrollo de esta aplicación creamos un proyecto con el IDE Android Studio utilizando como lenguaje Kotlin.
Al crear un proyecto de Kotlin en Android Studio, se genera la carpeta "app" y la carpeta "gradle". Cuando creamos el proyecto, el sistema crea "app" y la aplicación lanza una "activity" (pantalla).

- La carpeta "app" contiene el software relacionado con nuestra aplicación, donde incluiremos los archivos necesarios para que nuestra aplicación sea empaquetada. Dentro de esta carpeta, podemos acceder a otras. Por ejemplo en la carpeta manifests, podemos observar el archivo AndroidManifest.xml en que se declara todo aquello que realiza nuestra aplicación, así como si requiere unos permisos... En la carpeta res, podemos encontrar otras subcarpetas, como por ejemplo, layout que contiene el archivo activity_main.xml. Si accedemos a ese archivo y en la barra de herramientas del archivo en el margen superior derecho,hacemos clic en Split, aparece una representación de nuestra aplicación. Los layouts son unos contenedores y se utilizan para dar formato al diseño de nuestra aplicación introduciendo elementos como botones, textos...

- La carpeta "gradle" contiene un paquete de herramientas de compilación avanzadas, para automatizar y administrar el proceso de compilación y, al mismo tiempo, definir configuraciones de compilación personalizadas y flexibles.

## Desarrollo

Cuando se ejecute nuestra aplicación observaremos distintos elementos: el título de nuestra app "Room"; dos "EditText" para introducir el nombre y apellido del cliente; un botón para poder guardar los datos del cliente y listar dicha información debajo de los "EditText"; un "TextView" como título "Nombre y apellidos:" para indicar la región en la que aparecerán los datos guardados de los distintos clientes; y otro "TextView" para mostrar dichos datos de cada cliente. Además, observamos otro botón para poder eliminar la base de datos completa. De forma que. podemos ver que, al hacer click en dicho botón, se vacía: 

    - El TextView en el que se guardan los datos de los distintos clientes tras hacer click en el botón de "Añadir".
    - La tabla de datos de "App Inspection".

    Nota: hay que tener especial cuidado al hacer click en el botón de "Eliminar datos" ya que, sin darnos cuenta, podemos eliminar datos que no deseamos eliminar y ya no podemos recuperarlos.

Si giramos la orientación del dispositivo, podemos observar que se persistirá esta información y esto, lo realizamos utilizando View Model.

Además, para actualizar el campo de texto donde iremos listando el nombre y apellido de los clientes se utiliza Live Data.

Por último, para almacenar los datos de los distintos clientes en una base de datos utilizaremos Room.

## Directorios relevantes

- En el En el directorio java, en el fichero MainActivity.kt se han creado los procedimientos necesarios para el funcionamiento de la aplicación y los ficheros MainViewModel.kt, MainViewModelFactory.kt, NameSurname.kt, NameSurnameDao.kt, NameSurnameDatabase.kt y NameSurnameFragment.kt se han creado estructuras y procedimientos necesarios para poder utilizar View Model, Live Data, Binding y almacenar la información utilizando Room en nuestra aplicación.

- El directorio res contiene:

    - En directorio layout,  tenemos el activity_main.xml y el layout fragment_name_surname.xml en el que se han definido los distintos elementos para perfeccionar la vista de nuestra aplicacion cuando presenta orientación vertical y, el layout fragment_name_surname.xml (land) en el que se han definido los distintos elementos para perfeccionar la vista de nuestra aplicacion cuando presenta orientación horizontal.

    - En directorio values, y dentro de este, en directorio strings, tenemos el fichero strings.xml que contiene los textos con nombre único que se utilizan para acceder a ellos desde el código de la aplicación y, también encontramos el fichero strings.xml (con miniatura bandera de españa) que contiene los textos definidos en strings.xml pero traducidos al español. Esto es útil si un usuario desea cambiar el idioma del inglés al español.


## Pre-requisitos

-Android Studio.

-JDK (Java Development Kit).

-Un dispositivo Android.
<br>

## Procedimiento

Abrimos la aplicación Android Studio y creamos un nuevo proyecto. Para ello, en la barra de herramientas del margen superior izquierdo, hacemos clic en File, New, New Project. Se muestra una ventana para crear el nuevo proyecto, seleccionamos Empty Activity, asignamos el nombre "Room" a nuestra aplicación, elegimos la ruta donde se va a guardar el proyecto, utilizamos lenguaje Kotlin, y hacemos clic en Finish. Ya hemos generado nuestro proyecto.

Después, creamos el dispositivo. En la barra de herramientas del margen superior derecho, hacemos clic en Device Manager, en la pestaña de Virtual, clicamos en Create device. Se muestra una ventana para seleccionar el hardware, seleccionamos: Pixel 6 como definición del dispositivo, Oreo (API Level 27) como imagen del sistema (tiene que ser descargada), Portrait como orientación de inicio y clicamos en Finish. Ya tenemos nuestro dispositivo creado.
<br>

## Ejecución del proyecto

Para ejecutar el proyecto, en la herramienta de Device Manager, en la pestaña de Virtual clicamos el botón de play del dispositivo creado. Podemos observar que en la heramienta Emulator, aparece el dispositivo creado para poder probar sus funcionalidades. Después, ejecutamos la aplicación, clicando el botón de Run 'app'.