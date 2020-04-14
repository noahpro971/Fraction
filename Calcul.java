
public class Calcul {
	 public static void main (String args[]) {
         Fraction Frac1 = new Fraction(6,10);
         Fraction Frac2 = new Fraction(16,10);
         System.out.println("\nLes fractions  : ");
         System.out.println("Fraction N1 : " + Frac1.Affichage());
         System.out.println("Fraction N2 : " + Frac2.Affichage());
         Frac1.SimplifierFraction();
         Frac2.SimplifierFraction();
         System.out.println("Fraction N1 simplifiée : " + Frac1.Affichage());
         System.out.println("Fraction N2 simplifiée: " + Frac2.Affichage());

         Fraction Frac3 = Frac1.Addition(Frac2);
         System.out.println("Resultat de la somme de Frac1 et Frac 2 est : "+ Frac3.Affichage());
         Frac3.SimplifierFraction();
         System.out.println("Fraction N3 simplifiée : " + Frac3.Affichage());

         Frac3 = Frac1.Multiplication(Frac2);
         System.out.println("Resultat de la multiplication de Frac1 et Frac 2 est : "+ Frac3.Affichage());
         Frac3.SimplifierFraction();
         System.out.println("Fraction N3 simplifiée : " + Frac3.Affichage());
}
}
