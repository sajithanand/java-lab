import java.util.*;


class exp2 {
	
	public static void main(String args []) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the rows columns:");
		System.out.print("rows :");
		int rows=obj.nextInt();
		System.out.print("columns :");
		int cols=obj.nextInt();
		
		int array1[][]= new int[rows][cols];
		int array2[][]= new int[rows][cols];
		
		System.out.println("Enter the elements in the matrix:");
		for (int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				array1[i][j]=obj.nextInt();
				
			}
			
		}
		for (int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				array2[i][j]=array1[j][i];
				
			}
			
		}
		
		if(Arrays.deepEquals(array1, array2))
		{
			System.out.println("It is a symmetric matrix");
		}
		else{
			System.out.println("It is not a symmetric matrix");
		}
			
			
		
		
}
}

