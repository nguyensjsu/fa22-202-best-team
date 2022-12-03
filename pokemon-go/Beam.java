import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Alex Do
 */
public class Beam extends Attack
{
    private static String name = "Beam";
    private static int damage = 4;
    private static int speed = 5;
    private IPokemon attacker;
    private boolean enemy;
    private int targetX;
    private int targetY;
    public Beam(IPokemon attacker, boolean enemy, int targetX, int targetY){
        super(name, damage, speed, attacker, enemy, targetX, targetY);
        
    }     
}
