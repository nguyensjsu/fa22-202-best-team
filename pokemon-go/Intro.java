import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Intro extends World
{
   
    boolean init;

    //reads keys pressed
    KeyReader keys = new KeyReader();

    // bag and party of the player's game session
    ArrayList<HashMap<String, Integer>> bag = new ArrayList<HashMap<String, Integer>>();
    ArrayList<Pokemon> party = new ArrayList<Pokemon>();

    GreenfootSound song;
    //counts screen number
    int screenCounter = 0;
    int cooldownCount = 0;
    int cooldown = 10;
    //x = -800, y = 600
    //constructor sets the first screen image 
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(keys, 0, 0);

        //set first screen to background
        setBackground(new GreenfootImage("IntroScreen0.png"));
        getBackground().scale(800, 600);

        // set initial variables of the game
        bag = makeBag();
        party = makeParty();
    }

    public void act() { 
        //do in the first act
       
    }

    public ArrayList<HashMap<String, Integer>> makeBag() {

        //// defining objects in bag///////
        /*
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
         */

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        bag.add(map);
        map = new HashMap<String, Integer>(); // old map will still change in arraylist if changed after it was added, so make new map
        bag.add(map);
        map = new HashMap<String, Integer>();
        map.put("Pokeball", 3);
        bag.add(map);
        map = new HashMap<String, Integer>();
        bag.add(map);
        map = new HashMap<String, Integer>();
        bag.add(map);
        map = new HashMap<String, Integer>();
        bag.add(map);
        map = new HashMap<String, Integer>();
        bag.add(map);
        map = new HashMap<String, Integer>();
        bag.add(map);
        /*
        map.put("a", 3);
        map.put("b", 2);
        map.put("c", 1);
         */

        /*
        map.put("b", 1);
        map.put("c", 3);
         */

        ///////////
        return bag;
    }

    public ArrayList<Pokemon> makeParty() {
        //// add 3 random pokemon to the player's party
        for(int i = 0; i < 3; i++)
            party.add(makeRandomPokemon());

        return party;
    }

    public Pokemon makeRandomPokemon() {
        
    }// give them variable stats?
      
}
