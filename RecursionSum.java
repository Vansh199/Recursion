import java.util.Scanner;
//time complexity=O(logn)
//space complexity=O(n)
public class RecursionSum{

    public static int findSum(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n%10 + findSum(n/10));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digits");
        int n=sc.nextInt();
        sc.close();
        int result=findSum(n);
        System.out.println("Sum of Digits in "+n+" is: "+result);
    }
}