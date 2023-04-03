import java.util.*;
public class Menu {
	  private double price;
	  private String food;
	  private Map<Integer, String> appetizers;
	  private Map<Integer, String> entree;
	  private Map<Integer, String> desserts;
	  private int[] aPrices = {8,5,9,7};
	  private int[] ePrices = {15,22,17,12};
	  private int[] dPrices = {5,5,4,7};
	  int j = 0;

	  public Menu(Map<Integer,String> appetizers,Map <Integer,String> entree, Map<Integer,String>desserts){
	    this.appetizers = appetizers;
	    this.entree = entree;
	    this.desserts = desserts;
	  }

	  public void printMenu(){
	    appetizers.put(1, "Spicy Lobster");
	    appetizers.put(2, "Chili Meatballs");
	    appetizers.put(3, "Smoked Salmon");
	    appetizers.put(4, "Crab Cakes");

	    entree.put(1,"Pork Tenderloin");
	    entree.put(2,"Prime Rib");
	    entree.put(3,"Stuffed Chicken");
	    entree.put(4,"Duck Breast");
	    
	    desserts.put(1,"Butterscotch Pudding");
	    desserts.put(2,"Cashew Cheesecake");
	    desserts.put(3,"Carrot Cake");
	    desserts.put(4,"Coconut Cream Pie");
	    
	    System.out.println("************ Menu ************");
	    //Appetizers------------------------------------
	    System.out.println("         [Appetizers]");
	    for(int i =1; i <= appetizers.size();i++){
	      j = i-1;
	      System.out.println(i + ". " + appetizers.get(i) + ".... $" + aPrices[j]);
	    }
	    System.out.println();
	    
	    //Entrees -------------------------------
	    System.out.println("          [Entrée]");
	    System.out.println();
	    for(int i = 1; i <= entree.size(); i++){
	      j= i-1;
	      System.out.println(i + ". " + entree.get(i) + ".... $" + ePrices[j]);
	    }
	    System.out.println();
	    
	    //Desserts------------------------------------
	    System.out.println("          [Desserts]");
	    System.out.println();
	    for(int i =1; i <= desserts.size(); i++){
	      j = i-1;
	      System.out.println(i + ". " + desserts.get(i) + ".... $" + dPrices[j]);
	    }
	    System.out.println("******************************");
	    System.out.println();  
	  }

	  public Map<Integer,String> getAppetizers(){
	    return this.appetizers;
	  }
	  
}
