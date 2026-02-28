/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.15.IP115
 */
public class Student {

    String name, gender, dept;
    int age, id;
    //variable at first
    //constructor
    //method
    
    Student() {
        System.out.println("Hello");
    }
    Student(String name, String gender, String dept, int age, int id) {
        this.name = name;
        this.gender = gender;
        this.dept = dept;
        this.id = id;
        this.age =age;
        
    }
    Student(String name, String gender, String dept) {
        this.name = name;
        this.gender = gender;
        this.dept = dept;
        
    }

    public void displayInfo() {
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Dept:"+dept);
        System.out.println("age:"+age);
        System.out.println("ID:"+id);
        System.out.println("");
    }
}
