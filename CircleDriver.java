import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Circle Objecty Example
 * 
 *  Description:    Example of a simple Circle class
 *                  and using it to intatiate Circle objects
 * 
 *************************************************************/

public class CircleDriver {
    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();
    final static String delim = "[ ]+";          // delimiter for splitting input records

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String[] tokens = null;         // used to split input records

        // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo("Circle Object Example");
        
        //Scanner scanner = new Scanner(System.in);
        // ***** print banners *****

        System.out.println(pInfo.getBanner());

        // ***** Using the Circle Class *****
        
        /* create/instantiate a couple of circle objects
         * note the difference between the no-arg and parameterd
         * instantiation
         */
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4.5);
        
        // can i access the object's field?
        //System.out.println(circle1.radius);
        //circle1.radius = 2.34;
        
        // use getters and setters
        circle1.setRadius(2.5);
        System.out.println(circle1.getRadius());
        
        // test out the utility methods
        double diameter = circle2.getDiameter();
        System.out.println(diameter);
        
        circle1.setRadius(2.75);
        double circumference = circle1.getCircumference();
        System.out.format("%8.3f%s", circumference, nl);
        
        System.out.format("%8.3f%s", circle2.getArea(), nl);
        
        // use .equals() and toString()
        boolean equalCircles = circle1.equals(circle2);
        System.out.println("Circle 1 == Circle 2 is " + equalCircles);
        
        circle1.setRadius(circle2.getRadius());
        equalCircles = circle1.equals(circle2);
        System.out.println("Circle 1 == Circle 2 is " + equalCircles);
        
        // use toSTring()
        System.out.println(circle1.toString());
        System.out.println();
        System.out.println(circle2);
        
        /* logic Challenge:
         * what happens here?
         */
        //System.out.println(circle2);

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate
