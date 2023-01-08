class Main{
    public static void main(String[] args) {
        Calculator Calc = new Calculator(5, 2);
        System.out.println("Min: "+Calc.min());
        System.out.println("Avg: "+Calc.avg());
        System.out.println("Max: "+Calc.max());
    }}
class Calculator {
    private int first_value,second_value;
    public Calculator(int a, int b){
        this.first_value = a;
        this.second_value = b;
    }
    public int min() { return Math.min(first_value, second_value);}
    public float avg() { return (first_value + second_value) / 2f;}
    public int max() { return Math.max(first_value, second_value);}
}

