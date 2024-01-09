import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

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

public class CircleDriverWithArrayList {
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

        BufferedReader fin = null;      // input buffer

        ArrayList<Circle> circles = new ArrayList<>();

        double radius = 0.0;      // radius read from file

        // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo("Circle Object Example");

        try{
            fin = new BufferedReader(new FileReader("circData.txt"));
        }// end try
        catch(FileNotFoundException e){
            System.out.println("File not found");
            fin = null;
        }// end catch

        //Scanner scanner = new Scanner(System.in);
        // ***** print banners *****

        System.out.println(pInfo.getBanner());

        // ***** Using the Circle Class *****
        Circle c = new Circle(2.1);
        circles.add(c);
        // System.out.println(circles);

        try{
            strin = fin.readLine();
        }// end try
        catch(NullPointerException e){
            System.out.println("Nothing to read here.");
            strin = null;
        }

        while(strin != null){
            //System.out.println(strin);

            // parse input
            radius = Double.parseDouble(strin);

            // create a new circle and add it to the list
            circles.add(new Circle(radius));

            // update the loop control
            strin = fin.readLine();
        }// end eof

        if(fin != null)
            fin.close();

        // print the list
        //System.out.println(circles);

        // System.out.println(c);
        // System.out.println(circles.get(0));

        // a hack to provide multiple references to an arraylist object
        // Circle temp = circles.get(1);
        // System.out.println(temp);
        // System.out.println(circles.get(1));

        // access arraylist objects
        // print the whole list
        // for(Circle circ : circles){
        // System.out.format("Circle: %6d %8.3f%s", circ.getID(), circ.getArea(), nl); 
        // }//end for

        for(int i = 0; i < circles.size(); i++){
            System.out.format("Circle: %6d %8.3f%s", circles.get(i).getID(), circles.get(i).getArea(), nl); 
        }//end for 

        // access individual arraylist elements
        System.out.println(circles.get(2).getID());
        System.out.println(circles.get(2).getRadius());
        circles.get(2).setRadius(1.0);
        System.out.println(circles.get(2).getRadius());

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
