
public class Server implements Dialogue{
  String name;
  
  
  public Server(String name){
    this.name = name;
  }

  public void checkAnswer(int menuOrder) throws OverFourException{
    if(menuOrder >4){
      throw new OverFourException("Your input goes over 4 and it is not part of the menu options!");
    }
  }
    
  @Override
  public void greet(){
    System.out.println();
    System.out.println("Hello, welcome to the Baratie restaurant! \nMy name is " + name + " and I will be your server for today. \nPlease take a look at our menu.");
    System.out.println();
  }

  @Override
  public void askAppetizers(){
    System.out.println("Let's begin with the appetizer. Which one will you choose? \n(Enter a number 1 through 4, 0 for nothing.)");
  }

  @Override
  public void askEntree(){
    System.out.println("And for the entrée? \n(Enter a number 1 through 4, 0 for nothing.)");
  }

  @Override 
  public void askDessert(){
    System.out.println("Lastly, dessert. \n(Enter a number 1 through 4, 0 for nothing.)");
  }
  
}