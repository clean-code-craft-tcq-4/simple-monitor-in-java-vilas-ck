package vitals;

public class ChargeRate implements Vitals{

    private static float upperLimit = 0.8f;

    private final float chargeRate;

    public ChargeRate(final float chargeRate) {
        this.chargeRate = chargeRate;
    }

    @Override
    public boolean checkVitalsRangeStatus() {
        return !(this.chargeRate > upperLimit);
    }

}