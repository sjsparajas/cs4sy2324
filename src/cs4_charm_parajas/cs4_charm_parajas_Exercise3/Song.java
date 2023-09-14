/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_charm_parajas_exercise2;

/**
 *
 * @author samue
 */
public class Song {
    String name;
    int sales;
    
    public Song(String q, int w){
        name = q;
        sales = w;
    }
    
    public void sellUnits(int unitsSold){
        sales += unitsSold;
    }
}
