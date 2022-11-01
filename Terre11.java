public class Terre11 {
  public static void main(String[] args){
    int nombre = 0;
    boolean est_premier = true;

    if(args.length != 1){
      System.out.println("Erreur...\nVeillez entrer un nombre entier positif > 1");
    }
    else{
      if (!estUnNombre(args[0]) || Integer.parseInt(args[0])<=1) {
        System.out.println("Erreur...\nVeillez entrer un nombre entier positif > 1");
      }
      else{
        nombre = Integer.parseInt(args[0]);
        for(int i = 1; i<=nombre; i++){
          if((nombre%i ==0) && ((i != 1) && (i != nombre))) {
            est_premier = false;
          }
        }
        if (est_premier) {
          System.out.println("Oui, "+nombre+" est un nombre premier.");
        }
        else {
          System.out.println("Non, "+nombre+" n'est pas un nombre premier.");
        }
      }
    }
  }

  // Méthode qui vérifie si une chaine correspond à un nombre
  public static boolean estUnNombre(String chaine){
    try{
      Integer.parseInt(chaine);
    }
    catch(NumberFormatException e){
      return false;
    }
    return true;
  }
}
