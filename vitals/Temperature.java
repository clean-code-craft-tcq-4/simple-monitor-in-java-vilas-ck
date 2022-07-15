package vitals;

public class Temperature implements Vitals{

    private static float lowerLimit = 0f;

    private static float upperLimit = 40f;

    private final float temperature;

    public Temperature(final float temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean checkVitalsRangeStatus() {
       return Vitals.checkRange(this.temperature, lowerLimit, upperLimit);
    }
}
