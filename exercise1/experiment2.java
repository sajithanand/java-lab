import java.util.Scanner;
class cube {
           public static void main(String args[]) {
           Scanner n = new Scanner(System.in);
           System.out.println("enter a number: ");
           int num = n.nextInt();
           System.out.println("list of cubes:");

            for(int i=1;i<=num;i++){
               System.out.println(Math.pow(i, 3));
           }
    }
}
            
