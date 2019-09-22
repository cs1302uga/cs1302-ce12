package cs1302.ce12;

/**
 * Driver program for cs1302 class exercise 12 using various types of
 * container objects.
 *
 * @author Brad Barnes and Supa' Mike
 * @version 1.0
 */

public class Driver {

    /**
     * Creates objects for each type of container to check basic functionality.
     */
    public static void main(String[] args) {

        //Declare objects of all of our container types
        StringContainer sc = new StringContainer("I wish I had a next reference");
        DoubleContainer dc = new DoubleContainer(4.5);
        IntegerContainer ic = new IntegerContainer(7);
        BooleanContainer bc = new BooleanContainer(true);

        //Print the contents of each container
        System.out.println(sc.get());
        System.out.println(dc.get());
        System.out.println(ic.get());
        System.out.println(bc.get());

    } // main

} // Driver
