import java.sql.SQLOutput;
import java.util.Scanner;

public class factorialrecursion {

    public static long myfact(int n){
        if(n>=1){
            return n *myfact(n-1);
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to find its Factorial: ");
        int num = sc.nextInt();
        System.out.println( "Factorial is: "+myfact(num));
    }
}
