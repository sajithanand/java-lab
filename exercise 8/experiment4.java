/*Program to demonstrate the creation of queue object using the PriorityQueue class  DATE--25/05/2022  */

import java.util.*;
class PriorityQDemo{
                    
                           public static void main(String args[]){
                        PriorityQueue<String>queue=new PriorityQueue<String>();
       
                              //adding elements to Priority queue

                              queue.add("midhun");
                              queue.add("abin");
                              queue.add("sanan");
                              queue.add("aswin");
                              queue.add("jithu");
                              queue.add("anand");
                                     
                             System.out.println("head:"+queue.element());
                             System.out.println("head:"+queue.peek());
                              System.out.println("iterating the queue elements:");
                              
                             //iterating the elements
                             Iterator<String>itr=queue.iterator();
                             while(itr.hasNext()){
                                   System.out.println(itr.next());
                            }
                }
  }
   
/*
OUTPUT

head:abin
head:abin
iterating the queue elements:
abin
aswin
anand
midhun
jithu
sanan

*/ 
                                                             
