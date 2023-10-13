/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_charm_parajas_exercise5;

/**
 *
 * @author samue
 */
import java.util.*;

public class Store {
    private String name;
    private double earnings;
    private ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList();

    public Store(String name){
        this.name = name;
        earnings = 0;
        itemList = new ArrayList();
        storeList.add(this);
      // Initialize name to parameter and earnings to zero
      // Initialize itemList as a new ArrayList
      // add 'this' store to storeList
    }

    public String getName(){
        return name;
      }
    public double getEarnings(){
        return earnings;
      }
    public void sellItem(int index){
        System.out.println("\nAn item sold through index :");
        if(index < this.itemList.size()){
            earnings += this.itemList.get(index).getCost();
            System.out.println("You have bought a " + this.itemList.get(index).getName() +".");
        } else {
            System.out.println("ERROR: There are only " + this.itemList.size() +" items in " + this.getName() + ".");
        }
        // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
        // get Item at index from itemList and add its cost to earnings
        // print statement indicating the sale
      }
    public void sellItem(String name){
        System.out.println("\nAn item sold through name :");
        boolean found = false;
          for(int i = 0; i < this.itemList.size(); i++){
              found = this.itemList.get(i).getName().equals(name);
              if(found) {
                earnings += this.itemList.get(i).getCost();        
                System.out.println("You have bought a " + this.itemList.get(i).getName() +".");
                i = this.itemList.size();
              }
          }
          

          if(!found) {
              System.out.println("ERROR: " + this.getName() + " does not sell an item named " + name +".");
          }
      // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
      // get Item from itemList and add its cost to earnings
      // print statement indicating the sale}
    }

  public void sellItem(Item i){
      System.out.println("\nAn item sold through item number :");
      if(this.itemList.contains(i)){
        earnings += this.itemList.get(this.itemList.indexOf(i)).getCost();        
        System.out.println("You have bought a " + this.itemList.get(this.itemList.indexOf(i)).getName() +".");
      } else {
        System.out.println("ERROR: " + this.getName() + " does not sell " + i.getName() + ".");
      }
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
      this.itemList.add(i);
    // add Item i to store's itemList
  }
  public void filterType(String type){
      System.out.println("\nAll items with the type " + type + " :" );
        this.itemList.forEach((var) -> {
            if(type == var.getType()){
                System.out.println("Item: " + var.getName() + " - Type: " + var.getType());
            }
        });
        // loop over itemList and print all items with the specified type
    }
  public void filterCheap(double maxCost){
      System.out.println("\nAll items more cheaper than " + maxCost + " :" );
        this.itemList.forEach((var) -> {
            if(var.getCost() <= maxCost){
                System.out.println("Item: " + var.getName() + " - Cost: " + var.getCost());
            }
        });
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
    System.out.println("\nAll items more expensive than " + minCost + " :" );
        this.itemList.forEach((var) -> {
            if(var.getCost() > minCost){
                System.out.println("Item: " + var.getName() + " - Cost " + var.getCost());
            }
        });
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
    System.out.println("\nAll the shops with their respective earnings:" );
        storeList.forEach((var) -> {
            System.out.println("Store: " + var.getName() + " : Earnings: " + var.getEarnings());
        });
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
