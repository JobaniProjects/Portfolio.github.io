
public class Customer {
	  public int appetizer;
	  public int entree;
	  public int dessert;
	  public static int TOTAL = 0;
	  
	  public Customer(int appetizer, int entree, int dessert){
	    this.appetizer = appetizer;
	    this.entree = entree;
	    this.dessert = dessert;
	  }

	  public void eat(){
	    
	    System.out.println("\nYou start eating and enjoying your meal. Yum!\n");
	  }
}
