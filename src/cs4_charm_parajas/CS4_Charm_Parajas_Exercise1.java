/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4_charm_parajas;
import java.util.Scanner;
/**
 *
 * @author samue
 */
public class CS4_Charm_Parajas_Exercise1 {
    
    /**
     * @param args the command line arguments
     */
            
    public static void main(String[] args) {
        int lightbulb1Number = 1;
        double lightbulb1Price = 129.99;
        int lightbulb1Wattage = 5;
        String lightbulb1Type = "Incandescent";
        
        int lightbulb2Number = 2;
        double lightbulb2Price = 219.99;
        int lightbulb2Wattage = 15;
        String lightbulb2Type = "LED";
        
        int lightbulb3Number = 3;
        double lightbulb3Price = 175.25;
        int lightbulb3Wattage = 10;
        String lightbulb3Type = "Fluorescent";
        
        System.out.println("Lightbulb No. : " + lightbulb1Number);
        System.out.println("Price: Php " + lightbulb1Price);
        System.out.println("Wattage: " + lightbulb1Wattage + " Watts");
        System.out.println("Type: " + lightbulb1Type + " Light" + "\n");
        
        System.out.println("Lightbulb No. : " + lightbulb2Number);
        System.out.println("Price: Php " + lightbulb2Price);
        System.out.println("Wattage: " + lightbulb2Wattage + " Watts");
        System.out.println("Type: " + lightbulb2Type + " Light" + "\n");
        
        System.out.println("Lightbulb No. : " + lightbulb3Number);
        System.out.println("Price: Php " + lightbulb3Price);
        System.out.println("Wattage: " + lightbulb3Wattage + " Watts");
        System.out.println("Type: " + lightbulb3Type + " Light" + "\n");
        
        System.out.println("How much money do you have?(press enter)\n");
        Scanner scanner = new Scanner(System.in);
        int currentMoney = scanner.nextInt();
        double totalPrice = lightbulb1Price + lightbulb2Price 
        + lightbulb3Price;
        if(currentMoney < totalPrice){
            System.out.println("ERROR! Change is Negative Restart Code");
            
        } else {
            double changeMoney = currentMoney - totalPrice;
            System.out.println("Your change is Php " + changeMoney + ".\n(Gets the total of the prices and subtract it with the money entered)\n");

            int maxWattage = 0;
            int wattageTemp = 0;
            int[] numberArray = new int[]{lightbulb1Wattage, lightbulb2Wattage, lightbulb3Wattage};
            for(int wattage : numberArray ){
                if(wattage > wattageTemp){
                    wattageTemp = wattage;
                    maxWattage = wattage;
                }
            }   
            System.out.println(maxWattage + " Watts is the maximum amount of wattage.\n(Gets the biggest possible wattage from any of the lightbulbs)\n");

            char[] typeArray = lightbulb1Type.concat(lightbulb2Type.concat(lightbulb3Type)).toCharArray();
            for (char type : typeArray){
                if(type == 'F' || type == 'f'){
                    System.out.println("There is a letter \"f\" in one of the types of lightbulbs.\n(Checks if any of the types of lightbulbs have the letter \"f\")");
                }
            }
        }
    }
}

        
    
