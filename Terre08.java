public class Terre08 {

  public static void main(String[] args){
    String chaine = "";
    int taille_chaine = 0;

    if(args.length != 1){
      System.out.println("Erreur ...\nVeillez entrer une chaine de caractère !");
    }
    else{
      chaine = args[0];
      char[] tab_char = chaine.toCharArray();
      
      if(estUnNombre(chaine)){
        System.out.println("Erreur ...\nVeillez entrer une chaine de caractère !");
      }
      else{
        for(char c : tab_char){
          taille_chaine++;
        }
        System.out.println(taille_chaine);
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
