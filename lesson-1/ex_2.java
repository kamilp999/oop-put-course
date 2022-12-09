public class Human_ID 
{
  
  String name,last_name;
  
  Human_ID() 
  {
    this.name = "Kamil";
    this.last_name = "Kowalski";
    this.country = "Polska";
  }
  
  public void Name() 
  {
    System.out.println("Imie: " + this.name + " " + this.last_name);
  }
  
  public void Country() 
  {
    System.out.println("Kraj pochodzenia: " + this.country);
  }
  
  public static void main(String[] args) 
  {
    Human_ID human = new Human_ID();
    human.Name();
    human.Country();
  }
  
}
