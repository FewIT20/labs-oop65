package mockexam;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_73
 */
public class Expelliarmus extends Spell {
    
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public int getDamage() {
        return 7;
    }
    
}