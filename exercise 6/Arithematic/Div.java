package Arithematic;

interface Division{
     
                    void Result(int a,int b);
                    }

public class Div implements Division{

                                   double d=0;
                                    
                   public void Result(int a,int b){
                           d= (double)a/b;
		           System.out.println("Division Result");
		           System.out.println("Result="+(d)+"\n----------------");
                   }
}		


