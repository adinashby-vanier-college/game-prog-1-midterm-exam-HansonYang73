// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class PigWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pig pig =  new Pig();
        addObject(pig, 291, 207);
        Snake snake =  new Snake();
        addObject(snake, 564, 365);
        Burger burger =  new Burger();
        addObject(burger, 527, 274);
        Burger burger2 =  new Burger();
        addObject(burger2, 450, 335);
        Burger burger3 =  new Burger();
        addObject(burger3, 464, 48);
        Burger burger4 =  new Burger();
        addObject(burger4, 432, 127);
        Burger burger5 =  new Burger();
        addObject(burger5, 207, 50);
        Burger burger6 =  new Burger();
        addObject(burger6, 149, 133);
        Burger burger7 =  new Burger();
        addObject(burger7, 90, 54);
        Burger burger8 =  new Burger();
        addObject(burger8, 58, 277);
        Burger burger9 =  new Burger();
        addObject(burger9, 128, 359);
        pig.setLocation(270, 223);
    }
}
