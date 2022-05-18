package Graphics;

interface SArea{
 
                   void area(int a);
                             
                   }

public class Square implements SArea{
 
                              public void area(int a){
                                System.out.println("Area of square having\n\nside="+a);
                                System.out.println("Area="+(a*a));
                     
 
                   }
}
