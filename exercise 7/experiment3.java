import java.util.*;
class mult extends Thread{

	public void run(){
		super.run();
		
		//System.out.println("multiplication table of 5");
		try{
			for(int i=1;i<10;i++){
		
			System.out.println(i+" * 5 = "+(5*i)+"\n");
			Thread.sleep(2000);
								
			}
		
		
		}
		catch(Exception e){
			System.out.println("thread interepted");
		
		}
	}

}






class prime extends Thread{

	int p;
	prime(int p){
		this.p=p;
	
	}
	public void run(){
		super.run();
		
		//System.out.println("Prime numbers between 1 to "+p+"\n");
		boolean x;
		
		try{
			for(int i=2;i<p;i++){
					x=true;
				for(int j=2;j<=i/2;j++){
							
					if(i%j==0){
						x=false;
						
					}
				}
				if(x){
				System.out.println("prime - "+i+"\n");
				}
				
			Thread.sleep(1000);
									
			}
		
		
	//System.out.println("\n");
		}
		catch(Exception e){
			System.out.println("thread interepted");
		
		}
	}

}



class thread1{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a number for limit of prime");
		int n=sc.nextInt();
		
		mult m = new mult();
		prime p= new prime(n);
		p.start();
		m.start();
		
		
		
		
		
		
	}


}

