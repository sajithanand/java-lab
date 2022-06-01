/* Program to remove an object from the Stack when the position is passed as parameter   DATE--24/05/2022 */

import java.util.*;
class StackDemo{
                  public static void main(String args[]){
  
                  Stack<String>stack=new Stack<String>();

                  //creating stack by adding elements
                  stack.push("BMW");
                   stack.push("JAGUAR"); 
                   stack.push("FERRARI");
                   stack.push("LAMBORGINI");
                   stack.push("FORD");
                   stack.push("ALTO");

                   System.out.println("original contents in the stack is:"+stack);
                   System.out.println("size of stack:"+stack.size());

                  System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------\n");
                 
                  //removing elements from the stack
                  stack.removeElementAt(2);
                  System.out.println("contents in stack after removing element @ index position 2:"+stack);
                   
                  }
      }

/*
OUTPUT

original contents in the stack is:[BMW, JAGUAR, FERRARI, LAMBORGINI, FORD, ALTO]

size of stack:6
--------------------------------------------------------------------------------------------------------------------------------------------------------------

contents in stack after removing element @ index position 2:[BMW, JAGUAR, LAMBORGINI, FORD, ALTO]


*/
