package Arithematic;

interface Addition{
                   void Result(int a,int b);
                       
                       }
 
public class Add implements Addition{
                                 
                               public void Result(int a,int b){
                                   System.out.println("Added result"); 
                                   System.out.println("Result="+(a+b)+"\n----------------");
                                    
                                  }
                          }
                         
