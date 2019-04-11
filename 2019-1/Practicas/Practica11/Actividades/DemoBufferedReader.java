import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader{

  public static void main(String[] args) {
    try{
      BufferedReader in = new BufferedReader(new FileReader("texto.txt"));
      String line;
      while((line = in.readLine()) != null) {
        System.out.println(line);
      }
      in.close();
    } catch (FileNotFoundException e) {
      System.err.println("\nNo se encontró el archivo texto.txt ¿Olvidaste crearlo?\n");
    } catch (IOException ioe) {
      System.err.println("\nError al leer el contenido de texto.txt\n");
    }
  }

}
