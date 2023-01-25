public class Weather {
    private float temperature;
    private final Forecast forecast;
    public Weather(float temperature, Forecast forecast){
       this.forecast=forecast;  
       this.temperature=temperature;
    }
    @Override
    public String toString(){
        return Float.toString(temperature);
    }
}
