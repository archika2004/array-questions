import java.util.Arrays;
public class MajorityElement {
    // public static void main(String[] args) {
    //     int nums[]={1,2,3,4,2,5,2};
    //     Arrays.sort(nums);
    //     System.out.println(nums[nums.length/3]);
    // }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,2,5,2};
        Arrays.sort(nums);
        int count=1;
        int maxCount=1;
        int element=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>maxCount){
                maxCount=count;
                element=nums[i];
            }
        }
        System.out.println(element);
    }
}
