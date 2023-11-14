package exercise1;

class Life extends Insurance {
public int coverageAmount;

public Life(int coverageAmount) {
        this.coverageAmount = coverageAmount;
        }
public void setMonthlyCost(double cost) {
        this.monthlyCost = cost;
    }
public void setInsuranceCost() {

        double baseCost = 50.0;
        double coverageCost = coverageAmount * 0.01;

        setMonthlyCost(baseCost + coverageCost);
        }

public void displayInfo() {
        System.out.println("exercise1.Insurance Type: exercise1.Life");
        System.out.println("Monthly Cost: $" + getMonthlyCost());
        System.out.println("Coverage Amount: $" + coverageAmount);
        }
}