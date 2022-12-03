import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class gives functionality to all moves, such as changing
 * the turn once it is over, and creating a description based on the move
 * for a few seconds. 
 * 
 */
public class Move extends Actor
{
    boolean init = true;
    private String name;
    ItemDescription mvDescObj;
    GifImage image;

    private int width = 150;
    private int height = 150;
    boolean enemy;
    String attacker;

    public Move(String name, boolean enemy){
        this.name = name;
        this.enemy = enemy;
        image = new GifImage(name + ".gif"); 
        image.resizeImages(image.getCurrentImage().getWidth()/2, image.getCurrentImage().getHeight()/2); // set the size for the entire gif to be a half of the original's size
        if(enemy) 
            image.flipImages(); //flip the image depending on whether it is an enemy or not enemy using it
    }

    /**
     * Act - do whatever the Move wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        init();
        setImage(image.getCurrentImage());
    }    

    private void init() {
        if(init) {
            init = false;
            ///////
            if(enemy)
                attacker = "The foe";
            else
                attacker = ((Battle)getWorld()).player.getName();
            // when any kind of move is used by a pokemon, the button menu disappears at first
            getWorld().removeObjects(getWorld().getObjects(Button.class));
            if(!name.equals("Pokeball"))
                addMoveDescription();
        }
    }

    public void changeTurn(){
        if(!enemy){
            ((Battle)getWorld()).setTurn(1);
        } else {
            ((Battle)getWorld()).setTurn(0);
        }
    }

    public void addMoveDescription() {
        // 'move description image' image
        GreenfootImage mvDescImg = new GreenfootImage("MoveDescriptionBlank.png");
        mvDescImg.setColor(Color.BLACK);
        mvDescImg.setFont(new Font("Dialog",  30));
        mvDescImg.drawString(attacker + " used " + name + ".", 60, 70);
        mvDescObj = new ItemDescription();
        mvDescObj.setImage(mvDescImg);

        getWorld().addObject(mvDescObj, 400, 600 - mvDescObj.getImage().getHeight()/2);
    }
}
