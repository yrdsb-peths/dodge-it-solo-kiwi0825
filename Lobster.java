import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move (-10);
        if (getX() <= 0) {
            resetLobster();
        }
    }
    
    public void resetLobster() {
        int num = Greenfoot.getRandomNumber(4);
        if (num == 0) {
            setLocation(600, 500);
        } else {
            setLocation(600, 600);
        }
    }
}
