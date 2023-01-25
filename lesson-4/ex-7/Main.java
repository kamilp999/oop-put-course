public class Main
{
    public static void main(String[] args) {
        Forecast forecast = new Forecast.Fake_1();

        System.out.println(forecast.nowTemperature());
    }
}
