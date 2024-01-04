package Main;

import java.util.*;

public class Trainer {
    private String name;
    private Monster activeMonster;
    private ArrayList<Monster> team;

    public Trainer(String n){
        this.name = n;
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    
    public Monster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<Monster> getTeam(){
        return team;
    }

    public void capture(Monster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(Monster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    public void sureCapture(Monster m) throws AlreadyCapturedException, FullTeamException{
        for(Monster n : this.team){
            if(n.getName().equals(m.getName())){
                throw new AlreadyCapturedException(m.getName() + " has already been captured.");
              
            }  else if (this.team.size() > 6){
                throw new FullTeamException(this.getName() + "'s team is already full.");
            }else { 
                team.add(m);
                System.out.printf("%s was successfully captured.", m.getName());
            }

        }
    }
    public void release(Monster m){
        team.remove(m);
        System.out.printf("%s was released from the team.", m.getName());
    }
}
