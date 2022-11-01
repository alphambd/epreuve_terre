public class Terre14 {
  public static void main(String[] args){
    int n1, n2, n3, resultat;
    n1 = n2 = n3 = resultat = 0;

    if(args.length != 3){
      System.out.println("Erreur...\nVeillez entrer 3 entiers différents !");
    }
    else{
      n1 = Integer.parseInt(args[0]);
      n2 = Integer.parseInt(args[1]);
      n3 = Integer.parseInt(args[2]);
      
      if(n1==n2 || n1==n3 || n2==n3 || !estUnNombre(args[0]) || !estUnNombre(args[1]) || !estUnNombre(args[2])){
        System.out.println("Erreur...\nVeillez entrer 3 entiers différents !");
      }
      else{
        if((n1>n2 && n1<n3) || (n1>n3 && n1<n2))
          resultat = n1;
        else if((n2>n1 && n2<n3) || (n2>n3 && n2<n1))
          resultat = n2;
        else if((n3>n1 && n3<n2) || (n3>n2 && n3<n1))
          resultat = n3;
        System.out.println(resultat);
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
