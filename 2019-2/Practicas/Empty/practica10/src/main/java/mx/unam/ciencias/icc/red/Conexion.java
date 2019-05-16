package mx.unam.ciencias.icc.red;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import mx.unam.ciencias.icc.EventoBaseDeDatos;
import mx.unam.ciencias.icc.BaseDeDatos;
import mx.unam.ciencias.icc.Lista;
import mx.unam.ciencias.icc.Registro;

/**
 * Clase abstracta para las conexiones de la base de datos.
 */
public abstract class Conexion<R extends Registro<R, ?>> {

    /** La entrada de la conexión. */
    protected BufferedReader in;
    /** La salida de la conexión. */
    protected BufferedWriter out;
    /** La base de datos. */
    protected BaseDeDatos<R, ?> bdd;
    /** El mensaje. */
    protected Mensaje mensaje;
    /** El primer registro. */
    protected R registro1;
    /** El segundo registro. */
    protected R registro2;

    /* El enchufe. */
    private Socket enchufe;
    /* Lista de escuchas de conexión. */
    private Lista<EscuchaConexion<R>> escuchas;
    /* Si la conexión está activa. */
    private boolean activa;

    /**
     * Define el estado inicial de una nueva conexión.
     * @param bdd la base de datos.
     * @param enchufe el enchufe de la conexión ya establecida.
     * @throws IOException si ocurre un error de entrada o salida.
     */
    public Conexion(BaseDeDatos<R, ?> bdd, Socket enchufe) throws IOException {
        // Aquí va su código.
    }

    /**
     * Maneja los mensajes que recibe la conexión. El método no termina hasta
     * que la conexión sea cerrada. Al ir leyendo su entrada, la conexión
     * convertirá lo que lea en mensajes y manejará cada uno.
     */
    public void manejaMensajes() {
        // Aquí va su código.
    }

    /* Maneja un mensaje. */
    private void manejaMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
        registro1 = registro2 = null;
        switch (mensaje) {
        case BASE_DE_DATOS:
            manejaBaseDeDatos();
            break;
        case REGISTRO_AGREGADO:
            manejaRegistroAlterado();
            break;
        case REGISTRO_ELIMINADO:
            manejaRegistroAlterado();
            break;
        case REGISTRO_MODIFICADO:
            manejaRegistroModificado();
            break;
        case DESCONECTAR:
            manejaDesconectar();
            break;
        case DETENER_SERVICIO:
            manejaDetenerServicio();
            break;
        case ECO:
            manejaEco();
            break;
        case INVALIDO:
            manejaInvalido();
            break;
        }
    }

    /**
     * Maneja un mensaje {@link Mensaje#BASE_DE_DATOS}.
     */
    protected abstract void manejaBaseDeDatos();

    /**
     * Maneja los mensajes {@link Mensaje#REGISTRO_AGREGADO} y {@link
     * Mensaje#REGISTRO_MODIFICADO}.
     */
    protected void manejaRegistroAlterado() {
        // Aquí va su código.
    }

    /**
     * Maneja un mensaje {@link Mensaje#REGISTRO_MODIFICADO}.
     */
    protected void manejaRegistroModificado() {
        // Aquí va su código.
    }

    /**
     * Maneja un mensaje {@link Mensaje#DESCONECTAR}.
     */
    protected void manejaDesconectar() {
        // Aquí va su código.
    }

    /**
     * Maneja un mensaje {@link Mensaje#DETENER_SERVICIO}.
     */
    protected abstract void manejaDetenerServicio();

    /**
     * Maneja un mensaje {@link Mensaje#ECO}.
     */
    protected abstract void manejaEco();

    /**
     * Maneja un mensaje {@link Mensaje#INVALIDO}.
     */
    protected void manejaInvalido() {
        // Aquí va su código.
    }

    /**
     * Agrega el primer registro a la base de datos.
     */
    protected synchronized void agregaRegistro() {
        // Aquí va su código.
    }

    /**
     * Elimina el primer registro de la base de datos.
     */
    protected synchronized void eliminaRegistro() {
        // Aquí va su código.
    }

    /**
     * Modifica el primer registro con el segundo registro.
     */
    protected synchronized void modificaRegistro() {
        // Aquí va su código.
    }

    /* Recibe un registro de la entrada. */
    private R recibeRegistro() throws IOException {
        // Aquí va su código.
    }

    /**
     * Envía un mensaje de agregar o eliminar un registro.
     * @param mensaje el mensaje; {@link Mensaje#REGISTRO_AGREGADO} o {@link
     *        Mensaje#REGISTRO_ELIMINADO}.
     * @param registro el registro a agregar o eliminar de la base de datos.
     */
    protected void enviaAlteracionRegistro(Mensaje mensaje,
                                           R registro) {
        // Aquí va su código.
    }

    /**
     * Envía un mensaje de modificar un registro con otro.
     * @param registro1 el registro a modificar en la base de datos.
     * @param registro2 los nuevos valores del registro en la base de datos.
     */
    protected void enviaModificacionRegistro(R registro1, R registro2) {
        // Aquí va su código.
    }

    /**
     * Envía el mensaje de desconectar.
     */
    protected void enviaDesconectar() {
        // Aquí va su código.
    }

    /**
     * Nos dice si la conexión está activa.
     * @return <tt>true</tt> si la conexión está activa, <tt>false</tt> en otro
     *         caso.
     */
    public boolean activa() {
        // Aquí va su código.
    }

    /**
     * Regresa un número serial para cada conexión.
     * @return un número serial para cada conexión.
     */
    public abstract int getSerial();

    /**
     * Cierra la conexión.
     */
    public void desconecta() {
        // Aquí va su código.
    }

    /**
     * Agrega un escucha de conexión.
     * @param escucha el escucha a agregar.
     */
    public void agregaEscucha(EscuchaConexion<R> escucha) {
        // Aquí va su código.
    }

    /**
     * Regresa el último mensaje recibido.
     * @return el último mensaje recibido.
     * @throws IllegalStateException si no se ha recibido ningún mensaje.
     */
    public Mensaje getMensaje() {
        // Aquí va su código.
    }

    /**
     * Avisa a todos los escuchas de un evento.
     * @param evento el evento a avisar.
     * @param mensaje el mensaje asociado al evento.
     */
    protected void avisaEscuchas(EventoConexion evento, String mensaje) {
        // Aquí va su código.
    }
}
