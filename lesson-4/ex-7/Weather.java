public class Weather {
    private float temp;
    private final Forecast forec;
    public Weather(float temperature, Forecast forec){
        this.forec=forec;
        this.temp=temperature;
    }
    @Override
    public String toString(){
        return Float.toString(temp);
    }
}
