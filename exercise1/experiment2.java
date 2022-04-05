import java.util.Scanner;

 class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for (int i=1;i<=num;i++){
            System.out.println("Number is : "+i+" and cube of "+i+" is : "+(i*i*i));
        }
    }
}

/**
OUTPUT

Enter the number: 5
Number is : 1 and cube of 1 is : 1
Number is : 2 and cube of 2 is : 8
Number is : 3 and cube of 3 is : 27
Number is : 4 and cube of 4 is : 64
Number is : 5 and cube of 5 is : 125
**/
