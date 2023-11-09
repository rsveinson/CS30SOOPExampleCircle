/********************************************************************
 * Programmer:	sveinson
 * Class:  CS30S
 *
 * Assignment: Program Info Exericse
 *
 * Description: creates a program info object to print banners and closing messages
 *              to console, JOptionPane and output file
 ***********************************************************************/

// import libraries as needed here

public class ProgramInfo {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
    private String assignmentName = "";
    
    //*** Construcors ***
    
    /*****************************************
    * Description: create a new ProgramInfo object with the assignment
    *               property set to appropriate value
    * 
    * Interface:
    * 
    * @param        assignmentName  assignment name and number
    * ****************************************/
    public ProgramInfo(String name){
        assignmentName = name;
    } // end initialized constructor
    
    /*****************************************
    * Description: create a new dsefault ProgramInfo object
    * 
    * Interface:
    * none
    * ****************************************/
    public ProgramInfo(){
        
    } // end default constructor
    //*** Getters ***
    
    /*****************************************
    * Description: create and return a string for the program info banner
    * 
    * Interface:
    * 
    * @return bannerOut  string containing the program info banner
    * ****************************************/ 
    public String getBanner(){
        String bannerOut = "";
        
    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		sveinson\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	" + assignmentName + "\n";
    	bannerOut += "*******************************************\n\n"; 
        
        return bannerOut;
    } // end getBanner
    
    /*****************************************
    * Description: create and return a string for the program info banner
    * 
    * Interface:
    * @param assignmentName name of assignment for banner
    * @return bannerOut  string containing the program info banner
    * ****************************************/ 
    public String getBanner(String assignmentName){
        String bannerOut = "";
        
    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		sveinson\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	" + assignmentName + "\n";
    	bannerOut += "*******************************************\n\n"; 
        
        return bannerOut;
    } // end getBanner
    
    /*****************************************
    * Description: create and return a string for the closing message
    * 
    * Interface:
    * 
    * @return closingMessage  string containing the closing message
    * ****************************************/ 
    public String getClosingMessage(){
    	return "end of processing";
    }
    
    //*** Setters ***
    
} // end of public class
