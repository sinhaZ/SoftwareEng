package myfancyjavaproject;

/**
 *
 * @author sinha
 */
class Fancy{
    public void display(){
        System.out.println("Fancy Project....");
    }
}
class Fancy2{
    public void display(){
        System.out.println("Fancy Project 2...");
    }
}

public class MyFancyJavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Fancy f = new Fancy();        
        f.display();
        
        Fancy2 f2 = new Fancy2();        
        f2.display();
        
        
    }
    
}
