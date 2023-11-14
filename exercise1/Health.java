package exercise1;

class Health extends Insurance {
    public boolean dentalCoverage;

    public Health(boolean dentalCoverage) {
        this.dentalCoverage = dentalCoverage;
    }
    public void setMonthlyCost(double cost) {
        this.monthlyCost = cost;
    }

    public void setInsuranceCost() {

        double baseCost = 100.0;
        double dentalCost = dentalCoverage ? 50.0 : 0.0;
        setMonthlyCost(baseCost + dentalCost);
    }
    public void displayInfo() {
        System.out.println("exercise1.Insurance Type: exercise1.Health");
        System.out.println("Monthly Cost: $" + getMonthlyCost());
        System.out.println("Dental Coverage: " + (dentalCoverage ? "Yes" : "No"));
    }
}