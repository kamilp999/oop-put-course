public interface Forecast
{
    final class Fake_1 implements Forecast {
        @Override
        public float nowTemperature(){
            return 20.1f;
        }
    }
    public float nowTemperature();
}
