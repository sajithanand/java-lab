//create CPU with attribute price.create inner class processor and static nested class RAM.Create an object of Cpu and print information of processor and RAm

import java.util.*;
 class CPU{
            double price=3200;
            void display(){
                               System.out.println("CPU DETAILS\n\ncpu price is:"+price);
                               Processor p=new Processor();
                               Ram r=new Ram();
             }

class Processor{
                       
                         int coreNo=10;
                          String manufacter="intel";
                          Processor(){
                                            System.out.println("\nProcessor");
                                            System.out.println("number of cores ="+coreNo+"\nManufacture:"+manufacter);
                          }
                          }

static class  Ram{
                         int memory=8;
                         String manufacture="Hyper x";
                         Ram(){
                                       System.out.println("\nRam");
                                       System.out.println("memory="+memory+"\nManufacture:"+manufacture);
                            }
            }
             public static void main(String args[]){
                         CPU cpu=new CPU();
                         cpu.display();
           }
}


/*
OUTPUT

-------------------
CPU DETAILS

cpu price is:3200.0

Processor
number of cores =10
Manufacture:intel

Ram
memory=8
Manufacture:Hyper x

*/

