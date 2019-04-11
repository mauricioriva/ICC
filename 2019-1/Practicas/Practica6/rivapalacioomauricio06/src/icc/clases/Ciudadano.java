package icc.clases;

public class Ciudadano{
//Aquí se declaran variables que se van a usar en todo el archivo Ciudadano
  String n;
  String p;
  String m;
  String f;
/*En esta parte se crean nuevas variables en la cual se les van a
  asignar subcadenas de las cadenas originales para obtener el RFC por partes
  y al final unir esas subcadenas para obtener el RFC
*/
  public String calculaRFC(){
    String nom = n.substring(0,1);
    String pat = p.substring(0,2);
    String mat = m.substring(0,1);
    String año = f.substring(8,10);
    String mes = f.substring(3,5);
    String dia = f.substring(0,2);
    String rfc = pat.toUpperCase() + mat + nom + año + mes + dia;
    return rfc;
  }
/*Aqui se les asignan datos a las variables ya declaradas, estos datos
  vienen desde el archivo UsoCiudadano que llama a un método Ciudadano
*/

  public Ciudadano(String nombre, String paterno, String materno, String fecha){
    this.n = nombre;
    this.p = paterno;
    this.m = materno;
    this.f = fecha;
  }
/*Aqui regresa los datos tal cual fueron ingresados además de agregarle
  el RFC que se calculó previamente.
*/
  public String toString(){
    return n + p + m + f + this.calculaRFC();

  }
}
