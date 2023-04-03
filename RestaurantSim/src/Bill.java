
public class Bill extends Customer{
   
  public Bill(int appetizer, int entree, int dessert){
    super(appetizer,entree,dessert);
  }
  public void printBill() {
    System.out.print("You ordered: ");
    switch(appetizer){
      case 1: 
        System.out.print("Spicy Lobster, ");
        Customer.TOTAL+=8;
        break;
      case 2:
        System.out.print("Chili Meatballs, ");
        Customer.TOTAL+=5;
        break;
      case 3:
        System.out.print("Smoked Salmon, ");
        Customer.TOTAL +=9;
        break;
      case 4:
        System.out.print("Crab Cakes, ");
        Customer.TOTAL +=7;
        break;
      default:
        System.out.print("No appetizer, ");
    }

    switch(entree){
      case 1: 
        System.out.print("Pork Tenderloin, ");
        Customer.TOTAL+=15;
        break;
      case 2:
        System.out.print("Prime Rib, ");
        Customer.TOTAL+=22;
        break;
      case 3:
        System.out.print("Stuffed Chicken, ");
        Customer.TOTAL +=17;
        break;
      case 4:
        System.out.print("Duck Breast, ");
        Customer.TOTAL +=12;
        break;
      default:
        System.out.print("No entree, ");
    }

    switch(dessert){
      case 1: 
        System.out.println("\nand Butterscotch Pudding.");
        Customer.TOTAL+=5;
        break;
      case 2:
        System.out.println("\nand Cashew Cheesecake.");
        Customer.TOTAL+=5;
        break;
      case 3:
        System.out.println("\nand Carrot Cake.");
        Customer.TOTAL +=4;
        break;
      case 4:
        System.out.println("\nand Coconut Cream Pie.");
        Customer.TOTAL +=7;
        break;
      default:
        System.out.println("\nand no dessert.");
    }
    
    System.out.println("Your Bill comes to a total of: $" + Customer.TOTAL);

    if(Customer.TOTAL == 0){
      System.out.println("You didn't order anything! *laughs*");
    }
    else if(Customer.TOTAL > 30){
      System.out.println("A meal fit for a king!");
    }
    else{
      System.out.println("Thank you for coming to Baratie restaurant!");
    }
  }
}