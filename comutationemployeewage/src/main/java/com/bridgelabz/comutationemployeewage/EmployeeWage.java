package com.bridgelabz.comutationemployeewage;

import java.util.Random;

public class EmployeeWage {
    private String company;
    static int EMP_RATE_PER_HOUR;
    static int WORKING_DAYS_PER_MONTH;
    static int MAX_WORKING_HOURS;
    private int totalEmpWage;

    public EmployeeWage(String company, int EMP_RATE_PER_HOUR, int workingDaysPerMonth, int maxWorkingHours) {
        this.company = company;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.WORKING_DAYS_PER_MONTH = workingDaysPerMonth;
        this.MAX_WORKING_HOURS = maxWorkingHours;
    }

    public void companyWage() {
        System.out.printf("%s Employee Wage details: ", company).println();

        int empWage = 0, totalWage = 0, workingHours = 0, empHours = 0;
        Random random = new Random();

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH && workingHours < MAX_WORKING_HOURS; day++) {

            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case 1:
                    System.out.printf("Day %d: Employee is Present for full day.", day).println();
                    empHours = 8;
                    break;
                case 2:
                    System.out.printf("Day %d: Employee worked for half day.", day).println();
                    empHours = 4;
                    break;
                default:
                    System.out.printf("Day %d: Employee is Absent.", day).println();
                    empHours = 0;
                    break;
            }
            empWage = empHours * EMP_RATE_PER_HOUR;
            System.out.printf("Worked:" + empHours + "hours, Wage:" + empWage).println("\n");
            totalWage += empWage;
            workingHours += empHours;
        }
        totalEmpWage = workingHours * EMP_RATE_PER_HOUR;
        System.out.printf("The Total wage of " + company + " for this month:  " + totalWage).println();
        System.out.printf("Total hours of working for " + company + ": " + workingHours).println();
        System.out.println();
    }

    public String toString() {
        return "Total wage  for the Company " + company + " is: " + totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation. \n");
        EmployeeWage company1 = new EmployeeWage("Vedanta", 20, 20, 100);
        company1.companyWage();
        EmployeeWage company2 = new EmployeeWage("TCS", 15, 26, 200);
        company2.companyWage();
        System.out.println(company1);
        System.out.println(company2);
    }
}