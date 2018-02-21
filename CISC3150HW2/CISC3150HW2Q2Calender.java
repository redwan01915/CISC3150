//REDWAN AHMED
//CISC3150 HomeWork 2
//Question 2
// reference https://stackoverflow.com/questions/26695254/java-printf-with-date-and-month
// https://www.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html

import java.util.Scanner;
public class CISC3150HW2Q2Calender {

    public static void main(String args[]){
        System.out.print("Enter year: ");
        Scanner keyboard = new Scanner(System.in);
        int year = keyboard.nextInt();
        System.out.print(year);
        System.out.print(System.lineSeparator());
        System.out.print("Enter which day the first of January fall on for that year: ");
        String day = keyboard.next();
        System.out.print(day);
        printCalendar(year, day);
    }

    public static void printCalendar(int year, String day){
        String month = "";
        String daysForDisplay = " Su Mo Tu We Th Fr Sa";
        int days = 0;
        int startDay = 0;

        day = day.toLowerCase();
        if(day.contains("su"))
            startDay = 0;
        else if (day.contains("monday"))
            startDay = 1;
        else if (day.contains("tuesday"))
            startDay = 2;
        else if (day.contains("wednesday"))
            startDay = 3;
        else if (day.contains("thursday"))
            startDay = 4;
        else if (day.contains("friday"))
            startDay = 5;
        else if (day.contains("saturday"))
            startDay = 6;


        for(int i = 0; i < 12; i++){
            switch (i) {
                case 0:
                   month = "January";
                   days = 31;
                   break;
                case 1:
                    month = "February";
                    if(year % 4 == 0)
                        days = 29;
                    else
                        days = 28;
                    break;
                case 2:
                    month = "March";
                    days = 31;
                    break;
                case 3:
                    month = "April";
                    days = 30;
                    break;
                case 4:
                    month = "May";
                    days = 31;
                    break;
                case 5:
                    month = "June";
                    days = 30;
                    break;
                case 6:
                    month = "July";
                    days = 31;
                    break;
                case 7:
                    month = "August";
                    days = 31;
                    break;
                case 8:
                    month = "September";
                    days = 30;
                    break;
                case 9:
                    month = "October";
                    days = 31;
                    break;
                case 10:
                    month = "November";
                    days = 30;
                    break;
                case 11:
                    month = "December";
                    days = 31;
                    break;
            }

            System.out.print(System.lineSeparator() + System.lineSeparator());
            System.out.printf("\n\n%12s%1c%-10d\n", month, ' ', year);
            System.out.print(System.lineSeparator());
            System.out.printf("%s\n", daysForDisplay);
            System.out.print(System.lineSeparator());

            for(int j = 0; j < startDay; j++){
                System.out.printf("%3c", ' ');
            }

            for(int k = 1; k <= days; k++){
                if((startDay + k) % 7 == 0) {
                    System.out.printf("%3d\n", k);
                    System.out.print(System.lineSeparator());
                }
                else
                    System.out.printf("%3d", k);
            }

            startDay = (startDay + days) % 7;

        }
    }
}