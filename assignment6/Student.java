package assignment6;

import java.util.Comparator;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Student(int id, String name, double gpa, Date dateOfBirth){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
        this.dateOfBirth=dateOfBirth;
    }

    static class NameComparator implements Comparator <Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class GpaComparator implements Comparator <Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o2.getGpa(),o1.getGpa());
        }
    }

    static class DateOfBirthComparator implements Comparator <Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}