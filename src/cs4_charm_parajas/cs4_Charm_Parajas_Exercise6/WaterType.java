/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_charm_parajas_exercise6_;

import cs4_charm_parajas_exercise6_.Monster;

public class WaterType extends Monster{

    public WaterType(String n, int m, int base) {
        super(n, "water", "fire", "grass", m, base);
        this.atk = base - (base * 3 / 10);
        this.def = base + (base * 3 / 10);
    }

    /**
     * @param args the command line arguments
     */
   @Override
    public void special(){
        System.out.println(this.name + " did a pose.");
        this.def += 2;
        this.hp -= (int) Math.round(this.maxHP * 1 / 10);
        if(hp > maxHP) hp = maxHP;
    }
}

