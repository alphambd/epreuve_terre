public class Terre07 {

  public static void main(String[] args){
      String chaine = "";
      String chaineInv = "";
      int taille_chaine = 0;

      if((args.length != 1) || args[0].length()<2){
        System.out.println("Erreur ...\nVeillez entrer une chaine d'au moins 2 lettres !");
      }
      else{
        chaine = args[0];
        taille_chaine = chaine.length();
        
        while(taille_chaine >0){
          chaineInv += chaine.substring(taille_chaine-1, taille_chaine);
          taille_chaine--;
        }
        System.out.println(chaineInv);
      }

  }
}
