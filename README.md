#explicacion de lo realizado en este ejercicio de COD
**Primero realizamos el diagrama de clases y el de flujo**

***Diagrama de clases***

1. Los podemos hacer en papel o en el programa de drawio
2. En el diagrama de clases establecemos todas las clases que van a ser utilizadas en el programa
3. Dentro de las clases ponemos sus nombres, atributos con sus modificadores de acceso y lo mismo para los metodos
4. Si hay clases que heredan, como hice en el ejercicio, las señalamos con sus flechas indicando de que clase hereda
5. Lo metemos en su paquete correspondiente y le ponemos un nombre. Los nombres tiene que ser por convenio para mejor entendimiento
   
***Diagrama de flujo***

1. Los podemos hacer en papel o en el programa de drawio
2. tenemos que establecer un inicio e indicar como va a ser el funcionamiento
3. mostrar los bucles y demás funciones que vamos a utilizar, todo en flechas hacia abajo
4. mostramos en pantalla lo que precisamos

Una vez hicimos todo lo anterior, lo exportamos como png

**Nos vamos al IDE**

***realizamos el jar***

1. Nos vamos a file y luego a project structure
2. Luego nos vamos a artifacts y le damos al signo +
3. Indicamos el directiorio donde vamos a meter el jar y después aplicamos y aceptar
4. Después nos vamos a build y luego build artifacts
5. le damos a build y el jar está creado en la carpeta out con la extensión .jar

***etiquetamos el commit en el que hicimos el jar y hacemos push***

1. Creamos un repositorio en el que vamos a subir todo
2. git add a la carpeta out
3. ahora etiquetamos el commit
4. utilizamos el comando git tag -a v1.0(lo de la version es opcional, podemos poner lo que queramos) -m "nombre del commit"
5. git remote add origin y ponemos la url del directorio
6. git push a lo que queremos subir más las etiquetas

**Nos vamos a GitHub**

***Creamos la release***

1. Nos vamos al GitHub
2. Nos vamos a release y la cremos seleccionando la etiqueta correcta o la que haya
3. creamos la release

**Volvemos a repetir todo el proceso con todo lo explicado anteriormente**

1. hacemos una modificacion en el programa
2. build y rebuild para volver a ahcer el jar
3. volvemos a hacer el add, y una etiqueta al commit que vamos a subir
4. pusheamos todo con las etiquetas
5. volvemos al github y creamos una nueva release con la segunda version de la etiqueta




   

