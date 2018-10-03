/*
Justin Powers
COP3330C Fall 2018
Assignment 1: Health Care Calculator

Description: The program will help determine the total health care costs for a person,
             using their Health Care Plan.
 */

import java.util.Scanner;

public class HealthCareCalculator
{
    public static void main(String[] args)
    {
        Scanner sUserInput = new Scanner(System.in);

        String sUserPlanInput;

        double dPremium;
        double dDeductible;
        double dCoinsurance;
        double dBills;

        System.out.print("Enter the name of the health care plan. \n");
        System.out.print("Acceptable values are: PlanA, planA, PlanB, planB, User, or user: ");
        sUserPlanInput = sUserInput.nextLine();

        switch(sUserPlanInput)
        {
            case "PlanA":
                System.out.print("Please enter the total medical bills: ");
                dBills = sUserInput.nextDouble();

                HealthCarePlans PlanA = new HealthCarePlans("PlanA", dBills);
                System.out.print(PlanA.getdTotalHealthCosts());
                break;
            case "planA":
                System.out.print("Please enter the total medical bills: ");
                dBills = sUserInput.nextDouble();

                HealthCarePlans planA = new HealthCarePlans("planA", dBills);
                System.out.print(planA.getdTotalHealthCosts());
                break;
            case "PlanB":
                System.out.print("Please enter the total medical bills: ");
                dBills = sUserInput.nextDouble();

                HealthCarePlans PlanB = new HealthCarePlans("PlanB", dBills);
                System.out.print(PlanB.getdTotalHealthCosts());
                break;
            case "planB":
                System.out.print("Please enter the total medical bills: ");
                dBills = sUserInput.nextDouble();

                HealthCarePlans planB = new HealthCarePlans("planB", dBills);
                System.out.print(planB.getdTotalHealthCosts());
                break;
            case "User":
                System.out.print("Please enter the premium: ");
                dPremium = sUserInput.nextDouble();

                System.out.print("Please enter the deductible: ");
                dDeductible = sUserInput.nextDouble();

                System.out.print("Please enter the coinsurance: ");
                dCoinsurance = sUserInput.nextDouble();

                System.out.print("Please enter the total medical bills: ");
                dBills = sUserInput.nextDouble();

                HealthCarePlans UserDefined = new HealthCarePlans(dPremium, dDeductible, dCoinsurance, dBills);
                System.out.print(UserDefined.getdTotalHealthCosts());

                break;
            case "user":
                System.out.print("Please enter the premium: ");
                dPremium = sUserInput.nextDouble();

                System.out.print("Please enter the deductible: ");
                dDeductible = sUserInput.nextDouble();

                System.out.print("Please enter the coinsurance: ");
                dCoinsurance = sUserInput.nextDouble();

                System.out.print("Please enter the total medical bills: ");
                dBills = sUserInput.nextDouble();

                HealthCarePlans userDefined = new HealthCarePlans(dPremium, dDeductible, dCoinsurance, dBills);
                System.out.print(userDefined.getdTotalHealthCosts());

                break;
            default:
                System.out.print("Invalid plan. Exiting the program.");
                break;
        }
    }
}
