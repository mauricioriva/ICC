/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Scanner;

/**
 *
 * @author blackzafiro
 */
public class Demo extends Application {

	static int ren,col,M,G,opc;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Automata");
        //menu
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.BLACK);
        primaryStage.setScene(scene);
        
        Automata a = new Automata(root,ren,col,M,G);
        a.start();

        primaryStage.show();
    }
    
    public static int getInt(String mensaje){
    	boolean valido = true;
    	Scanner scn = new Scanner(System.in);
    	int i = 0;
    	System.out.println(mensaje);
    	
    	try{
    		i = scn.nextInt();
    	} catch(Exception e){
    		valido = false;
    	}

    	if (i < 1) {
    		valido = false;
    	}

    	if (valido) {
    		return i;
    	}else{
    		return getInt(mensaje);
    	}

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Modelo de propagación de epidemias.");

        opc = getInt("¿Quieres usar valores por defecto? (Si = 1 , No = 2)");

        if (opc == 2){

    	ren = getInt("Ingresa el numero de renglones.");
    	col = getInt("Ingresa el numero de columnas.");
    	M = getInt("Ingresa el valor umbral.");
        G = getInt("Ingresa el otro valor umbral.");

        } else{
            
            ren = 40;
            col = 40;
            M = 7;
            G = 5;
        }

    	System.out.println("ren: " + ren);
    	System.out.println("col: " + col);
    	System.out.println("M: " + M);
        System.out.println("G: " + G);

        launch(args);
    }
    
}
