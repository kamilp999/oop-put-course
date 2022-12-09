interface Auto {
  public void car_type();
  public void car_color(); 
}

class Car implements Auto {
    public String type;
    public String color;
  
  public Car(String type, String color){
    this.type = type;
    this.color = color;
}
  
  public void car_type() {
    System.out.println("TOYOTA");
  }
  public void car_color() {
    System.out.println("Red");
  }
  
  public Car new_model(String new_type){
  return new Car(new_type, this.color);
  }
}

class Main {
  public static void main(String[] args) {


    Car skoda = new Car("Seat", "Blue"); 
    Car skoda_2 = skoda.new_model("BMW"); 
    System.out.println(skoda_2.color);
  }
}
