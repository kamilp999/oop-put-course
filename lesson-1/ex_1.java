public class Main {
  String name = "Jurek";
  int age = 24;
  String last_name = "Kowalski";

  String company = "Dell";
  String serial_number = "CCD";

  public static void main(String[] args) {
    Main friend = new Main();  // Object 1
    Main monitor = new Main();  // Object 2
    
    
    System.out.println(friend.age);
    System.out.println(monitor.company);
    System.out.println(monitor.name);
  }
}

