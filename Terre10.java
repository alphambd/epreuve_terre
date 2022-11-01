public class Terre10 {
  public static void main(String[] args){
    int nombre = 0;
    double resultat = 0;

    if(args.length != 1){
      System.out.println("Erreur...\nVeillez entrer un nombre entier positif");
    }
    else{
      if (!estUnNombre(args[0])) {
        System.out.println("Erreur...\nVeillez entrer un nombre entier positif");
      }
      else{
        nombre = Integer.parseInt(args[0]);
        resultat = Math.sqrt(nombre);
        System.out.println(resultat);
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
