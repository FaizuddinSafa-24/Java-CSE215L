/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.15.IP115
 */
public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jacy";
        s1.gender = "Female";
        s1.dept = "ECE";
        s1.age = 21;
        s1.id = 1831172043;
        
        Student s2 = new Student();
        s2.name = "Jack";
        s2.gender = "Male";
        s2.dept = "ECE";
        s2.age = 22;
        s2.id = 1731172043;
        
        
        System.out.println("Name:"+s1.name);
        System.out.println("Gender:"+s1.gender);
        System.out.println("Dept:"+s1.dept);
        System.out.println("age:"+s1.age);
        System.out.println("ID:"+s1.id);
        System.out.println("");
        System.out.println("Name:"+s2.name);
        System.out.println("Gender:"+s2.gender);
        System.out.println("Dept:"+s2.dept);
        System.out.println("age:"+s2.age);
        System.out.println("ID:"+s2.id);
    }

}
