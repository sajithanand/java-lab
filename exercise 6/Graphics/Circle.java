package Graphics;

interface CArea{

                      void area(double r);
                      }

public class Circle implements CArea{
                       
                                 public void area(double r){
                                 System.out.println("Area of circle having \n\nradius="+r);
                                 System.out.println("Area="+(3.14*r*r)+"\n_________________________");
                      }
}
