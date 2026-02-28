/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.15.IP115
 */
public class TestConstructor {
    public static void main(String[] args) {
        //Student s4 = new Student();
        Student s1 = new Student("Jack", "Male","ECE",21,1731172043);
        s1.displayInfo();
        Student s2 = new Student("Jasy", "Female","ECE",21,1831172043);
        s2.displayInfo();
        Student s3 = new Student("Hell","Male","BBA");
        s3.displayInfo();
         Student s4 = new Student();
        s4.displayInfo();
;    }
}
