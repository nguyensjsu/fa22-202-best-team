import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * This is the second major World class, where 
 * all battles happen when the player enters one from
 * the Scrolling World (map). It keeps track of the bag, 
 * the party, and the trainers that need to inform the ScrollingWorld 
 * class that they're unplayable (they've been beaten). 
 * This game is played in two different modes, Wild and Trainer.
 * These vary by the range of levels that enemy pokemon possess 
 * (wild mode levels are much, much higher, so the user
 * would need to train their party in other battles to 
 * level-up and be able to beat more and more Wild pokemon).
 * 
 * The enemy is defined here, since every battle generates a random one 
 * and it's removed on exit.
 * 
 */
public class Battle extends World
{
    KeyReader keys = new KeyReader();

    public int trainer; // trainer number of the one that you're battling right now
    public ArrayList<Integer> beatenTrainers = new ArrayList<Integer>(); // the trainers that should not trigger battle anymore
    public Pokemon player, enemy;
    public int x, y;
    public boolean wildMode;
    // hashmaps of _item name_ and _item quantity_ are in a list (to hold multiple name-quantity pairs), and there are multiple such lists for each category of items
    public ArrayList<HashMap<String, Integer>> bag = new ArrayList<HashMap<String, Integer>>();
    /// keeps track of current party of pokemon objects
    public ArrayList<Pokemon> party = new ArrayList<Pokemon>();

    //Basically, turn 0 is when the player can attack. Turn 1 is when the enemy is attacking. Once the person clicks the button for the attack, turn 0 is updated to 1. Then the opponent will attack and turn set it back to turn 0;
    private int turn = 0; 

    public Battle(ArrayList<Integer> beatenTrainers, int trainer, int x, int y, boolean wildMode, ArrayList<HashMap<String, Integer>> bag, ArrayList<Pokemon> party)
    {    
    }

    public void goToMenu() {
         }

    public ArrayList<HashMap<String, Integer>> getBag() {
        return bag;
    }

    public void setBag(ArrayList<HashMap<String, Integer>> bag) {
        this.bag = bag;
    }

    public ArrayList<Pokemon> getParty() {
        return party;
    }

    public void setParty(ArrayList<Pokemon> party) {
        this.party = party;
    }

    public Pokemon makeRandomPokemon() { // give them variable stats?
    }

    public void capturePokemon(Pokemon captured){
        party.add(captured);
        removeObject(captured);
    }

    public KeyReader getKeys() {
        return keys;
    }

    public void setTurn(int turn){
        this.turn = turn;
    }

    public int getTurn(){
        return turn;
    }
}
