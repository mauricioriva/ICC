
Pratica 1 Compilador
Mauricio Riva Palacio Orozco

1.2
Los archivos que estaban antes de compilar eran ClaseReloj.java, Reloj.java, TiempoSistema.java, UsoReloj.java, VistaReloj.java, VistaRelojAnalogico.java .
Y despues de compilar seguían todos mismos los archivos además de una versión con el mismo nombre de .class, además aparecieron 2 nuevos archivos que son  PanelDeReloj.class y VistaRelojAnalogico$1.class .

1.4
Cuando intento invocar la maquina virtual con un archivo .class que no sea UsoReloj me marca un error que no encuentra un método main en el archivo .class y que tengo que definir un método de tipo:
	public static void main(String[] args)
A diferencia del archivo UsoReloj todos los demás archivos .java no tienen definido un metodo main.

1.6
Al abrir el archivo index.html, se abre una pestaña en el navegador y parecen ser los archivos con los que estoy trabajando pero con una interfaz gráfica, además que incluye definiciones de los archivos que se tienen con terminación .java . El titulo de la pagina es Package icc.practica1 .

1.7 
Al intentar ejecuar el archivo Entrada.class me aparece un mensaje en rojo que dice que no se recibieron indicaciones.

Al ingresar el siguiente comando me aparece que estoy estableciendo 3 argumentos.
Argumento 0: arg1
Argumento 1: arg2
Argumento 2: arg3

1.8
Aparece que hay un error, que no puede acceder a jarfile arg1 
Error: Unable to access jarfile arg1

1.9
Y después de modificar el código, al ejecutar aparece este mensaje:
Faltan algunas indicaciones con los argumentos

Ya con el código modificado ahora sale esto:
Variable 0: arg1
Variable 1: arg2
Variable 2: arg3

1.10
El archvio build.xml de la carpeta entrada es mucho más largo que el que esta en la carpeta reloj. El atributo llamado depends en la carpeta entrada dice esto:
<target name="default" depends="clean,compile,dist"/>
y en la carpeta reloj dice:
<target name="run" depends="compile">
