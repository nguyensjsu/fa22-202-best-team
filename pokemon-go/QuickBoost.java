import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * @author Alex Do
 */
public class QuickBoost extends StatChange
{
    private static String name = "Quick Boost";
    private static String statType = "spd";
    private IPokemon caster;
    private boolean enemy;

    public QuickBoost(IPokemon caster, boolean enemy){
        super(name, statType, (int)(caster.getSpeed() / 2), caster , enemy); //increase def by 1.5 
    }   
}
