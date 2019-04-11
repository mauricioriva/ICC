
Práctica 2 Tipos primitivos y bits

Mauricio Riva Palacio Orozco 316666343

2.1
Para imprimir los bits de un número entero se usan 4 bytes(Int)/ 8 bytes(long).
Para poder imprimir un número doble(número decimal) se usa el comando Float que es equivalente a 4 bytes, y para imprimir los bits se usa Integer(Int) que es igual equivalente a 4 bytes.
Es lo mismo en el caso de double sólo que se usan el doble de bytes para ingresar y para imprimir, double son 8 bytes y long también son 8 bytes.

El número más grande positivo posible con 4 bytes es 2147483647 y usa 31 bits ya que el bit que falta se usa para el signo, y al sumarle 1 empieza a contar desde menos cero (-0) hasta el -2147483648 y es un número más por lo mismo de que usa el bit sobrante para añadirlo a la numeración y al usar los 32 bits ya sabe la máquina que es un número negativo. El máximo positivo en bits es 1111111111111111111111111111111 que son 31 unos, el cero a la izquierda no se escribe y representa los positivos, despues al sumarle uno llega a la cuenta de -0 que es 10000000000000000000000000000000
que son 31 ceros y un 1 indicando que los números que se empiecen a contar desde ahi son negativos.

2.3
En binario se ve 111101100 y en base 10 vale 492.

2.5
Para que todos tuvieran escritura usé el operador OR (|) con lo que valía permisos y puse 27 para que todos los bits dieran 1 y tuvieran acceso.

Ejercicio

1. 
La diferencia está en la cantidad de bits con la que es representado el número, cuando es con 4 bytes (int) entero todos los ceros a la izquierda del primer uno no aparecen por ser número entero, y lo mismo pasa con long que es de 8 bytes, con long son el doble de ceros a la izquierda del primer uno pero tampoco se ven, la consola no imprime ceros a la izquierda cuando hablamos de números enteros.

Pero cuando hablamos de numeros racionales, aparecen todos los bits sean utilizados o no, para que se pueda observar el signo y los decimales al igual que la potencia a la que se elevan los números.Float son 4 bytes, y double son el doble de bytes (8) por eso en double aparecen más bits de ambos lados al punto decimal (aparecen más del lado de la mantisa).

4.
El numero obtenido del corrimiento es 1111000, use originalmente el numero 15 en binario 1111.







