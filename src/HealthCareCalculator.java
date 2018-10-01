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

        System.out.print("Enter the name of the health care plan. \n");
        System.out.print("Acceptable values are: PlanA, planA, PlanB, planB, User, or user: ");
        sUserPlanInput = sUserInput.nextLine();

        switch(sUserPlanInput)
        {
            case "PlanA":
                System.out.print("A");
                break;
            case "planA":
                System.out.print("A lower");
                break;
            case "PlanB":
                System.out.print("B");
                break;
            case "planB":
                System.out.print("B lower");
                break;
            case "User":
                System.out.print("User");
                break;
            case "user":
                System.out.print("User lower");
                break;
            default:
                System.out.print("Invalid plan. Exiting the program.");
                break;
        }
    }
}
