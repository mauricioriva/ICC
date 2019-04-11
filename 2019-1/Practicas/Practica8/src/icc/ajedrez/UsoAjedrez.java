package icc.ajedrez;

import java.util.Scanner;

//<------------------- INTERFAZ DE USUARIO PARA EL AJEDREZ ------------------>//

public class UsoAjedrez {
	private Scanner scanner;

//<----------------- CREA LA INTERFAZ DE USUARIO ---------------------------->//

    public UsoAjedrez() {
        scanner = new Scanner(System.in);
    }

//<---------------- PIDE UN ENTERO AL USUARIO ------------------------------->//

    private int leeEntero(String mensaje) {
        System.out.println(mensaje);
        boolean error = false;
        int num = -1;
        try {
            num = Integer.parseInt(scanner.nextLine());
            if (num <= 0) {
                error = true;
                System.out.println("El valor más chico posible es uno.");
            }
        } catch (NumberFormatException nfe) {
            error = true;
            System.out.println("Por favor ingresa un número válido.");
        }
        if (error) {
            num = leeEntero(mensaje);
        }
        return num;
    }

//<---------------- PIDE UN CARACTER AL USUARIO ----------------------------->//

    private char leeChar(String mensaje) {
        System.out.println(mensaje);
        boolean error = false;
        char num = 1;
        try {
            num = scanner.nextLine().charAt(0);
        } catch (NumberFormatException nfe) {
            error = true;
            System.out.println("Por favor ingresa un valor válido.");
        }
        if (error) {
            num = leeChar(mensaje);
        }
        return num;
    }

//<--------------------------- MENU PRINCIPAL ------------------------------->//

    private void imprimeMenu() {
        System.out.println("Opciones:");
        System.out.println("1) Escoger Reina");
        System.out.println("2) Escoger Caballo");
        System.out.println("3) Escoger Rey");
        System.out.println("4) Salir");
    }

//<--------------------------- MENU SECUNDARIO ------------------------------>//

    private void imprimePieza() {
        System.out.println("Opciones:");
        System.out.println("1) Validar Posicion");
        System.out.println("2) Lista de posiciones");
        System.out.println("3) Salir");
    }

//<----------------- METODO CON EL QUE FUNCIONA LA INTERFAZ ------------------//

    public void corre() {
        System.out.println("<--- Ajedrez --->");
        boolean continuar = true;
        int renglon;
        char columna;
        Pieza pieza;
        Rey rey = new Rey(6,'c');
        Reina reina = new Reina(4,'e');
        Caballo caballo = new Caballo(3,'d');
        int opc;
        boolean esValida;
        while(continuar) {
            imprimeMenu();
            int opcion = leeEntero("Selecciona una opción:");
            switch(opcion){
              case 1:
              case 2:
              case 3:
                if(opcion == 1){
                  pieza = reina;
                }else if(opcion == 2){
                  pieza = caballo;
                }else{
                  pieza = rey;
                }
                System.out.println(pieza.toString());
                imprimePieza();
                opc = leeEntero("Selecciona una opción:");
                switch(opc){
                  case 1:
                    renglon = leeEntero("Selecciona un renglon [1-8]");
                    columna = leeChar("Selecciona una columna [a-h]");
                    esValida = pieza.esValida(renglon,columna);
                    System.out.print("La posición nueva de la pieza ");
                    if(!esValida){
                      System.out.print("NO ");
                    }else{
                      pieza.setRenglon(renglon);
                      pieza.setColumna(columna);
                    }
                    System.out.println("es valida.");
                    break;
                  case 2:
                    System.out.println(pieza.posiblesMovimientos().toString());
                    break;
                  case 3:
                    System.out.println("Regresando al menu anterior.");
                    break;
                  default:
                    System.out.println("Opción invalida");
                    break;
                }
                break;
              case 4:
                continuar = false;
                break;
              default:
                    System.out.println("Esa no es una opción válida del menú.");
            }
        }
    }

//<--------------------------- METODO MAIN ---------------------------------->//

    public static void main(String[] args) {
        UsoAjedrez interfaz = new UsoAjedrez();
        interfaz.corre();
    }
}
