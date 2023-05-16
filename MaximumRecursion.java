




public class MaximumRecursion {
    public static int max(int[] arr,int n,int index){
        if(index==n-1){
            return arr[n-1];
        }
        int maxOfLaterIndices=max(arr, n, index+1);
        int maxValue=Math.max(arr[index], maxOfLaterIndices);
        return maxValue;
    }
    public static void main(String[] args) {
        int[] arr={13,1,-3,22,5};
        int n=arr.length;
        System.out.println("Maximum Value is: "+max(arr,n,0));
    }
    
}
