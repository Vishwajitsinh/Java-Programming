package exercise2;

import java.util.Scanner;

public class GameTesterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of game tester (FullTime/PartTime): ");
        String testerType = scanner.nextLine();

        System.out.print("Enter the name of the game tester: ");
        String name = scanner.nextLine
        if ("FullTime".equalsIgnoreCase(testerType)) {
            System.out.print("Enter the salary for the full-time game tester: ");
            double salary = scanner.nextDouble();

            GameTester tester = new FullTimeGameTester(name, salary);
            tester.generatePaystub();
        } else if ("PartTime".equalsIgnoreCase(testerType)) {
            System.out.print("Enter the hourly rate for the part-time game tester: ");
            double hourlyRate = scanner.nextDouble();

            System.out.print("Enter the hours worked for the part-time game tester: ");
            int hoursWorked = scanner.nextInt();

            GameTester tester = new PartTimeGameTester(name, hourlyRate, hoursWorked);
            tester.generatePaystub();
        } else {
            System.out.println("Invalid game tester type");
        }

        scanner.close();
    }
}
