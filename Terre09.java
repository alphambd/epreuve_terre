public class Terre09 {
  public static void main(String[] args){
    int base, exposant, resultat;
    base = exposant = 0;
    resultat = 1;

    if(args.length != 2){
      System.out.println("Erreur...\nVeillez entrer 2 entiers (n,m), avec n>0");
    }
    else{
      if (!estUnNombre(args[0]) || !estUnNombre(args[1]) || exposant<0) {
        System.out.println("Erreur...\nVeillez entrer 2 entiers  (n,m), avec n>0");
      }
      else{
        base = Integer.parseInt(args[0]);
        exposant = Integer.parseInt(args[1]);
        while(exposant>0){
            resultat *=base;
            exposant--;
        }
        System.out.println(resultat);
      }
    }
  }

  // Méthode qui vérifie si la chaine correspond à un nombre
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
