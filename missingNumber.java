public class missingNumber {
    public static void main(String[] args) {
        int nums[]={1,2,3,5,6};
        int n=nums.length+1;
        int totalSum=(n*(n+1))/2;
        int arrSum=0;
        for(int i=0;i<nums.length;i++){
            arrSum+=nums[i];
        }
        System.out.println("missing number="+(totalSum-arrSum));
    }
}
