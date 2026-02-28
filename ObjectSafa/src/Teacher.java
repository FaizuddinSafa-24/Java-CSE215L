/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.15.IP115
 */
public class Teacher {
    String name, qualification, gender;
    int age;
    
    Teacher(String name, String qualification, String gender, int age) {
        this.name = name;
        this.qualification = qualification;
        this.gender = gender;
        this.age = age;
        
    }
    
    public void displayInfo() {
        System.out.println("Name:"+name);
        System.out.println("Qualification:"+qualification);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("");
    }
}
