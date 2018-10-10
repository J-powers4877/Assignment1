/*
*   Justin Powers
*   COP3330C Fall 2018
*   Assignment 1: Health Care Calculator
*
*   Description: The program will help determine the total health care costs for a person,
*                using their Health Care Plan.
*/

import java.util.Scanner;

/** This class consists of just the main method.
 * <p>Inside the main method, the Scanner, Premium, Deductible, Coinsurance, and Bills double's are initiated.</p>
 * <p>The user is then prompted to enter the name of the health care plan.</p>
 * <p>A switch statement is used to determine which case was chosen so the appropriate calculations can be done.</p>
 */
public class HealthCareCalculator
{
    /** Main function: Has Three (3) Strings and four (4) doubles initialized.&nbsp;Reads user input for the plan they have then runs a switch statement to pass the needed values to the correct constructors.
     * <p>The PlanA and PlanB switch both use the first constructor, where just the Bills and the Plan name are passed.</p>
     * <p>The User switch uses the seconds constructor, where the users defined Premium, Deductible, Coinsurance, and Bills are passed.</p>
     *
     */
    public static void main(String[] args)
    {
        Scanner sUserInput = new Scanner(System.in);

        System.out.print("Enter the name of the health care plan. \n");
        System.out.print("Acceptable values are: PlanA, planA, PlanB, planB, User, or user: ");
        String sUserPlanInput = sUserInput.nextLine();

        double dPremium;
        double dDeductible;
        double dCoinsurance = 0;
        double dBills;
        String sUserCoinsuranceInput;
        switch(sUserPlanInput)
        {
            case "PlanA":
            case "planA":
                System.out.print("Please enter the total medical bills: ");
                dBills = sUserInput.nextDouble();

                HealthCarePlans PlanA = new HealthCarePlans("planA", dBills);
                System.out.printf("Premium: $%.2f\n", PlanA.getdPremium());
                System.out.printf("Other costs: $%.2f\n", PlanA.getdNewBills());
                System.out.printf("Total costs: $%.2f\n", PlanA.getdTotalHealthCosts());

                break;
            case "PlanB":
            case "planB":
                System.out.print("Please enter the total medical bills: ");
                dBills = sUserInput.nextDouble();

                HealthCarePlans PlanB = new HealthCarePlans("planB", dBills);
                System.out.printf("Premium: $%.2f\n", PlanB.getdPremium());
                System.out.printf("Other costs: $%.2f\n", PlanB.getdNewBills());
                System.out.printf("Total costs: $%.2f\n", PlanB.getdTotalHealthCosts());

                break;
            case "User":
            case "user":
                System.out.print("Please enter the premium: ");
                dPremium = sUserInput.nextDouble();

                System.out.print("Please enter the deductible: ");
                dDeductible = sUserInput.nextDouble();

                sUserCoinsuranceInput = sUserInput.nextLine();
                System.out.print("For the coinsurance, would you like to enter a decimal or a fraction as an input?: ");
                sUserCoinsuranceInput = sUserInput.nextLine();

                String sCoinsurance;
                switch(sUserCoinsuranceInput.toLowerCase())
                {
                    case "decimal":
                        System.out.print("Please enter the decimal input for the coinsurance: ");
                        dCoinsurance = sUserInput.nextDouble();
                        break;
                    case "fraction":
                        System.out.print("Please enter the fraction input for the coinsurance: ");
                        sCoinsurance = sUserInput.nextLine();
                        FractionToDecimal dCoinsuranceNew = new FractionToDecimal(sCoinsurance);
                        dCoinsurance = dCoinsuranceNew.getdDecimal();
                        break;
                }

                System.out.print("Please enter the total medical bills: ");
                dBills = sUserInput.nextDouble();

                HealthCarePlans UserDefined = new HealthCarePlans(dPremium, dDeductible, dCoinsurance, dBills);
                System.out.printf("Premium: $%.2f\n", dPremium);
                System.out.printf("Other costs: $%.2f\n", UserDefined.getdNewBills());
                System.out.printf("Total costs: $%.2f\n", UserDefined.getdTotalHealthCosts());

                break;
            default:
                System.out.print("Invalid plan. Exiting the program.");

                break;
        }
    }
}
