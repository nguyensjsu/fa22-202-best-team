import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor
{
    /**
     * Act - do whatever the Health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 50;
    int healthBarWidth = 200;
    int healthBarHeight = 10;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;
    public Health(){
        update();
    }
    public void act()
    {
        // Add your action code here.
        update();
        while(health > 0){
            looseHealth();
            Greenfoot.delay(10);
        }
    }
    public void update(){
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage bar = getImage();
        bar.setColor(Color.BLACK);
        bar.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        bar.setColor(Color.RED);
        bar.fillRect(1, 1, health*pixelsPerHealthPoint, healthBarHeight);
    }
    public void looseHealth(){
        health--;
        update();
    }
}
