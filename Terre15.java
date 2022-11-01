public class Terre15 {
  public static void main(String[] args){
    int[] liste_entiers;
    boolean tous_entiers = true;
    boolean liste_trie = true;
    
    // Vérifier que tous les arguments sont des entiers
    for (int i=0; i<args.length; i++) {
      if(!estUnNombre(args[i])){
        tous_entiers = false;
      }
    }
    
    if(!tous_entiers){
      System.out.println("Erreur...\nVeillez entrer une liste d'entiers !");
    }
    else{
      int j = 0;
      while(j<args.length-1){
        if(Integer.parseInt(args[j]) > Integer.parseInt(args[j+1])){
          liste_trie = false;
          break;
        }
        j++;
      }
      if(liste_trie)
        System.out.println("Triée !");
      else
        System.out.println("Pas triée !");
    }
  }

  // Méthode qui vérifie s'il sagit d'un nombre
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
