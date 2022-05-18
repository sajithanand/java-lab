package Graphics;

interface  TArea{
              
                        void area(int b,int h);
                       }

public class Triangle implements TArea{
                           
                            public void area(int b,int h){
                                          
                                System.out.println("Area of triangle having\n\nbase="+b+"\nheight="+h);
                                System.out.println("\nArea="+(0.5*b*h)+"\n_________________________");
                     
                     }
     }
