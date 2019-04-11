/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package sistemasolar;

import javafx.*;

import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.image.Image;
import javafx.scene.image.*;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Sphere;

/**
 * Clase que representa a todos los astros alrededor de los cuales pueden girar
 * otros astros.
 * @author blackzafiro
 */
public class Astro {
	
	/**
	 * Panel sobre el cual se dibuja este astro y sus satélites.
	 */
	protected Pane nodo;

	/**
	 * Figura que representa a este astro.
	 */
	protected Sphere figura;
	
	/**
	 * Constructor.
	 * @param diametro Pixeles de diámetro.
	 */
	public Astro(double diametro) {
		nodo = new StackPane();

		nodo.setMaxSize(100, 100);

		figura = new Sphere(diametro);
		PhongMaterial material = new PhongMaterial();

		if(diametro == 50){
			material.setDiffuseMap(new Image("file:src/imagenes/sol.jpeg",  0, 100, false, false));
		}

		if(diametro == 12){
			material.setDiffuseMap(new Image("file:src/imagenes/tierra.jpeg",  0, 100, false, false));
		}

		if(diametro == 4){
			material.setDiffuseMap(new Image("file:src/imagenes/mercurio.jpeg",  0, 100, false, false));
		}

		if(diametro == 11){
			material.setDiffuseMap(new Image("file:src/imagenes/venus.jpeg",  0, 100, false, false));
		}

		if(diametro == 30){
			material.setDiffuseMap(new Image("file:src/imagenes/jupiter.jpeg",  0, 100, false, false));
		}

		if(diametro == 6){
			material.setDiffuseMap(new Image("file:src/imagenes/marte.jpeg",  0, 100, false, false));
		}

		if(diametro == 25){
			material.setDiffuseMap(new Image("file:src/imagenes/saturno.jpeg",  0, 100, false, false));
		}

		if(diametro == 21){
			material.setDiffuseMap(new Image("file:src/imagenes/urano.jpeg",  0, 100, false, false));
		}

		if(diametro == 20){
			material.setDiffuseMap(new Image("file:src/imagenes/neptuno.jpeg",  0, 100, false, false));
		}

		if(diametro == 5){
			material.setDiffuseMap(new Image("file:src/imagenes/pluton.jpg",  0, 100, false, false));
		}		

		/*PhongMaterial material = new PhongMaterial();
		material.setDiffuseMap(new Image("file:Background.jpeg",  0, 100, false, false));
		material.setDiffuseMap(new Image("file:Background.jpeg"));
		figura.setMaterial(material);
		*/

		figura.setMaterial(material);

		nodo.getChildren().add(figura);
	}
	
	/**
	 * Devuelve al panel sobre el cual se dibujará este astro y sus satélites.
	 * @return nodo
	 */
	public Pane getNodo() {
		return nodo;
	}
	
	/**
	 * Devuelve el nodo figura que dibuja a este astro.
	 * Sus coordenadas son relativas al panel que la contiene.
	 * @return 
	 */
	public Node getFigura() {
		return figura;
	}
	
}
