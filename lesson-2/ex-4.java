interface Auto {
  public void car_type();
  public void color(); 
}

class Car implements Auto {
  public void car_type() {
    System.out.println("TOYOTA R1");
  }
  public void color() {
    System.out.println("Red");
  }
}

public class Main {
  public static void main(String[] args) {
    Car Car_2 = new Car();  
    Car_2.car_type();
    Car_2.color();
  }
}

