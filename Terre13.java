public class Terre13 {
  public static void main(String[] args){
    String chaine = "";
    String format = "";
    int heure, min, pos_separateur;
    heure = min = pos_separateur = 0;

    if(args.length != 1){
      System.out.println("Erreur...\nVeillez entrer une chaine correspondant à l'heure que vous voulez convertir !");
    }
    else{
      chaine = args[0];
      format = chaine.substring(chaine.length()-2, chaine.length());
      pos_separateur = chaine.indexOf(':');
      heure = Integer.parseInt(chaine.substring(0,pos_separateur));
      min = Integer.parseInt(chaine.substring(pos_separateur+1,pos_separateur+3));
      if(format.equals("PM")){
        heure += 12;
        System.out.println(heure+ ":" + min);
      }
      else{
        System.out.println(heure+ ":" + min);
      }
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
