
Práctica 12 Recursividad - Máquina de cambio

Mauricio Riva Palacio Orozco

No. Cuenta 316666343

Para poder correr el programa se debe de abrir una terminal y ubicarse dentro de la carpeta rivapalacioomauricio12 e ingresar el comando ]$ ant run

El programa hace lo siguiente:
Dada una cantidad entera cualquiera el programa te devuelve todas las posibilidades en las que se puede representar dicha cantidad en monedas de 10, 5, 2, y 1. La cantidad ingresada depende del poder de computo de la computadora a la que se ingrese por la RAM y disco duro, es más por la RAM.

Después de ingresar un número, la terminal te arroja la cantidad de iteraciones de hizo la computadora y la cantidad ingresada por el usuario, por el otro lado todas las posibilidades y la cantidad de elementos, que es lo que le importa al usuario saber, se guarda en un archivo con el formato (cantidad ingresada).txt dentro de la carpeta rivapalacioomauricio12.

Si desea también imprimir todas las posibilidades en la terminal(es muy probable que con números muy grandes ya no se pueda) debe de quitar la doble diagonal (//) (en la clase UsoMaquinaDeCambio.java) que se encuentra en la linea 65.

También tengo una versión del programa la cual usa LinkedList, es más eficiente y rápida, si quieren ver esta otra versión usando LinkedList mandar un correo a mauricioriva@ciencias.unam.mx

El algoritmo para calcular las posibilidades lo deduje de esta manera:

1. Cualquier cantidad entera se puede representar en monedas de 1, y las otras denominaciones cero, la cantidad máxima en monedas de uno es la cantidad ingresada.

2. Una vez obtenido el número en monedas de uno que resulta ser el mismo número, ahora a las monedas de 1, cada vez que le quites dos monedas de uno le sumas uno a las monedas de dos. Esto te va a dar todas las combinaciones posibles en monedas de 2 y de 1.

3. Una vez obtenido todas las posibilidades usando 2 y 1, ahora con la de 5, el primer caso es: del número total de monedas de 1, que es la cantidad en monedas de 1, restarle 5 y agregarle 1 a la denominación de monedas de 5, y hacer lo mismo que en el paso anterior sólo que ahora es con 5 monedas menos de denominación 1, y con esas 5 menos vuelves a calcular todas las posibles en monedas de dos y de uno.

4. Ahora se vuelve a hacer lo mismo al número total de monedas de denominación 1, que es la cantidad dada, se le restan 10, y a la denominación 5 se le agregan 2 y se repite el ciclo, en el que se vuelven a calcular todas las posibles en monedas de dos y de uno.

5. Se repite lo mismo hasta que la cantidad en monedas de 5 sea máxima, y ahora se hace con las de 10, todo el mismo proceso, partiendo de el caso en el que se representa en monedas de uno la cantidad que es el mismo número menos 10 y a la denominación de monedas de 10 le agregas 1.

6.Todo esto debe tener el límite con las monedas de 1, ya que a estas se le restan para que se usen las otras denominaciones, también tomar en cuenta que no se pueden usar números menores que cero en ningun momento, ya que la cantidad ingresada es positiva. Si el usuario llegara a ingresar un número negativo, simplemente no se crean posibilidades.

7.Un ejemplo sencillo sería con el número 12.

Inicio

[Coins of 10:0, Coins of 5:0, Coins of 2:0, Coins of 1:12]
[Coins of 10:0, Coins of 5:0, Coins of 2:1, Coins of 1:10] Aqui se aplica el paso 2.
[Coins of 10:0, Coins of 5:0, Coins of 2:2, Coins of 1:8]
[Coins of 10:0, Coins of 5:0, Coins of 2:3, Coins of 1:6]
[Coins of 10:0, Coins of 5:0, Coins of 2:4, Coins of 1:4]
[Coins of 10:0, Coins of 5:0, Coins of 2:5, Coins of 1:2]
[Coins of 10:0, Coins of 5:0, Coins of 2:6, Coins of 1:0]
[Coins of 10:0, Coins of 5:1, Coins of 2:0, Coins of 1:7] Aqui se aplica el paso 3.
[Coins of 10:0, Coins of 5:1, Coins of 2:1, Coins of 1:5]
[Coins of 10:0, Coins of 5:1, Coins of 2:2, Coins of 1:3]
[Coins of 10:0, Coins of 5:1, Coins of 2:3, Coins of 1:1]
[Coins of 10:0, Coins of 5:2, Coins of 2:0, Coins of 1:2] Aqui se aplica el paso 4.
[Coins of 10:0, Coins of 5:2, Coins of 2:1, Coins of 1:0]
[Coins of 10:1, Coins of 5:0, Coins of 2:0, Coins of 1:2]
[Coins of 10:1, Coins of 5:0, Coins of 2:1, Coins of 1:0]

Cantidad: 12
Elementos: 15

Fin

Aqui se ve como a las monedas de 1 se restan lo que necesitan las otras denominaciones con un respectivo orden, y partiendo de las monedas totales de 1, el primer caso (Coins of 1:12).

Una comprobación de que no te de números de más, denominaciones de más, etc. Es multiplicar cada denominacion de la moneda por su valor y sumar las 4 multiplicaciones y siempre en todas las posibilidades te debe salir el número ingresado.


