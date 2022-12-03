import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Alex Do
 */
public class FireBall extends Attack
{
    private static String name = "Fire Ball";
    private static int damage = 4;
    private static int speed = 6;
    private IPokemon attacker;
    private boolean enemy;
    private int targetX;
    private int targetY;
    public FireBall(IPokemon attacker, boolean enemy, int targetX, int targetY){
        super(name, damage, speed, attacker, enemy, targetX, targetY);
    }
}
