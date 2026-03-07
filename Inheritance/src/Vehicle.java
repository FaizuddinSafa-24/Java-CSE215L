/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.15.IP115
 */
public class Vehicle {
    String brand;
    int year;
    
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("brand name: "+brand);
        System.out.println("brand year: "+year);
    }
}
