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
 *  @author Alina Kravchenko
 */
public class Battle extends World implements IDisplayComponent
{
    KeyReader keys = new KeyReader();

    public int trainer; // trainer number of the one that you're battling right now
    public ArrayList<Integer> beatenTrainers = new ArrayList<Integer>(); // the trainers that should not trigger battle anymore
    public IPokemon player, enemy;
    public int x, y;
    public boolean wildMode;
    // hashmaps of _item name_ and _item quantity_ are in a list (to hold multiple name-quantity pairs), and there are multiple such lists for each category of items
    public ArrayList<HashMap<String, Integer>> bag = new ArrayList<HashMap<String, Integer>>();
    /// keeps track of current party of pokemon objects
    public ArrayList<IPokemon> party = new ArrayList<IPokemon>();

    //Basically, turn 0 is when the player can attack. Turn 1 is when the enemy is attacking. Once the person clicks the button for the attack, turn 0 is updated to 1. Then the opponent will attack and turn set it back to turn 0;
    private int turn = 0; 
    
    private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>() ;
    
    public void addSubComponent( IDisplayComponent c )
    {
        components.add( c ) ;
    }
    public void display(Battle b){
        for (IDisplayComponent c : components )
        {         
           c.display(b);
        }
    }  

    public Battle(ArrayList<Integer> beatenTrainers, int trainer, int x, int y, boolean wildMode, ArrayList<HashMap<String, Integer>> bag, ArrayList<IPokemon> party)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setBackground(new GreenfootImage("battleScreen.png"));

        this.x = x;
        this.y = y;
        this.wildMode = wildMode;
        this.trainer = trainer;
        this.beatenTrainers = beatenTrainers;
        this.bag = bag;
        this.party = party;

        // keyboard reader
        addObject(keys, 0, 0);

        // create and add player and enemy to battle
        player = party.get(0);
        enemy = makeRandomPokemon(); // enemy should be chosen at random
                      
        
        addObject(enemy, 0, 0);
        addObject(player, 0, 0); // add player to world
        player.battleView(); // you cannot setlocation in the constructor itself, so put pokemon into battleview when they're made here
        enemy.battleView();
        

        goToMenu();
    }

    public void goToMenu() {
        ArrayList<Button> buttons = new ArrayList<Button>();
        
        FightButton fightButton = new FightButton();
        PokemonButton pokemonButton = new PokemonButton();
        BagButton bagButton = new BagButton();
        RunButton runButton = new RunButton();    
        
        // Creating composite pattern for buttons
        addSubComponent(fightButton);
        addSubComponent(pokemonButton);
        addSubComponent(bagButton);
        addSubComponent(runButton);
        
        display(this);      
        
        buttons.add(fightButton);
        buttons.add(pokemonButton);
        buttons.add(bagButton);
        buttons.add(runButton);
        
        addObject(new Selection(buttons, true, buttons.get(0)), buttons.get(0).quadrants[0][0], buttons.get(0).quadrants[0][1]);
    }

    public ArrayList<HashMap<String, Integer>> getBag() {
        return bag;
    }

    public void setBag(ArrayList<HashMap<String, Integer>> bag) {
        this.bag = bag;
    }

    public ArrayList<IPokemon> getParty() {
        return party;
    }

    public void setParty(ArrayList<IPokemon> party) {
        this.party = party;
    }

    public IPokemon makeRandomPokemon() { // give them variable stats?
        int max = 15;
        int min = 0;
        int randInd = (int)(Math.random()*(max - min + 1) + min); // generate random index out of the above array (min = 0, max = 5)
        int level = 0;
        if(wildMode){
            max = 15;
            min = 1;
            level = (int)(Math.random()*(max - min + 1) + min);
        } else {
            max = 30;
            min = 10;
            level = (int)(Math.random()*(max - min + 1) + min);
        }
        PokemonFactory k = new PokemonFactory();
        return k.getPokemon(randInd, level);
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
