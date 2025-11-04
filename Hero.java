import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    // This moves the bear from top to bottom every time anything is clicked
    boolean atTop = true;
    
    public void act()
    {
        
        if (Greenfoot.mouseClicked(null)) {
            atTop = !atTop;
        }
        
        if (atTop) {
            setLocation(100, 100);
        } else {
            setLocation (100, 300);
        }
    }
}
