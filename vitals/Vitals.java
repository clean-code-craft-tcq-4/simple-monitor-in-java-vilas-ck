package vitals;

public interface Vitals {

    boolean checkVitalsRangeStatus();

    static boolean checkRange(float value, float lowerLimit, float upperLimit){
        return !((value < lowerLimit) || (value > upperLimit));
    }
}
