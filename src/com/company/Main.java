package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    PlanFactory factory = new PlanFactory();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the name of plan :");

        String planName = scn.nextLine();

        System.out.println("Enter the number of units :");

        int units = scn.nextInt();

        factory.GetPlan(planName);

        Plan plan = factory.GetPlan(planName);
        System.out.println(planName);
        plan.GetRate();
        plan.CalculateBill(units);

    }
}
