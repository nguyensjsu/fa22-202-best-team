import greenfoot.*;  
/**
 * Write a description of class IDisplayComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IDisplayComponent 
{
    //int x,y;
    public void addSubComponent(IDisplayComponent c);
    public void display(Battle b);
}
