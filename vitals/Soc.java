package vitals;

public class Soc implements Vitals {

    private static float lowerLimit = 20f;

    private static float upperLimit = 80f;

    private final float soc;

    public Soc(final float soc) {
        this.soc = soc;
    }

    @Override
    public boolean checkVitalsRangeStatus() {
        return Vitals.checkRange(this.soc, lowerLimit, upperLimit);
    }

}
