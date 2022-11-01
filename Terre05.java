
public class Terre05 {

  public static void main(String[] args) {
    String entree = args[0];
    try {
      Integer.parseInt(entree);
      if ((Integer.parseInt(entree) % 2) == 0) {
        System.out.println("pair");
      }
      else if ((Integer.parseInt(entree) % 2) == 1) {
        System.out.println("impair");
      }
    }
    catch (NumberFormatException e) {
      System.out.println("Tu ne me la mettras pas à l'envers.");
    }
  }
}
