/* Write a program has classes Publisher, Book, Literature and Fiction. Read the
information and print the details of books from either the category, using
inheritance
Class Publisher- Attribute PublisherName, Method display()
Class Book subclass of Publisher- Attribute- Title, Author, Method display()
Class Literature subclass of Book-Attribute-type, Method display()
Class Fiction subclass of Book-Attribute-genre, Method display()    DATE-30/04/2022 */

import java.util.*;
class Publisher{
                        String Pname;
                    
                         Publisher(String p)
                         {
                          Pname=p;
                         }

                         void display()
                         {
                          System.out.println("publisher name:" + Pname);
                          }
                      }
 
class Book extends Publisher{
   
                                String Title;
                                String Author;
                     
                                Book(String p,String T,String A)
                                {
                                 super( p);
                                 Title=T;
                                 Author=A;
                                 }

                                 void display(){
                                 super.display();
                                 System.out.println("Book title:" +Title);
                                 System.out.println("Author:" +Author);
                                 }
                            }

class Literature extends  Book{
                                   String Type;

                                   Literature(String p,String T,String A,String type)
                                   {
                                    super(p,T,A);
                                    Type=type;
                                   }

                                    void display(){
                                    super.display();
                                    System.out.println("Type:" +Type);
                                     }
                            }

class Fiction extends Book{
                                     String genre;
                                    
                                     Fiction(String p,String T,String A,String gen)
                                     {
                                      super(p,T,A); 
                                      genre=gen;
                                     }
                                      
                                      void display(){
                                      super.display();
                                      System.out.println("Genre:" +genre);
                                     }
                               }

class Main{
                              
                             public static void main(String args[]){
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the no of literate books:");
                             int n=sc.nextInt();
                              
                            Literature [] arr= new Literature[n];
		
		            System.out.println("Enter details of litrate books:");
		             for(int i=0;i<n;i++){
			     System.out.print("Book-"+(i+1));	
			     System.out.print("\nEnter Pub_name:");
			     String p=sc.next();
			
			    System.out.print("Enter Title:");
			    String T=sc.next();
			
			     System.out.print("Enter Author:");
			     String A=sc.next();

			     System.out.print("Enter Type:");
			     String type=sc.next();

			     arr[i] =new Literature(p,T,A,type);

                          }
                      
                             System.out.println("\n-----------------------------------------------------------------------");

                             
	                     System.out.println("Enter the no of fiction books:");
                             int m=sc.nextInt();
                              
                            Fiction [] arr1= new Fiction[m];
		
		            System.out.println("Enter details of fiction books:");
		             for(int i=0;i<n;i++){
			     System.out.print("Book-"+(i+1));	
			     System.out.print("\nEnter Pub_name:");
			     String p=sc.next();
			
			    System.out.print("Enter Title:");
			    String T=sc.next();
			
			     System.out.print("Enter Author:");
			     String A=sc.next();

                             System.out.print("Enter genre:");
			     String gen=sc.next();


			     arr1[i] =new Fiction(p,T,A,gen);

                          }

                           do{
					System.out.println("\n1.literature\n2.Fiction \n3.exit");
					System.out.println("Select your option: ");
					int opt =sc.nextInt();
					
					System.out.println("-----------------------\n");
					
					switch(opt){
						case 1:System.out.println("litratuere books\n");
							   for(int i=0;i<n;i++)
								{
									System.out.println("BOOK "+(i+1));
									arr[i].display();

								}
							   
								break;
						case 2:System.out.println("Fiction books\n");
								for(int i=0;i<m;i++)
								{
									System.out.println("BOOK "+(i+1));
									arr1[i].display();

								}
								break;
						default: System.out.println("Exiting....!");
								System.exit(0);
								break;
								
					
					
					}
					
					
			
			
			
			}while(true);






	}


}

/*
OUTPUT

Enter the no of literate books:
2
Enter details of litrate books:
Book-1
Enter Pub_name:martin
Enter Title:wings
Enter Author:aswin
Enter Type:dc
Book-2
Enter Pub_name:joseph
Enter Title:fire
Enter Author:alen
Enter Type:mok

-----------------------------------------------------------------------
Enter the no of fiction books:
2
Enter details of fiction books:
Book-1
Enter Pub_name:agustin
Enter Title:kings
Enter Author:sanan
Enter genre:fiction
Book-2
Enter Pub_name:junaid
Enter Title:alchemist
Enter Author:paulo
Enter genre:scifi

1.literature
2.Fiction 
3.exit
Select your option: 
1
-----------------------

litratuere books

BOOK 1
publisher name:martin
Book title:wings
Author:aswin
Type:dc
BOOK 2
publisher name:joseph
Book title:fire
Author:alen
Type:mok

1.literature
2.Fiction 
3.exit
Select your option: 
2
-----------------------

Fiction books

BOOK 1
publisher name:agustin
Book title:kings
Author:sanan
Genre:fiction
BOOK 2
publisher name:junaid
Book title:alchemist
Author:paulo
Genre:scifi

1.literature
2.Fiction 
3.exit
Select your option: 
3
-----------------------

Exiting....!

*/
                      

