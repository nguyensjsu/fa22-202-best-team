import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Alex Do
 */
public class MagicLaser extends Attack
{
    private static String name = "Magic Laser";
    private static int damage = 12;
    private static int speed = 5;
    private IPokemon attacker;
    private boolean enemy;
    private int targetX;
    private int targetY;
    public MagicLaser(IPokemon attacker, boolean enemy, int targetX, int targetY){
        super(name, damage, speed, attacker, enemy, targetX, targetY);
        
    }      
}
