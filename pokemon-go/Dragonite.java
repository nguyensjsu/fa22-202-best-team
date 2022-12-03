import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * @author Alex Do
 */
public class Dragonite extends Pokemon
{
    //Stats for Pokemon
    private static String name = "Dragonite";
    private int level;
    private static int evolutionForm = 2;
    private static int statPreset= 6;
    private static String[] moveSet = {"Fire Ball", "Defend", "Magic Laser", "Purp Blast"};
    
    
    //Misc
    private boolean enemy;
    private static int width = 300;
    private static int height = 300;
    
    public Dragonite(int level, boolean enemy){
        super(name, level, statPreset, moveSet, evolutionForm, width, height, enemy);
    }  
}
