/* Write a user defined exception class to authenticate
the user name and password    (date-13-05-2022)*/

import java.util.*;
class myException extends Exception{
                 public myException(String S){
                    super(S);
                 }
          }

class Main{
                 public static void main(String args[]){
                 String username="anand";
                 String password="password";
                 Scanner ob=new Scanner(System.in);
                 System.out.print("Enter username:");
                 String n=ob.next();
                 System.out.print("Enter password:");
                 String p=ob.next();

                 try{
                 if((n.equals(username)) && (p.equals(password))){
                          throw new myException("Authentication Success");
                 }

                 else{
                           throw new myException("Authentication failed....");
                 }
                 }

                 catch(myException ex){
                        System.out.print(ex.getMessage()+"\n");
                  }
              }
          }
     


/*
OUTPUT

A)
Enter username:anand
Enter password:password
Authentication Success

B)
Enter username:aswin
Enter password:passwor
Authentication failed....

*/
