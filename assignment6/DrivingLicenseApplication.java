package assignment6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class DrivingLicenseApplication {

    public static void main(String[] args) {
        System.out.print("Please enter date of birth in YYYY-MM-DD: ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        scanner.close();

        try{
            LocalDate dob = LocalDate.parse(input);
            getAge(dob);
        }
        catch (Exception e) {
            System.out.println("Your DOB entered is invalid");
        }
    }

    // Returns age given the date of birth
    public static int getAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        int age=Period.between(dob, curDate).getYears();
        try {
            if (age>16){
                throw new Exception ();
            }
            if (age<=16)
            System.out.println("The age of the applicant is " + age+ " which is too early to apply for a driving license");
        }
        catch (Exception e) {
            System.out.println("The age of the applicant is " + age+ " which is eligible to apply for a driving license");
        }
        finally {
            System.out.println("Thank you!");
        }
        return age;
    }

}