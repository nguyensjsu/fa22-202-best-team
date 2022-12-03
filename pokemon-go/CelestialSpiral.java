import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Alex Do
 */
public class CelestialSpiral extends Attack
{
    private static String name = "Celestial Spiral";
    private static int damage = 7;
    private static int speed = 3;
    private IPokemon attacker;
    private boolean enemy;
    private int targetX;
    private int targetY;
    public CelestialSpiral(IPokemon attacker, boolean enemy, int targetX, int targetY){
        super(name, damage, speed, attacker, enemy, targetX, targetY);
    }     
}
