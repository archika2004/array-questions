import java.util.Arrays;
public class TripletsSum0 {
    public static void main(String[] args) {
        int nums[]={-1,2,-1,3,0,4};
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                    }
                }
            }
        }
    }
}
