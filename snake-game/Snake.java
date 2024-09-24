// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * Moves the snake around in a random pattern and makes sure that it doesn't get stuck at the border
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * When the snake collides with the pig, the pig disappear
     */
    public void eat()
    {
        Actor pig = getOneIntersectingObject(Pig.class);
        if (pig != null) {
            World world = getWorld();
            world.removeObject(pig);
        }
    }

    /**
     * Checking if the pig is dead and return true if that's the case
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if ((world.getObjects(Pig.class).isEmpty())) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Changing the world to the Game Over World and playing a losing sound
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
        Greenfoot.playSound("sounds/lose.wav");
    }
}
