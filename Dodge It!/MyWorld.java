import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @Noah
 * @version (a version number or a date)
 * @V1, 14/4/2026
 * hi
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Hero h = new Hero();
        addObject(h, 100, 200);
        
        FeetLover feet = new FeetLover();
        addObject(feet, 600, 100);
    }
}
