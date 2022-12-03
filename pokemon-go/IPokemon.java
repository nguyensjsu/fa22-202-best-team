import greenfoot.Actor;

public abstract class IPokemon extends Actor{ 
    abstract void init();
    abstract void makeBattleTag();
    abstract void removeBattleTag();
    abstract void die();
   
    abstract void statCalculation();
    abstract void evolution();
    abstract void getHit(int x, boolean y);
    abstract int getFutureHealth(int x);

    abstract int getHealth();
    abstract int getCurHealth();
    abstract int getAttack();
    abstract int getDefense();
    abstract int getSpeed();

    abstract int getLevel();
    abstract String getName();
    abstract String[] getMoveSet();
    abstract boolean getEnemy();
    abstract int getEvolutionForm();
    abstract void lowerHealth(int x);
    abstract void healthChange(int x);
    abstract void attackChange(int x);
    abstract void defenseChange(int x);
    abstract void speedChange(int x);
    abstract void enemyMove();
    abstract void move(String x);
    abstract void useItem(String x, boolean u);
    abstract void tagView(int x, int y, int z);
    abstract void battleView();
    abstract GifImage getAnimation();
    abstract void setTag(PartyTag x);
    abstract void flip();
    abstract void addToParty();

}