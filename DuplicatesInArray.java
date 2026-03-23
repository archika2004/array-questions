import java.util.Arrays;
public class DuplicatesInArray {
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    count++;
                }
        }
        return (count!=0)?true:false;
    }
    public static void main(String[] args) {
        int nums[]={1,3,2,4,5,2,1};
        DuplicatesInArray obj=new DuplicatesInArray();
        System.out.println(obj.containsDuplicate(nums));
    }
}
