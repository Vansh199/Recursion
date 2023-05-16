import java.util.Scanner;


public class Sum {
    public static int sum(int n,int i){
        if(i==n+1){
            return 0;
        }
        if(i%2==0){
            return sum(n,i+1)-i;
        }
        else{
            return sum(n, i+1)+i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        sc.close();
        int result=sum(n,1);
        System.out.println("sum of Natural Numbers with Alternate signs: "+result);
    }
}
