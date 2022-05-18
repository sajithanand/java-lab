/*Find the average of N positive integers, raising a user
defined exception for each negative input.  (date-13-05-2022) */

import java.util.*;
class myException extends Exception{
                            public myException(String S){
                                   super(S);
                        }
                  }

class Main{
                     public static void main(String args[]){
                     Scanner ob=new Scanner(System.in);
                     System.out.println("Enter the number of items:");
                     int a=ob.nextInt();
                        
                     int d;
                     int total=0;
                     int c=0;
  
                     System.out.println("Enter  numbers :");
                     for(int i=0;i<a;i++){
                        d=ob.nextInt();
                   
                      try{
                      if(d>=0){
                       c++;
                       total=total+d;
                       }
                       else{
                       throw new myException("negative numbers not allowed");
                
                       }
                       }
                       catch(myException ex){
                          System.out.println(ex.getMessage()+"\n");
                      }
                       if(d<0)
                       {
                        i--;
                    
                      }
                      }
                  
                      System.out.println("Average of" + c + "positive numbers="+(double)total/c);
                      }
                 }




/*
OUTPUT

Enter the number of items:
4    
Enter  numbers :
10
-10
negative numbers not allowed

10
10
10
Average of4positive numbers=10.0

*/
