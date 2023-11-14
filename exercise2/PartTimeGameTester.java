package exercise2;

public class PartTimeGameTester implements GameTester {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeGameTester(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    public String getName() {
        return name;
    }


    public void generatePaystub() {
        System.out.println("Generating paystub for part-time game tester: " + name);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Pay: $" + (hourlyRate * hoursWorked));

    }
}