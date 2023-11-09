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

        // a new line character that works on every computer system

        // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo("Circle Object Example");
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        System.out.println(pInfo.getBanner());
        //fout.print(banner);

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
        System.out.println(circle1.getRadius());
        
        /* logic Challenge:
         * what happens here?
         */
        System.out.println(circle2);

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
