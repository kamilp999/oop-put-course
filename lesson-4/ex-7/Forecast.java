public interface Forecast {
    public float nowTemperature();
    final class Fake_1 implements Forecast {
        @Override
        public float nowTemperature(){
            return 20.1f;
        }
    }
}
