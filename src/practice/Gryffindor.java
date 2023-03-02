
import week6.Player;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_73
 */
public class Gryffindor extends Houses implements Magicable {

    public Gryffindor() {
        super("Gryffindor", "RED");
    }

    @Override
    public void attackSpell(Player player, Player target, Spell spell) {
        if (spell instanceof Incendio) {
            int totalDamage = spell.getDamage() + player.getAttackDamage();
            target.setHP(target.getHP() - totalDamage);
            player.setMana(player.getMana() - 4);
        } else if (spell instanceof Expelliarmus) {
            int totalDamage = spell.getDamage() + player.getAttackDamage();
            target.setHP(target.getHP() - totalDamage);
            player.setMana(player.getMana() - 3);
        }
        System.out.println("["+player.getName()+"]: use spell ("+spell.getName()+")!");
    }

    @Override
    public void defense(Player player, Player damager) {
        System.out.println("["+player.getName()+"]: Episkey !");
        player.setHP(player.getHP() + 3);
        player.setMana(player.getMana() + 4);
    }

}