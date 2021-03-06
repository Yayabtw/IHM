// auteur : Claude Delannoy - Programmer en Java, éditions Eyrolles
package modele;
import java.io.*;

public class Clavier {

  public static String lireString() {
    String ligneLue = new String();
    try {
      InputStreamReader lecteur = new InputStreamReader(System.in);
      BufferedReader bufferEntree = new BufferedReader(lecteur);
      ligneLue = bufferEntree.readLine();
    } catch (IOException parExc) { // try
      System.exit(0);
    } // catch
    return ligneLue;
  } // lireString

  public static int lireInt() {
    int intLu = 0;
    try {
      String ligneLue = lireString();
      intLu = Integer.parseInt(ligneLue);
    } catch (NumberFormatException parExc) { // try
      System.err.println("Erreur dans la saisie");
      System.exit(0);
    } // catch
    return intLu;
  } // lireInt

  public static float lireFloat() {
    float floatLu = 0;
    try {
      String ligneLue = lireString();
      floatLu = Float.parseFloat(ligneLue);
    } catch (NumberFormatException parExc) { // try
      System.err.println("Erreur dans la saisie");
      System.exit(0);
    } // catch
    return floatLu;
  } // lireFloat
} // class Clavier
