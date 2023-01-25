public class Main
{
    public static void main(String[] args) {
        Forecast forec = new Forecast.Fake_1();

        System.out.println(forec.nowTemperature());
    }
}
