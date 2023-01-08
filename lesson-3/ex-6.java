interface Number{
double doubleValue();}
class Logarithm implements Number {
private double base, argument;
    public double doubleValue() { 
        try{
            if(base<=0){
                throw new ArithmeticException("wrong base, must be greater than 0");
            }
            if(base==1){
                throw new ArithmeticException("wrong base, must be other than 1");
            }
            if(argument<=0){
                throw new ArithmeticException("wrong argument, must be greater than 0");
            }
        }   catch(ArithmeticException y){
            System.out.println("Error: "+ y );
            return 0;
        }
        System.out.println(Math.log(this.argument) / Math.log(this.base));
        return 0;}
public Logarithm(double inputBase, double inputArgument) {
this.base = inputBase;
this.argument = inputArgument;
}}
class Main {
public static void main(String[] args) {
    Logarithm Log = new Logarithm(10, -10);
    Log.doubleValue();
}}
