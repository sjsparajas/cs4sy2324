/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cs4_charm_parajas_exercise6_;
import java.lang.Math;
/**
 *
 * @author CHARM
 */
public class CS4_Charm_Parajas_Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FireType Moltres = new FireType("Moltres", 90, 22);
        GrassType Amoonguss = new GrassType("Amoonguss", 114, 18);
        WaterType Wailord = new WaterType("Wailord",77, 25);

        

        while(Moltres.hp > 0 && Amoonguss.hp > 0 ){
            Moltres.attack(Amoonguss);
            if(Amoonguss.hp > 0 ) {
                Amoonguss.attack(Moltres);
            }
        }
        Moltres.resetHealth();
        Amoonguss.resetHealth();
        Wailord.resetHealth();
        
        while(Wailord.hp > 0 && Amoonguss.hp > 0 ){
            Wailord.attack(Amoonguss);
            if(Amoonguss.hp > 0 ) {
                Amoonguss.attack(Wailord);
            }
        }
        
        Moltres.resetHealth();
        Amoonguss.resetHealth();
        Wailord.resetHealth();
        
        while(Moltres.hp > 0 && Wailord.hp > 0 ){
            Moltres.attack(Wailord);
            if(Wailord.hp > 0 ) {
                Wailord.attack(Moltres);
            }
        }
        
        Moltres.resetHealth();
        Amoonguss.resetHealth();
        Wailord.resetHealth();
    }
}

