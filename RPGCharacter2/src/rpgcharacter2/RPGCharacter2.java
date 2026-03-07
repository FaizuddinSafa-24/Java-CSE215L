/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpgcharacter2;

/**
 *
 * @author 602.15.IP115
 */
public class RPGCharacter2 {

    /**
     * @param args the command line arguments
     */
    private String name;
    private int level;
    private int healthPoints;
    
    RPGCharacter2(){
        this.name = "NPC";
        this.level = 1;
        this.healthPoints= 10;
    }
    RPGCharacter2(String newName, int newLevel, int newHealth) {
        this.name = newName;
        this.level = newLevel;
        this.healthPoints= newHealth;
    }
    
    public int setLevel(int level1) {
        this.level = level1;
        return level;
    }
    public int setHealth(int health) {
        this.healthPoints = health;
        return level;
    }
    
    public String setName(String Nname) {
        this.name = Nname;
        return name;
    }
    
    
}
