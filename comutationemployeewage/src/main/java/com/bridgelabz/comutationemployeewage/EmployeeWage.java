package com.bridgelabz.comutationemployeewage;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = 0;
        int employeeCheck1 = (int) Math.floor(Math.random() * 10) % 2;

        if (employeeCheck1 == 1) {
            dailyWage = fullDayHour * wagePerHour;
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("Total wage of employee is: " + dailyWage);
    }
}