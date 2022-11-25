package com.bridgelabz.comutationemployeewage;

import java.util.Random;

public class EmployeeWage {
    final static int FullTimeWorker = 1;
    final static int PartTimeWorker = 2;

    public static void program(String company, int EmpRatePerHour, int TotalnoWorkingDay,
            int EmpTotalHours) {
        int totalworkingdays = 0;
        int empHours = 0;
        int empWage = 0;
        int Totalemphrs = 0;

        int Total_emp_wage = 0;
        while (Totalemphrs <= EmpTotalHours && totalworkingdays <= TotalnoWorkingDay) {
            totalworkingdays++;
            Random random = new Random();

            int empCheck = random.nextInt(2);

            switch (empCheck) {
                case FullTimeWorker:
                    empHours = 8;

                    break;
                case PartTimeWorker:
                    empHours = 4;

                    break;
                default:
                    empHours = 0;
            }
            Totalemphrs = Totalemphrs + empHours;
            empWage = empHours * EmpRatePerHour;
            System.out.println("Daily emp wage is" + empWage);
            Total_emp_wage = empWage + Totalemphrs;
            Total_emp_wage = Total_emp_wage * TotalnoWorkingDay;

        }
        System.out.println("The Monthly Wage of Employee of " + company + " is " + Total_emp_wage);
    }

    public static void main(String[] args) {

        program("Vedanta", 20, 20, 200);

        program("TCS", 30, 30, 300);

        program("Wipro", 50, 20, 220);

    }
}