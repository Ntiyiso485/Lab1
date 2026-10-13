package org.example;

public class StudentDetails {
    String name="Naledi";
    int age =23;
    double avr=73.5;
    boolean isReg=true;
    void displayDetails (){
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Registered: " + isReg);
        System.out.println("Mark: " + avr);
    }
}
