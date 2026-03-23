public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        twoSum obj=new twoSum();
        int[] result=obj.twoSum(nums,6);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}
