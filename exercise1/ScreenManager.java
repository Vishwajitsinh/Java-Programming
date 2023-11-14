package exercise1;

public class ScreenManager {
    public void processInsurance(Insurance[] insurances) {
        for (Insurance insurance : insurances) {
            insurance.setInsuranceCost();
            insurance.displayInfo();
        }
    }
}