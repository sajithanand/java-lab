/* Program to demonstrate the addition and deletion of elements in deque      DATE--27/05/2022 */

import java.util.*;
class deque  {
          public static void main(String args[]){

          Deque<String>dq=new ArrayDeque<String>();

          //addding elements to deque
          dq.add("zebra");
          dq.add("elephant");
          dq.add("ant");
          dq.add("cheetah");
          dq.add("tiger");
          dq.add("lion");
          dq.add("Jiraff");

           System.out.println("\n  size of deque after addition:"+dq.size());
           System.out.println("\n elements in deque after addition: "+dq);
           
         //removing 3 elements from deque
         dq.remove();
         dq.remove("ant");
         dq.remove("cheetah");
         
         System.out.println("\n  deque after removing 3 elements:"+dq);

          //removing  remaining elements from deque
          dq.remove(3);
          dq.remove("Jiraff");
          dq.remove("lion");

          
           System.out.println("\n  elements in deque after removing elements:"+dq);
           System.out.println("\n  size of deque after removal of elements:"+dq.size());

          
 
         }
}



/*
OUTPUT

size of deque after addition:7

elements in deque after addition: [zebra, elephant, ant, cheetah, tiger, lion, Jiraff]

deque after removing 3 elements:[elephant, tiger, lion, Jiraff]

elements in deque after removing elements:[elephant, tiger]

size of deque after removal of elements:2

*/



          

         

