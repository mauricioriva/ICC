
Práctica 13 - Arreglos y Estadísticas

Mauricio Riva Palacio Orozco

No. Cuenta 316666343

Para poder correr el programa se debe de abrir una terminal y ubicarse dentro de la carpeta rivapalacioomauricio13 e ingresar el comando ]$ javac icc/estadisticas/*.java
y después el comando ]$ java icc.estadisticas.UsoEstadisticas nombre_del_archivo

El archivo que se desea cargar debe estar dentro de la carpeta rivapalacioomauricio13.

Comentario:
El arreglo podría ser null si aún no han llamado el método anterior ¿cómo debes resolver ese caso?. 

Si el documento ingresado está vacio, el compilador te lanza la excepción NumberFormatException el cual para resolver el caso sería con un try y catch con la excepcion, ademas de importar el java.lang.NumberFormatException, la excepción se lanza antes de poder entrar a alguno de los otros métodos por lo que se resuelve el problema si resulta null el arreglo.

Agregue algunos try and catch extras para que fuera más dificil corromper el programa.


