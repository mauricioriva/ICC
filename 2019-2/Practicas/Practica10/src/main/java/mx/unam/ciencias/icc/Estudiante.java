package mx.unam.ciencias.icc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Clase para representar estudiantes. Un estudiante tiene nombre, número de
 * cuenta, promedio y edad. La clase implementa {@link Registro}, por lo que
 * puede cargarse y guardarse utilizando objetos de las clases {@link
 * BufferedReader} y {@link BufferedWriter} como entrada y salida
 * respectivamente, además de determinar si sus campos cazan valores
 * arbitrarios y actualizarse con los valores de otro estudiante.
 */
public class Estudiante implements Registro<Estudiante, CampoEstudiante> {

    /* Nombre del estudiante. */
    private StringProperty nombre;
    /* Número de cuenta. */
    private IntegerProperty cuenta;
    /* Pormedio del estudiante. */
    private DoubleProperty promedio;
    /* Edad del estudiante.*/
    private IntegerProperty edad;

    /**
     * Define el estado inicial de un estudiante.
     * @param nombre el nombre del estudiante.
     * @param cuenta el número de cuenta del estudiante.
     * @param promedio el promedio del estudiante.
     * @param edad la edad del estudiante.
     */
    public Estudiante(String nombre,
                      int    cuenta,
                      double promedio,
                      int    edad) {
        this.nombre = new SimpleStringProperty(nombre);
        // Aquí va su código.
    }

    /**
     * Regresa el nombre del estudiante.
     * @return el nombre del estudiante.
     */
    public String getNombre() {
        return nombre.get();
    }

    /**
     * Define el nombre del estudiante.
     * @param nombre el nuevo nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    /**
     * Regresa la propiedad del nombre.
     * @return la propiedad del nombre.
     */
    public StringProperty nombreProperty() {
        return this.nombre;
    }

    /**
     * Regresa el número de cuenta del estudiante.
     * @return el número de cuenta del estudiante.
     */
    public int getCuenta() {
        // Aquí va su código.
    }

    /**
     * Define el número cuenta del estudiante.
     * @param cuenta el nuevo número de cuenta del estudiante.
     */
    public void setCuenta(int cuenta) {
        // Aquí va su código.
    }

    /**
     * Regresa la propiedad del número de cuenta.
     * @return la propiedad del número de cuenta.
     */
    public IntegerProperty cuentaProperty() {
        // Aquí va su código.
    }

    /**
     * Regresa el promedio del estudiante.
     * @return el promedio del estudiante.
     */
    public double getPromedio() {
        // Aquí va su código.
    }

    /**
     * Define el promedio del estudiante.
     * @param promedio el nuevo promedio del estudiante.
     */
    public void setPromedio(double promedio) {
        // Aquí va su código.
    }

    /**
     * Regresa la propiedad del promedio.
     * @return la propiedad del promedio.
     */
    public DoubleProperty promedioProperty() {
        // Aquí va su código.
    }

    /**
     * Regresa la edad del estudiante.
     * @return la edad del estudiante.
     */
    public int getEdad() {
        // Aquí va su código.
    }

    /**
     * Define la edad del estudiante.
     * @param edad la nueva edad del estudiante.
     */
    public void setEdad(int edad) {
        // Aquí va su código.
    }

    /**
     * Regresa la propiedad de la edad.
     * @return la propiedad de la edad.
     */
    public IntegerProperty edadProperty() {
        // Aquí va su código.
    }

    /**
     * Regresa una representación en cadena del estudiante.
     * @return una representación en cadena del estudiante.
     */
    @Override public String toString() {
        // Aquí va su código.
    }

    /**
     * Nos dice si el objeto recibido es un estudiante igual al que manda llamar
     * el método.
     * @param objeto el objeto con el que el estudiante se comparará.
     * @return <tt>true</tt> si el objeto o es un estudiante con las mismas
     *         propiedades que el objeto que manda llamar al método,
     *         <tt>false</tt> en otro caso.
     */
    @Override public boolean equals(Object objeto) {
        if (!(objeto instanceof Estudiante))
            return false;
        Estudiante estudiante = (Estudiante)objeto;
        // Aquí va su código.
    }

    /**
     * Guarda al estudiante en la salida recibida.
     * @param out la salida dónde hay que guardar al estudiante.
     * @throws IOException si un error de entrada/salida ocurre.
     */
    @Override public void guarda(BufferedWriter out) throws IOException {
        // Aquí va su código.
    }

    /**
     * Carga al estudiante de la entrada recibida.
     * @param in la entrada de dónde hay que cargar al estudiante.
     * @return <tt>true</tt> si el método carga un estudiante válido,
     *         <tt>false</tt> en otro caso.
     * @throws IOException si un error de entrada/salida ocurre, o si la entrada
     *         recibida no contiene a un estudiante.
     */
    @Override public boolean carga(BufferedReader in) throws IOException {
        // Aquí va su código.
    }

    /**
     * Nos dice si el estudiante caza el valor dado en el campo especificado.
     * @param campo el campo que hay que cazar.
     * @param valor el valor con el que debe cazar el campo del registro.
     * @return <tt>true</tt> si:
     *         <ul>
     *           <li><tt>campo</tt> es {@link CampoEstudiante#NOMBRE} y
     *              <tt>valor</tt> es instancia de {@link String} y es una
     *              subcadena del nombre del estudiante.</li>
     *           <li><tt>campo</tt> es {@link CampoEstudiante#CUENTA} y
     *              <tt>valor</tt> es instancia de {@link Integer} y su
     *              valor entero es mayor o igual a la cuenta del
     *              estudiante.</li>
     *           <li><tt>campo</tt> es {@link CampoEstudiante#PROMEDIO} y
     *              <tt>valor</tt> es instancia de {@link Double} y su
     *              valor doble es mayor o igual al promedio del
     *              estudiante.</li>
     *           <li><tt>campo</tt> es {@link CampoEstudiante#EDAD} y
     *              <tt>valor</tt> es instancia de {@link Integer} y su
     *              valor entero es mayor o igual a la edad del
     *              estudiante.</li>
     *         </ul>
     *         <tt>false</tt> en otro caso.
     * @throws IllegalArgumentException si el campo no es instancia de
     *         {@link CampoEstudiante}.
     */
    @Override public boolean caza(CampoEstudiante campo, Object valor) {
        // Aquí va su código.
    }

    /**
     * Actualiza los valores del estudiante con los del registro recibido.
     * @param estudiante el estudiante con el cual actualizar los valores.
     */
    @Override public void actualiza(Estudiante estudiante) {
        setNombre(estudiante.getNombre());
        // Aquí va su código.
    }
}
