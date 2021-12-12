package assignment6;


import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(01,"Mark",3.5, new Date(2018,01,01));
        Student student2=new Student(02,"Liz",3.1, new Date(1998,03,01));
        Student student3=new Student(03,"Tom",2.5, new Date(1990,02,01));
        Student student4=new Student(04,"Tim",3.7, new Date(1989,12,01));
        Student student5=new Student(05,"Dam",3.3, new Date(1997,06,01));

        List<Student> list=new ArrayList<> (Arrays.asList(student1,student2,student3,student4,student5));

        for(Student s: list){
            System.out.println(s.toString());
        }

        Collections.sort(list, new Student.NameComparator());
        System.out.printf("----");
        System.out.println("ascending order by name");
        for (Student s:list){
            System.out.println(s.toString());
        }

        Collections.sort(list, new Student.GpaComparator());
        System.out.printf("----");
        System.out.println("descending order by GPA");
        for (Student s:list){
            System.out.println(s.toString());
        }


        Collections.sort(list, new Student.DateOfBirthComparator());
        System.out.printf("---");
        System.out.println("Birthday order");
        for (Student s: list){
            System.out.println(s.toString());
        }
    }
}
