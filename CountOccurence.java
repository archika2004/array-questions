public class CountOccurence {
    public static void main(String[] args) {
        int[] nums={1,2,2,2,2,3,4};
        int target=2,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
