/* Program to demonstrate the creation of Set object using the LinkedHashset class    DATE--27/05/2022*/

import java.util.*;
 class LinkedHashSetDemo{
             public static void main(String args[]){
                 LinkedHashSet<String>set=new LinkedHashSet<String>();
  
                //creating set objects using LinkedHashset
                set.add("manu");
                set.add("Vijay");
                set.add("manu");
                set.add("Ajay");
               set.add("sugu");
               set.add("ramanan");
               set.add("sugu");
               set.add("ramu"); 
               
                System.out.println("\n size of set after adittion of objects:"+set.size());
                 
               System.out.println("\n objects of set after adittion :"+set); 

		 System.out.println("\n objects of the set after iteration:");
               Iterator<String> itr=set.iterator();
                while(itr.hasNext()){

               System.out.println(itr.next());

             }
}


}



/*
OUTPUT
------------------------------------------------------------------------------------------------------------------------------------
 size of set after adittion of objects:6

 objects of set after adittion :[manu, Vijay, Ajay, sugu, ramanan, ramu]

 objects of the set after iteration:
manu
Vijay
Ajay
sugu
ramanan
ramu
------------------------------------------------------------------------------------------------------------------------------------

*/


