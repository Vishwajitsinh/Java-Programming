package exercise2;

public class FullTimeGameTester implements GameTester {
    private String name;
    private double salary;

    public FullTimeGameTester(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void generatePaystub() {
        System.out.println("Generating paystub for full-time game tester: " + name);
        System.out.println("Salary: $" + salary);

    }
}