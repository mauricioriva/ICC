package mx.unam.ciencias.icc.red;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import mx.unam.ciencias.icc.BaseDeDatos;
import mx.unam.ciencias.icc.Lista;
import mx.unam.ciencias.icc.Registro;

/**
 * Clase abstracta para servidores de bases de datos genéricas.
 */
public abstract class ServidorBaseDeDatos<R extends Registro<R, ?>> {

    /* La base de datos. */
    private BaseDeDatos<R, ? extends Enum> bdd;
    /* El servidor de enchufes. */
    private ServerSocket servidor;
    /* El puerto. */
    private int puerto;
    /* El archivo donde cargar/guardar la base de datos. */
    private String archivo;
    /* Lista con las conexiones. */
    private Lista<ConexionServidor<R>> conexiones;
    /* Bandera de continuación. */
    private Boolean continuaEjecucion;
    /* Escuchas del servidor. */
    private Lista<EscuchaServidor> escuchas;

    /**
     * Crea un nuevo servidor usando el archivo recibido para poblar la base de
     * datos.
     * @param puerto el puerto dónde escuchar por conexiones.
     * @param archivo el archivo en el disco del cual cargar/guardar la base de
     *                datos. Puede ser <code>null</code>, en cuyo caso se usará
     *                el nombre por omisión <code>base-de-datos.bd</code>.
     * @throws IOException si ocurre un error de entrada o salida.
     */
    public ServidorBaseDeDatos(int puerto, String archivo)
        throws IOException {
        // Aquí va su código.
    }

    /**
     * Comienza a escuchar por conexiones de clientes.
     */
    public void sirve() {
        // Aquí va su código.
    }

    /**
     * Agrega un escucha de servidor.
     * @param escucha el escucha a agregar.
     */
    public void agregaEscucha(EscuchaServidor escucha) {
        // Aquí va su código.
    }

    /**
     * Limpia todos los escuchas del servidor.
     */
    public void limpiaEscuchas() {
        // Aquí va su código.
    }

    /* Carga la base de datos del disco duro. */
    private void carga() {
        // Aquí va su código.
    }

    /* Guarda la base de datos en el disco duro. */
    private void guarda() {
        // Aquí va su código.
    }

    /* Maneja los eventos de la conexión. */
    private void manejaEvento(Conexion<R> conexion, EventoConexion evento,
                              String mensaje) {
        ConexionServidor<R> cs = null;
        switch (evento) {
        case DESCONEXION:
            // Aquí va su código.
            break;
        case MODIFICACION:
            // Aquí va su código.
            break;
        case TERMINACION:
            // Aquí va su código.
            break;
        case ADVERTENCIA:
            // Aquí va su código.
            break;
        case ERROR:
            // Aquí va su código.
            break;
        }
    }

    /* Procesa los mensajes de todos los escuchas. */
    private void imprimeMensaje(String formato, Object ... argumentos) {
        for (EscuchaServidor escucha : escuchas)
            escucha.procesaMensaje(formato, argumentos);
    }

    /* Regresa la conexión como conexión servidor. */
    private ConexionServidor<R> getConexionServidor(Conexion<R> conexion) {
        @SuppressWarnings("unchecked") ConexionServidor<R> cs =
            (ConexionServidor<R>)conexion;
        return cs;
    }

    /**
     * Crea la base de datos concreta.
     * @return la base de datos concreta.
     */
    public abstract BaseDeDatos<R, ? extends Enum> creaBaseDeDatos();
}
