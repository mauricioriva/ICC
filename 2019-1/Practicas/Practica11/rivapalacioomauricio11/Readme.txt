
Práctica 11 - Persistencia

Mauricio Riva Palacio Orozco

No. Cuenta 316666343

Para poder correr el programa se debe de abrir una terminal y ubicarse dentro de la carpeta rivapalacioomauricio11 e ingresar el comando $] ant run

El programa te permite guardar tantas bases de datos en archivos .txt como el disco duro tenga capacidad, puedes crear diferentes bases de datos, guardarlas en archivos diferentes, y puedes cargar cada una de ellas por separado, o incluso puedes cargar varios archivos y después guardar todo el contenido en un nuevo archivo.

Al agregar un registro en la parte de ingresar un telefono no debe ingresar más de 8 digitos, porque sino el programa se quiebra, y se borrará todo lo que no se haya guardado, incluyendo ese registro.

Una vez cargado, un archivo guardado anteriormente, se pueden hacer busquedas por nombre, direccion y telefono, se puede imprimir toda la base de datos que tengas cargada en el momento.

<---------------------------------------------------------------------------------->

Actividad 11.1
Revisa la documentación oficial de java.util.Scanner. ¿Qué es un objeto tipo
File?
En esta linea de código(obtenida de la documentacion official de java) dice que el scanner va a leer lo que haya en el archivo myNumbers y lo guardará en una variable de tipo scanner.

Scanner sc = new Scanner(new File("myNumbers"));

Un objeto de tipo file es lo que java guarda en una variable, de todo lo que leyó del archivo usando scanner.

<---------------------------------------------------------------------------------->

Actividad 11.2
Copia y ejecuta el código anterior. Para hacerlo más rápido que con ant, cópialo en un archivo DemoScanner.java e invoca al compilador escribiendo javac DemoScanner.java. El archivo .class se generará ahí mismo. Ejecútalo con java DemoScanner. Cambia la línea 18 para usar el método next() en lugar de nextLine(). ¿Qué hace ahora el programa?

La diferencia usando next() y nextLine(),es que next() lee todo lo que puede hasta encontrar el primer espacio, en el programa si tu ingresabas una frase con espacios te iba a separar cada palabra en una nueva linea por lo mismo de que lee poco a poco, debido a los espacio, en cambio si usas nextLine() esta función lee toda la cadena ingresada en la linea como una sola. Realmente son muy parecidos solo que una función al parecer usa el método substring() para ir separando cada vez que encuentra un espacio.

<---------------------------------------------------------------------------------->

PREGUNTAS

1. ¿Cómo preferirías que se llamara la interfaz Buscador para que su nombre fuera más acorde a todos los usos que le hemos dado? ¿Qué hay del método encuentra? Describe qué cambios sería necesario hacerle al código.

Le pondría como nombre Organizador, Apuntador, Retificador o algo parecido ya que la interfaz se asegura que lo objetos pasados como parametros son los correctos y para que se pueda trabajar con ellos. Los cambios sería simplemente en cambiar los nombres de las clases y los nombres de los objetos, pero en este caso si se está usando como buscador pero tiene multiples usos.




