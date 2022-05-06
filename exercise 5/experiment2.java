/*  Create a class ‘Person’ with data members Name, Gender, Address, Age and a
constructor to initialize the data members and another class ‘Employee’ that inherits
the properties of class Person and also contains its own data members like Empid,
Company_name, Qualification, Salary and its own constructor. Create another class
‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and also contain constructors and
methods to display the data members. Use array of objects to display details of N
teachers.        DATE-26/04/2022
*/

import java.util.*;
class Person{        							//creating super class of person
                    String Name;
                    String Gender;
                     int Age;
                     String Address;
                  
                   Person(String name,String gen,int age,String add)                              //constructor for person
                   {
                    Name=name;
                    Gender=gen;
                    Age=age;
                    Address=add;
                   }
         }
 
class Employee extends Person{ 					//creating class Employee tha inherits from Person
 
                        int Empid;
                        String company_name;
                        String Qualification;
                        double salary;

                        Employee(String name,String gen,int age,String add,int id,String cname,String qua,double sala){    //constructor for Employee
                         super(name,gen,age,add);    
                                
                          Empid=id;
                          company_name=cname;
                          Qualification=qua;
                          salary=sala;
                         }
                 }
 
class Teacher extends Employee{                   //creating class teacher that inherits from Employee
                         String subject;
                         String department;
                         int T_id;
             
                          Teacher(String name,String gen,int age,String add,int id,String cname,String qua,double sala,String sub,String dpt,int Tid)
                           {
                            super(name,gen,age,add,id,cname,qua,sala);
                            
                            subject=sub;
                            department=dpt;
                            T_id=Tid;
                           }
                          
                           void display(){
                                  System.out.println("\nName:" + super.Name + "\nGender:" + super.Gender + "\nAge:" + super.Age + "\nAddress:" + super.Address);

                                  System.out.println("\nEmp id:" + super.Empid + "\nCompany name:" + super.company_name + "\nqualification:" + super.Qualification+ "\nsalary:" + super.salary);

                                 System.out.println("\nTeachers id:" + T_id + "\nDepartment:" + department + "\nsubject:" + subject );
                   
                                System.out.println("-----------------------------------------------------------------------------");

                               }
                   }
 
class Main{      //main class
                        public static void main(String args[]){   //main method
           		Scanner ob=new Scanner(System.in);
           		System.out.print("Enter the no of teachers:");
          		int n=ob.nextInt();
         		 //Declaring an array of teacher

          		Teacher[] arr=new Teacher[n];  //allocating memory for n objects of type Teacher

         		 for(int i=0;i<n;i++)
          		{
                           System.out.println("\nEnter the details of teacher - " +(i+1));    //entering details of all data members using for loop
                     
                         System.out.println("-----------------------------------------------------------------------------");
              
                         System.out.print("\nEnter name:");
                         String name=ob.next();
 
                         System.out.print("\nEnter gender:");
                         String gen=ob.next();

                          System.out.print("\nEnter age:");
                          int age=ob.nextInt();

                          System.out.print("\nEnter address:");
                          String add=ob.next();

                          System.out.print("\nEnter employee department:");
                          String dpt=ob.next();

                          System.out.print("\nEnter company name:");
                          String cname=ob.next();

                           System.out.print("\nEnter employee id:");
                           int id=ob.nextInt();
                          

                          System.out.print("\nEnter Qualification:");
                          String qua=ob.next();

                          System.out.print("\nEnter salary:");
                          double sala=ob.nextDouble();

                           System.out.print("\nEnter teacher ID:");
                           int Tid=ob.nextInt();

                          
                           System.out.print("\nEnter subject:");
                           String sub=ob.next();

                           arr[i]=new Teacher(name,gen,age,add,id,cname,qua,sala,sub,dpt,Tid);       //calling constructor of teacher class and passing parameters
      
                            System.out.print("--------------------------\n"); 
                         
                            }

                            for(int j=0;j<n;j++)
                            {
                             System.out.println("**********DETAILS OF TEACHER**********" +(j+1) +"******");
                            
                              arr[j].display();
                             
                               }
                          }
                   }



/*
OUPUT
-----------

Enter the no of teachers:2

Enter the details of teacher - 1
-----------------------------------------------------------------------------

Enter name:sanan

Enter gender:male 

Enter age:25

Enter address:tirur

Enter employee department:EE

Enter company name:wipro

Enter employee id:44

Enter Qualification:Mtech

Enter salary:20000

Enter teacher ID:12

Enter subject:DBMS
--------------------------

Enter the details of teacher - 2
-----------------------------------------------------------------------------

Enter name:junaid

Enter gender:male

Enter age:44

Enter address:kuttipuram

Enter employee department:mba

Enter company name:tcs

Enter employee id:33

Enter Qualification:mca

Enter salary:40000

Enter teacher ID:44

Enter subject:python
--------------------------
**********DETAILS OF TEACHER**********1******

Name:sanan
Gender:male
Age:25
Address:tirur

Emp id:44
Company name:wipro
qualification:Mtech
salary:20000.0

Teachers id:12
Department:EE
subject:DBMS
-----------------------------------------------------------------------------
**********DETAILS OF TEACHER**********2******

Name:junaid
Gender:male
Age:44
Address:kuttipuram

Emp id:33
Company name:tcs
qualification:mca
salary:40000.0

Teachers id:44
Department:mba
subject:python
-----------------------------------------------------------------------------

*/











          
                                  
                            




