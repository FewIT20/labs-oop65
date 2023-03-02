
import week6.Player;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_73
 */
public interface Magicable {
    
    public abstract void attackSpell(Player player, Player target, Spell spell);
    public abstract void defense(Player player, Player damager);
    
}