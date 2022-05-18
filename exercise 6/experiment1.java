/* Create interfaces Student and Sports. Create
a class Result implements Student and Sports.
Display the academic and sports score of a
student. (DATE-6/04/2022) */

import java.util.*;
interface Student{
                      int Score=10;
                      void displayScore();
                      }
 
interface Sports{
                       int Score=20;
                       void displaySportsScore();
                       }

class Result implements  Student,Sports{
                                     
                                    public void displayScore(){
                                    System.out.println("Academic Score="+Student.Score);
                                    }
 
                                   public void displaySportsScore(){
                                   System.out.println("Sports Score="+Sports.Score);
                                   }
}

class SportsStudent{
                            public static void main(String args[]){
                            Result  r=new Result();
                            r.displayScore();
                            r.displaySportsScore();
                           
                   }
          }


/*
OUTPUT
-----------------------------------
Academic Score=10
Sports Score=20

*/



             
