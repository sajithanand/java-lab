/*  Maintain a list of Strings using ArrayList from collection
framework, perform built-in operations.    (DATE-19/05/2022) */

import java.util.*;
class arrayListOperations{
                           public static void main(String args[]){
                           
                           //create an array list
                           ArrayList<String>al=new ArrayList<String>();
                           
                          System.out.println("Initial size of al:"+al.size());

                          //add elements to the array list
                          al.add("milkybar");
                          al.add("dairymilk");
                          al.add("kitkat");
                          al.add(2,"darkFantasy");
                          al.add(1,"Galaxy");
                          al.add("eclars");
                          al.add("poppins");
                          al.add("Roucher");
                          
                          System.out.println("Size of al after aditions:" +al.size());
                           
                         System.out.println("Contents of al:"+al);

                         //remove elements from the array list

                         al.remove("kitkat");
                         al.remove(1);
                         
                         System.out.println("size of al after deletions:"+al.size());
                         System.out.println("contents of al:"+al);
                          
                   }
                }



/*
OUTPUT

Initial size of al:0
Size of al after aditions:8
Contents of al:[milkybar, Galaxy, dairymilk, darkFantasy, kitkat, eclars, poppins, Roucher]
size of al after deletions:6
contents of al:[milkybar, dairymilk, darkFantasy, eclars, poppins, Roucher]


*/





                          

