package vitals;

public class VitalBatteryTest {

    public void assertVitalsRange(final boolean vitalStatus, final String vitalName) {
        if (vitalStatus) {
            System.out.println("Battery " + vitalName + " is within range!");
        }
        else {
            System.out.println("Battery " + vitalName + " is out of range!");
        }
    }
}
