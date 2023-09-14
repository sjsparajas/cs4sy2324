/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4_charm_parajas_exercise3;

/**
 *
 * @author samue
 */
public class CS4_Charm_Parajas_Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lightbulb LightBulb1 = new Lightbulb(1, 129.99, 5, "Incandescent");
        Lightbulb LightBulb2 = new Lightbulb(2, 219.99, 15, "LED");
        Lightbulb LightBulb3 = new Lightbulb(3, 175.25, 10, "Fluorescent");
        
        Song weAreTheChampions = new Song("We Are The Champions", 962000);
        Song bohemianRhapsody = new Song("Bohemian Rhapsody", 2540604);
        
        Singer freddieMercury = new Singer("Freddie Mercury", 700, 60000000, weAreTheChampions);
        freddieMercury.performForAudience(12);
        freddieMercury.changeFavoriteSong(bohemianRhapsody);
        System.out.println(freddieMercury.name + " " + freddieMercury.earnings + " " + 
        freddieMercury.noOfPerformances + " " + freddieMercury.favoriteSong.name);
    }
}
