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
    
} // end of public class
