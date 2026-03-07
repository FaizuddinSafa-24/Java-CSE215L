/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.15.IP115
 */
public class Car extends Vehicle{
    int numberOfDoors;
    
    Car(String brand, int year, int numberOfDoors) {
        super(brand,year); // as both parent and child classes have the same parameters
        this.numberOfDoors = numberOfDoors;
    }
    public void displayInfo2(){
        System.out.println("brand name: "+brand);
        System.out.println("brand year: "+year);
    }
}
