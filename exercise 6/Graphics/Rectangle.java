package Graphics;

interface RArea{
 
                   void area(int l,int b);
                  }
 
public class Rectangle implements RArea{
                            
                         public void area(int l,int b){
                           System.out.println("Area of rectangle having\n\nlength= "+ l +"\nbreadth= "+ b);
                           System.out.println("\nArea="+(l*b)+"\n_________________________");
                      }
}
                     
