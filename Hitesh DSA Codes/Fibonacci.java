public class Fibonacci {
    static int n1 = 0 ,n2 = 1,n3 = 0;

    static void printfibonachi(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printfibonachi(count-1);
        }
    }

    public static void main(String[] args){
        int num = 8;
        System.out.print(n1+" "+n2);
        printfibonachi(num-2);
        System.out.println("/n");
        System.out.println("Last Value is : "+n3);
    }
}
