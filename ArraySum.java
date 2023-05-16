


public class ArraySum {
    public static int totalSum(int[] arr,int index){
        if(index==0){
            return arr[index];
        }
        else{
            return arr[index]+totalSum(arr, index-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={92,23,15,-20,10};
        int n=arr.length;
        System.out.println("Sum of Values: "+totalSum(arr,n-1));
    }
    
}
