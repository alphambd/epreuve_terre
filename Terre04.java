public class Terre04 {
  public static void main(String[] args) {
      char c = args[0].charAt(0);
      int i = 0;  //variable pour récupérer l'indice de la lettre de départ
      String alphabet = "abcdefghijklmnopqrstuvwxyz";

      while(c != alphabet.charAt(i) && i<alphabet.length()){
        i++;
      }
      System.out.println(alphabet.substring(i,alphabet.length()));
  }
}
