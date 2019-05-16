package mx.unam.ciencias.icc.red;

import java.io.IOException;
import java.net.Socket;
import mx.unam.ciencias.icc.BaseDeDatos;
import mx.unam.ciencias.icc.EscuchaBaseDeDatos;
import mx.unam.ciencias.icc.EventoBaseDeDatos;
import mx.unam.ciencias.icc.Registro;

/**
 * <p>Clase para las conexiones de clientes de la base de datos.</p>
 *
 * <p>Las conexiones de clientes agregan un escucha a la base de datos, para que
 * cuando el usuario modifique la base de datos, el mensaje correspondiente sea
 * automáticamente transmitido al servidor.</p>
 *
 * <p>El escucha evita que las modificaciones a la base de datos originadas en
 * el servidor sean transmitidas de regreso al mismo.</p>
 *
 * <p>Las conexiones de clientes manejan el mensaje {@link
 * Mensaje#BASE_DE_DATOS} cargando la base de datos de su entrada.</p>
 */
public class ConexionCliente<R extends Registro<R, ?>>
    extends Conexion<R> {

    /* Bandera para ignorar eventos. */
    private boolean ignorarEventos;
    /* El escucha de la base de datos. */
    private EscuchaBaseDeDatos<R> escucha;

    /**
     * Define el estado inicial de una nueva conexión de cliente. Además de
     * hacer lo mismo que {@link Conexion#Conexion}, agrega un escucha a la base
     * de datos para notificar al servidor de cambios hechos por el usuario.
     * También manda el mensaje de petición de la base de datos.
     * @param bdd la base de datos.
     * @param enchufe el enchufe de la conexión ya establecida.
     * @throws IOException si ocurre un error de entrada o salida.
     */
    public ConexionCliente(BaseDeDatos<R, ?> bdd,
                           Socket enchufe) throws IOException {
        // Aquí va su código.
    }

    /* Maneja los eventos de la base de datos. */
    private void manejaEventos(EventoBaseDeDatos evento,
                               R registro1, R registro2) {
        if (ignorarEventos)
            return;
        switch (evento) {
        case REGISTRO_AGREGADO:
            // Aquí va su código.
            break;
        case REGISTRO_ELIMINADO:
            // Aquí va su código.
            break;
        case REGISTRO_MODIFICADO:
            // Aquí va su código.
            break;
        }
    }
    
    /**
     * Agrega el primer registro a la base de datos, evitando que el escucha de
     * la base de datos notifique de nuevo al servidor del evento.
     */
    @Override protected synchronized void agregaRegistro() {
        // Aquí va su código.
    }

    /**
     * Elimina el primer registro de la base de datos, evitando que el escucha de
     * la base de datos notifique de nuevo al servidor del evento.
     */
    @Override protected synchronized void eliminaRegistro() {
        // Aquí va su código.
    }

    /**
     * Modifica el primer registro de la base de datos con el segundo registro,
     * evitando que el escucha de la base de datos notifique de nuevo al
     * servidor del evento.
     */
    @Override protected synchronized void modificaRegistro() {
        // Aquí va su código.
    }

    /**
     * Maneja un mensaje {@link Mensaje#BASE_DE_DATOS} para recibir la base de
     * datos, evitando que su escucha notifique de nuevo al servidor del evento.
     */
    @Override protected void manejaBaseDeDatos() {
        // Aquí va su código.
    }

    /**
     * Maneja un mensaje {@link Mensaje#DETENER_SERVICIO}.
     */
    @Override protected void manejaDetenerServicio() {
        /* El cliente no hace nada con este mensaje. */
    }

    /**
     * Maneja un mensaje {@link Mensaje#ECO}.
     */
    @Override protected void manejaEco() {
        /* El cliente no hace nada con este mensaje. */
    }

    /**
     * Regresa -1.
     * @return -1.
     */
    @Override public int getSerial() {
        return -1;
    }

    /**
     * Elimina el escucha de la base de datos y cierra la conexión.
     */
    @Override public void desconecta() {
        // Aquí va su código.
    }
}
