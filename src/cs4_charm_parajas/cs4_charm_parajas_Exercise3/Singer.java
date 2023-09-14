/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_charm_parajas_exercise2;

/**
 *
 * @author samue
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String q, int w, double e, Song r){
        name = q;
        noOfPerformances = w;
        earnings = e;
        favoriteSong = r;
    }
    
    public void performForAudience(int noOfPeople){
        noOfPerformances++;
        earnings += (100 * noOfPeople);
       
    } 
    public void changeFavoriteSong(Song newSong){
        favoriteSong = newSong;
    }
            
}
