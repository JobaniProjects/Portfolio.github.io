//@author: David Zenteno
import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Map<Integer, String> menuAppetizers = new HashMap<>();
	    Map<Integer, String> menuEntree = new HashMap<>();
	    Map<Integer, String> menuDesserts = new HashMap<>();
	    
	    Server server = new Server("David");
	    Menu menu = new Menu(menuAppetizers, menuEntree, menuDesserts);
	    Scanner scan = new Scanner(System.in);
	    server.greet();
	    menu.printMenu();
	    
	    server.askAppetizers();
	    int aAnswer = scan.nextInt();
	    try{
	      server.checkAnswer(aAnswer);
	    }catch(OverFourException e){
	      e.printStackTrace();  
	    }
	    
	    server.askEntree();
	    int eAnswer = scan.nextInt();
	    try{
	      server.checkAnswer(eAnswer);  
	    }catch(OverFourException e){
	      e.printStackTrace();
	    }
	    
	    server.askDessert();
	    int dAnswer = scan.nextInt();
	    try{
	      server.checkAnswer(dAnswer);  
	    }catch(OverFourException e){
	      e.printStackTrace();
	    }
	    scan.close();
	    
	    Customer customer = new Bill(aAnswer, eAnswer, dAnswer);
	    customer.eat();
	    Bill theBill = (Bill)customer;
	    
	    theBill.printBill();
	  }
}
