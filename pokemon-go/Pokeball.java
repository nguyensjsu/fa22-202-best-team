import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Alex Do
 */
public class Pokeball extends Attack
{
    private static String name = "Pokeball";
    private static int speed = 5;
    private IPokemon attacker;
    private boolean enemy;
    private int targetX;
    private int targetY;
    public Pokeball(IPokemon attacker, int targetX, int targetY){
        super(name, speed, attacker, targetX, targetY);
    }     
}
