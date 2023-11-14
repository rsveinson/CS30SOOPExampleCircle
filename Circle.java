/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: Circle Objecty Example
 *
 * Description: Cirlce class to define the fields and behaviours
 *              of a Circle object
 ***********************************************************************/

// import libraries as needed here

public class Circle {
    //*** Class Variables ***

    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();
    private final double PI = 3.14159;

    //*** Instance Variables ***

    private double radius;

    //*** Constructors ***
    /* a constructor is the only way we
     * can intantiate an object from a clss
     * it does the job of declaring, allocating and
     * instantiating
     */
    //no-arg or default constructor
    // sets the values of the fields to some
    // default value
    public Circle(){
        this.radius = 0.0;
    }// end no-arg

    // initialized or parametered constructor
    // takes values as parameters and assigns
    // values to the fields of the object
    public Circle(double radius){
        this.radius = radius;
    }// end param constructor

    /*****************************************
     * Description: brief description of the methods purpose
     * 
     * Interface:
     * 
     * @param        each parameter of the method should be listed with an @param
     * @param        parametername description of parameter
     * 
     * @return       any return value will be noted here
     * ****************************************/

    //*** Getters ***
    /*****************************************
     * Description: get the radius of the circle
     * 
     * Interface:
     * 
     * @return       double: radius of the circle
     * ****************************************/
    public double getRadius(){
        return this.radius;
    }//end get radius

    //*** Setters ***
    public void setRadius(double r){
        this.radius = r;
    }// end set radius

    // *** utility methods ***

    // calculate diameter
    /*****************************************
     * Description: Calculate the diameter of the circel with radius r
     * 
     * Interface:
     * 
     * @return       diameter of the circle: double
     * ****************************************/
    public double getDiameter(){
        return this.radius * 2;
    }// end diameter

    // calculate circumference
    /*****************************************
     * Description: Calculate the circumference of the circel with radius r
     * 
     * Interface:
     * 
     * @return       circumference of the circle: double
     * ****************************************/
    public double getCircumference(){
        return this.radius * 2 * PI;
    }// end circumference

    // calculate area
    /*****************************************
     * Description: Calculate the area of the circel with radius r
     * 
     * Interface:
     * 
     * @return       area of the circle: double
     * ****************************************/
    public double getArea(){
        return this.radius * this.radius * PI;
    }// end area

    // Overriding methods
    public boolean equals(Circle oc){
        boolean equal;

        equal = this.radius == oc.getRadius();

        return equal;
    }// end equals

    @Override
    public String toString(){
        String st;
        st = "Radius: " + String.format("%8.3f",this.radius) + nl;
        st += "Diameter: " + String.format("%8.3f",this.getDiameter()) + nl;
        st += "Circumference: " + String.format("%8.3f",this.getCircumference()) + nl;
        st += "Area: " + String.format("%8.3f",this.getArea()) + nl;

        return st;
    }// end toString
} // end of public class
