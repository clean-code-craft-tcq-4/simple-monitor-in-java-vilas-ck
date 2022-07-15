package vitals;

public class Main {

    public static void main(final String[] args) {
        VitalBatteryTest vitalBatteryTest = new VitalBatteryTest();
        Vitals vitals;

        vitals = new Temperature(32f);
        vitalBatteryStatusTest(vitals, vitalBatteryTest);

        vitals = new Soc(65f);
        vitalBatteryStatusTest(vitals, vitalBatteryTest);

        vitals = new Soc(75.7f);
        vitalBatteryStatusTest(vitals, vitalBatteryTest);

        vitals = new ChargeRate(0.7f);
        vitalBatteryStatusTest(vitals, vitalBatteryTest);

        vitals = new Temperature(1000f);
        vitalBatteryStatusTest(vitals, vitalBatteryTest);

        vitals = new Soc(85f);
        vitalBatteryStatusTest(vitals, vitalBatteryTest);

        vitals = new Soc(-0.78f);
        vitalBatteryStatusTest(vitals, vitalBatteryTest);

        vitals = new ChargeRate(0.8f);
        vitalBatteryStatusTest(vitals, vitalBatteryTest);
    }
    private static void vitalBatteryStatusTest(final Vitals vitals, final VitalBatteryTest vitalTests) {
        vitalTests.assertVitalsRange(vitals.checkVitalsRangeStatus(), vitals.getClass().getSimpleName());
    }
}
