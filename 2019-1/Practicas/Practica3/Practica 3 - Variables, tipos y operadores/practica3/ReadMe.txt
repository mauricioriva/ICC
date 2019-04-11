
Practica 3 - Variables, tipos y operadores

Mauricio Riva Palacio Orozco 316666343

Pregunta 1
No se pude asignar un valor flotante a un entero, a menos de que se redonde el valor del flotante y después el valor se reestablezca como un entero, pero en un principio creo que no es posible debido a la manera en que se interpretan los bits de un entero a un flotante (el flotante es mucho más complejo).

Pregunta 2

a = 1
b = 2
c = 3

(a > 3 && ++a <=2) ? b++ : c--

Antes de compilar yo diría que a = 2, b = 2, y c = 3. Después de compilar me di cuenta que no era cierto por los prefijos ++ y sufijos ++, --,.

En el caso de a: ++a(significa se le va a sumar uno y ese valor se actualizara en la variable a) por lo tanto a = 2.
 a = 1 es menor que 3 por lo tanto es true; & ;  ++a(2) <= 2, entonce tambien es true por lo tanto se cumplen ambas y entonces la condición que tiene b no se modifica pero la condición de c sí, y su condición dice que se le debe de restar uno y por lo tanto se le resta y te queda c = 2.

Finalmente queda:
a = 1
b = 2
c = 2

