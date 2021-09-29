package com.company;

public class class3 {
    static void printName(String firstName, String lastName){
        String fullName= firstName + lastName;
    }

    static void printDayOfTheWeek(int day){
//        if(day==0 || day ==6){
//            System.out.println("Today is Sunday");
//        }
//        else if (day==1 || day==2 || day==3 || day==4 || day==5){
//            System.out.println("Today is Sunday");
//        }
//        else {
//            System.out.println("invslid day");
//        }
        switch (day){
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Sunday");
                break;
            case 3:
                System.out.println("Today is Sunday");
                break;
            case 4:
                System.out.println("Today is Sunday");
                break;
            case 5:
                System.out.println("Today is Sunday");
                break;


        }
    }


}
