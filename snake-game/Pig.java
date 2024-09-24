// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * Controls the pig using awsd or arrow keys
     * left and right respectively turn the pig left and right
     * up and down respectively moves the pig towards the direction that he is pointing or the opposite direction
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("W")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("A")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("D")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("S")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-5);
        }
    }

    /**
     * When the pig collides with a burger, it eats it and create a sound
     */
    public void eat()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("sounds/eating.wav");
        }
    }

    /**
     * Checking if the pig ate all of the burgers and return true if that's the case
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if ((world.getObjects(Burger.class).isEmpty())) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Changing the world to the Game Won World and playing a winning sound
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
        Greenfoot.playSound("sounds/win.wav");
    }
}
