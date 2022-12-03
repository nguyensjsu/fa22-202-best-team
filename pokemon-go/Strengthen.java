import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * @author Alex Do
 */
public class Strengthen extends StatChange
{
    private static String name = "Strengthen";
    private static String statType = "att";
    private IPokemon caster;
    private boolean enemy;
    
    public Strengthen(IPokemon caster, boolean enemy){
        super(name, statType, (int)(caster.getAttack() / 2), caster , enemy); //increase attack by 1.5 
    } 
}
