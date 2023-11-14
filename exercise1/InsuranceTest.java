package exercise1;

import java.util.Scanner;

public class InsuranceTest {
    public static void main(String[] args) {

        Insurance[] insurances = new Insurance[2];
        insurances[0] = new Health(true);
        insurances[1] = new Life(50000);


        ScreenManager screenManager = new ScreenManager();


        screenManager.processInsurance(insurances);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of insurance (exercise1.Health/exercise1.Life): ");
        String insuranceType = scanner.nextLine();

        System.out.print("Enter the monthly fee for insurance: ");
        double monthlyFee = scanner.nextDouble();

        Insurance insurance;

        if ("exercise1.Health".equalsIgnoreCase(insuranceType)) {

            System.out.print("Does it include dental coverage? (true/false): ");
            boolean dentalCoverage = scanner.nextBoolean();

            insurance = new Health(dentalCoverage);
        } else if ("exercise1.Life".equalsIgnoreCase(insuranceType)) {

            int coverageAmount = scanner.nextInt();
            System.out.print("Enter the coverage amount for life insurance: ");

            insurance = new Life(coverageAmount);
        } else {
            System.out.println("Invalid insurance type");
            scanner.close();
            return;
        }

        insurance.setInsuranceCost();
        insurance.displayInfo();

        scanner.close();
    }
}
