public class Terre06 {
  public static void main(String[] args){

    int dividende, diviseur, quotient, reste;
    dividende = diviseur = quotient = reste = 0;

    if(args.length <2 || (Integer.parseInt(args[0]) < Integer.parseInt(args[1])) || Integer.parseInt(args[1])==0) {
      System.out.println("Erreur ...\nVeillez entrer 2 arguments entiers (n,m) tq (n>m), pour pouvoir effectuer la division !");
    }
    else {
      dividende = Integer.parseInt(args[0]);
      diviseur = Integer.parseInt(args[1]);
      if(dividende > diviseur){
        quotient = dividende / diviseur;
        reste = dividende % diviseur;
      }
      System.out.println("Résultat : "+quotient);
      System.out.println("Reste    : "+reste);
    }
  }
}
