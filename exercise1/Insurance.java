package exercise1;

abstract class Insurance {
    private String type;
    public double monthlyCost;

    public String getType() {
        return type;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }
    public abstract void setInsuranceCost();

    public abstract void displayInfo();
}