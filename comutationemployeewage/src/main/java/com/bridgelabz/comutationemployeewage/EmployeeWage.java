package com.bridgelabz.comutationemployeewage;

public class EmployeeWage {
    static int WagePerHour = 20;
    static int FullTimeHour = 8;
    static int PartTimeHour = 4;

    public static void main(String[] args) {
        int totalWorkingDays = 0;
        int totalHour = 0;
        int totalDailyWage = 0;
        while (totalHour < 100 && totalWorkingDays < 20) {
            int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));
            totalWorkingDays++;

            switch (employeeCheck) {
                case 2:
                    totalHour = totalHour + FullTimeHour;
                    totalDailyWage = totalDailyWage + FullTimeHour * WagePerHour;
                    System.out.println("Employee is present full time: " + totalDailyWage);
                    break;
                case 1:
                    totalHour = totalHour + PartTimeHour;
                    totalDailyWage = totalDailyWage + PartTimeHour * WagePerHour;
                    System.out.println("Employee is present half time: " + totalDailyWage);
                    break;
                default:
                    System.out.println("Employee is absent: " + totalDailyWage);

                    System.out.println("Working Days is: " + totalWorkingDays + " Hours: " + totalHour);

                    System.out.println("Employee total wage for month is: " + totalDailyWage);
            }
        }
    }

}