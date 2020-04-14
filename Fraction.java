
public class Fraction {

	public Fraction(int a,int b)
    {
      this.numerateur = a;
      this.denominateur = b;
    }
    
    public int get_LeNumerateur()
    {
       
    }
    public int get_LeDenominateur()
    {

    }
    public void setNumerateur(int a)
    {

    }
    public void setDenominateur(int b)
    {
  
    }
    public int get_pgcd()
    {
     
    }
   
       public String Affichage()
    {
        return "Fraction = " + this.numerateur + " / " + this.denominateur + " Numerateur = " + this.numerateur + " Denominateur = " + this.denominateur + " PGCD = "+ this.LePgcd();
    }
    public boolean compare(Fraction Frac){
       
        if (this.numerateur == Frac.numerateur && this.denominateur == Frac.denominateur){
          
        }
        else{
     
        }
    }
    private int numerateur;
    private int denominateur;
}
