/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_charm_parajas_exercise6_;
import cs4_charm_parajas_exercise6_.Monster;
import java.lang.Math;
/**
 *
 * @author CHARM
 */
public class GrassType extends Monster{

    public GrassType(String n, int m, int base) {
        super(n,"grass", "water", "fire", m, base);
        this.atk = base;
        this.def = base;
    }

    @Override
    public void special(){
        System.out.println(this.name + " did a pose.");
        if(hp > maxHP) hp = maxHP;
        this.hp += (int) Math.round(this.maxHP - (this.maxHP * 8 / 10));
    }

    @Override 
    public void rest(){
        this.hp += (int) Math.round(this.maxHP - (this.maxHP * 5 / 10));
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }

    /**
     * @param args the command line arguments
     */

}