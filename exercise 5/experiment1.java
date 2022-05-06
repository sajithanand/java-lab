/*Create a class ‘Employee’ with data members Empid,
Name, Salary, Address and constructors to initialize the
data members. Create another class ‘Teacher’ that inherit
the properties of class employee and contain its own data
members department, Subjects taught and constructors
to initialize these data members and also include display
function to display all the data members. Use array of
objects to display details of N teachers.       DATE-24/04/2022 */

import java.util.*;
class Employee{
                     int Empid;
                     String Name;
                     double salary;
                     String address;
                     
                    void Employee(int id,String name,double sala,String add)       //constuctor for Employee
                     {
                        Empid=id;
                        Name=name;
                        salary=sala;
                        address=add;
                     }
   }

class Teacher extends Employee{                //creating sub class of teacher from Employee
                             String department;
                             String subject_taught;
                 
                              Teacher(String dpt,String sub,int id,String name,double sala,String add){    //constructor for teacher
                              
                                  department=dpt;
                                  subject_taught=sub;
                                 
                                   Empid=id;
                                   Name=name;
                                   salary=sala;
                                   address=add;
                                }
                    
 
                                 void display(){

		                  System.out.println("Emp id:"+Empid+"\nEmp Name:"+Name+"\nSalary:"+salary+"\nAddress:"+address);
		                  System.out.println("Dep:"+department+"\nSub taught:"+subject_taught);
		                  System.out.println("-------------------------------");
                                 }
                        }

                        class Main{                                           //main class
                                      public static void main(String args[]){
                                      Scanner ob=new Scanner(System.in);
                                      System.out.println("enter the no of teachers:");
                                      int n=ob.nextInt();
   
                                      Teacher [] arr ; //declaring the array of teachers
                                      arr=new Teacher [n] ; 	
                                      int array[]=new int [n] ;
                                      for (int i=0;i<n;i++)
                                      {
                                           System.out.println("Enter the details of " +(i+1) + "th teacher");
                                           
                                            
                                            System.out.print("enter Empid:");
                                            int id=ob.nextInt();
                                          
                                            System.out.print("\nenter emp name:");
                                            String name=ob.next();
     
                                            System.out.print("\nenter emp salary :");
                                            double sala=ob.nextDouble();
                                           
                                            System.out.print("\nenter emp address :");
                                            String add=ob.next();

                                            System.out.print("\nenter emp department :");
                                            String dpt=ob.next();

                                            System.out.print("\nenter Subject_taught :");
                                            String sub=ob.next();
                                       
                                           arr[i]=new Teacher(dpt,sub,id,name,sala,add);

                                            System.out.println("-----------------------------------------------\n");
                                          }
                         
                             for(int j=0;j<n;j++)
                                          {
                                                      System.out.println("************DETAILS OF TEACHER" + (j+1) +"**************");
                
                                                         arr [j].display();
                                          }
}
}
                            

/*
OUTPUT
------------

enter the no of teachers:
3
Enter the details of 1th teacher
enter Empid:123

enter emp name:ALEN

enter emp salary :20000

enter emp address :MUKKAM

enter emp department :MCA

enter Subject_taught :DBMS
-----------------------------------------------

Enter the details of 2th teacher
enter Empid:124

enter emp name:ASWIN

enter emp salary :30000

enter emp address :KODUVALLY

enter emp department :MBA

enter Subject_taught :QT
-----------------------------------------------

Enter the details of 3th teacher
enter Empid:125

enter emp name:SANAN

enter emp salary :40000

enter emp address :TIRUR

enter emp department :EEE

enter Subject_taught :THERMODYNAMICS
-----------------------------------------------

************DETAILS OF TEACHER1**************
Emp id:123
Emp Name:ALEN
Salary:20000.0
Address:MUKKAM
Dep:MCA
Sub taught:DBMS
-------------------------------
************DETAILS OF TEACHER2**************
Emp id:124
Emp Name:ASWIN
Salary:30000.0
Address:KODUVALLY
Dep:MBA
Sub taught:QT
-------------------------------
************DETAILS OF TEACHER3**************
Emp id:125
Emp Name:SANAN
Salary:40000.0
Address:TIRUR
Dep:EEE
Sub taught:THERMODYNAMICS
-------------------------------

*/
