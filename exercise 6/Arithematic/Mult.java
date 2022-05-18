package Arithematic;

interface Multiplication{

                   void Result(int a,int b);
                  
               }
public class Mult implements Multiplication{
                            
                               public void Result(int a,int b){
 
                               System.out.println("Multiplied Result");
		System.out.println("Result="+(a*b)+"\n----------------");
		
	}

}

 
